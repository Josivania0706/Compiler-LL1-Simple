from table_symbols import TableSymbols

class Lexer():
  def __init__(self, input):

    self.literalNames = [ "class", "{", "public", "static", "void", "main", 
      "(", "String", "[", "]", ")", "}", "extends", 
      ";", "return", ",", "int", "boolean", "if", "else", 
      "while", "System", "out", "println", "=", "&&", "<", "==", 
      "!=", "+", "-", "*", "/", "!", "true", "false", 
      "new", ".", "length", "this" ]
    
    self.OperatorsPointing = ['(', ')', '[', ']', '{', '}', ';', '.', ',', '=', '<', 
      '==', '!=', '+', '-', '*', '/', '&&', '!']

    self.table_simbols = TableSymbols()
    self.input = input
    self.output = []
    self.SetInput()
    self.AddTokens()
    self.table_simbols.print()
    self.getOutput()

# ['/*', '//', 'esse', ' ', '\n', 'é', ' ', '\n', 'um', ' ', '\n', 'comentario', '*/', '\n', '\n', '//', ' ', 'este', ' ', 'é', ' ', 'outro', ' ', 'comentario', '\n', '\n', 'class', ' ', 'Factorial', '{', '\n', ' ', ' ', ' ', ' ', 'public', ' ', 'static', ' ', 'void', ' ', 'main', '(', 'String', '[', ']', ' ', 'a', ')', '{', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'System', '.', 'out', '.', 'println', '(', 'new', ' ', 'Fac', '(', ')', '.', 'ComputeFac', '(', '10', ')', ')', ';', '\n', ' ', ' ', ' ', ' ', '}', '\n', '}', '\n', '\n', 'class', ' ', 'Fac', ' ', '{', '\n', ' ', ' ', ' ', ' ', 'public', ' ', 'int', ' ', 'ComputeFac', '(', 'int', ' ', 'num', ')', '{', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'int', ' ', 'numaux', ';', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'if', ' ', '(', 'num', ' ', '<', ' ', '157', ')', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'num_aux', ' ', '=', ' ', '1', ';', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'else', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'num_aux', ' ', '=', ' ', 'num', ' ', '*', ' ', '(', 'this', '.', 'ComputeFac', '(', 'num', '-', '1', ')', ')', ';', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'return', ' ', 'num_aux', ';', '\n', ' ', ' ', ' ', ' ', '}', '\n', '}', '\n', '\n', 'class', ' ', 'Fac2', ' ', 'extends', ' ', 'outraFuncao', '{', '\n', ' ', ' ', ' ', ' ', 'public', ' ', 'int', ' ', 'ComputeFac', '(', 'int', ' ', 'num', ')', '{', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'if', ' ', '(', 'num', ' ', '<', ' ', '1', ')', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'num', '-', 'aux', ' ', '=', ' ', '1', ';', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'else', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'num', '-', 'aux', ' ', '=', ' ', 'num', ' ', '*', ' ', '(', 'this', '.', 'ComputeFac', '(', 'num', '-', '1', ')', ')', ';', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'return', ' ', 'num', '-', 'aux', ';', '\n', ' ', ' ', ' ', ' ', '}', '\n', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'int', ' ', 'numaux', ';', '\n', '}', '\n', '//', ' ', 'outro', ' ', 'comentario', '\n', '\n']
  def getOutput(self):
    return self.output

  def AddTokens(self):
    count_line = 0
    count_column = 0
    index = 0
    while True:
      print(index, self.input[index])
      if self.isComment(index):
        index = self.isComment(index)
        count_line, count_column = self.Position(index)
        continue
      
      if self.isLiteralNames(self.input[index]):
        self.table_simbols.AddToken(type="LITERALNAMES", 
            token=self.input[index], line=count_line, column=count_column)
        self.output.append(self.input[index])
      elif self.isNumber(self.input[index]):
        self.table_simbols.AddToken(type="NUMBER", 
            token=self.input[index], line=count_line, column=count_column)
        self.output.append("NUMBER")
      elif self.isID(self.input[index]):
        self.table_simbols.AddToken(type="ID", 
            token=self.input[index], line=count_line, column=count_column)
        self.output.append("ID")
      elif " " in self.input[index]: pass
      elif "\n" in self.input[index]: pass
      elif "*/" in self.input[index]: pass
      else: exit(-1)

      index += 1
      count_line, count_column = self.Position(index)
      if index == len(self.input) - 1: break
  
  def Position(self, index):
    count_line = 0
    count_column = 0
    for i in range(0, index + 1):
      element = self.input[i]
      if "\n" in element: 
        count_line += 1
        count_column = 0
        continue
      
      count_column += len(element)
    return count_line, count_column
  
  def isComment(self, index):
    element = self.input[index]

    if "/*" in element:
      for e in range(index, len(self.input)): 
        if "*/" in self.input[e]:
          return e
    if "//" in element:
      for e in range(index, len(self.input)): 
        if "\n" in self.input[e]:
          return e 
  
  def isLiteralNames(self, symbol):
    if symbol in self.literalNames: return True
    return False

  def isNumber(self, symbol):
    if symbol.isnumeric(): return True
    return False
  
  def isID(self, symbol):
    if not symbol[0].isalpha(): return False

    for e in symbol:
      if e.isalpha(): continue
      if e.isalnum(): continue
      if "-" in e: continue
      if "_" in e: continue
      return False
    return True

    
  def SetInput(self):
    self.SeparateSpace()
    print("Separação por espaços:", self.input, end="\n\n")
    self.SeparateTerminals()
    print(self.input, end="\n\n")
  
  def Next(line, index):
    if index < 0 or index >= len(line) - 1: return False
    return line[index + 1]
    
  def SeparateSpace(self):
    aux_input = []
    for line in self.input:
      while line:
        index = line.find(" ")

        if index >= 0:
          if index == 0: aux_input.append(" ")
          else: 
            aux_input.append(line[:index])
            line = " " + line
          line = line[index + 1:]
          continue
          
        aux_input.append(line)
        line = ""

    self.input = aux_input
  
  def SeparateTerminals(self):
    aux_input = []
    for element in self.input:
      interval = self.SeparateComment(element)
      if interval:
        for i in interval:  
         aux_input.append(i)
      else: aux_input.append(element)
    self.input = aux_input

    print("removendo comentarios", self.input, end="\n\n")

    aux_input_ = self.input
    aux_input = []
    while(aux_input != aux_input_):
      aux_input_ = self.input
      aux_input = []
      for element in aux_input_:
        interval = self.SeparatePointing(element)
        if interval:
          for i in interval:  
            aux_input.append(i)
        else: aux_input.append(element)
      
      self.input = aux_input
    
    self.input = aux_input    

  def SeparateComment(self, element):
    aux_input = []
    for comment in ["//", "/*", "*/", "\n"]:
      index = element.find(comment)
      if index >= 0:
        if index > 0: aux_input.append(element[:index])
        aux_input.append(element[index:index + 2])
        if index < len(element) - 2: aux_input.append(element[index + 2:])
        break
    
    return aux_input
  
  def SeparatePointing(self, element):
    aux_input = []
    for pointing in self.OperatorsPointing:
      if "//" in element: continue
      if "/*" in element: continue
      if "*/" in element: continue

      index = element.find(pointing)
      if index >= 0:
        if index > 0: aux_input.append(element[:index])
        aux_input.append(element[index:index + len(pointing)])
        if index < len(element) - len(pointing): aux_input.append(element[index + len(pointing):])
        break
    
    return aux_input

"""
aux_input = []
    for l, line in enumerate(self.input):
      let = []
      for c, column in enumerate(line):
        print(column)
        next = self.Next(line, c)
        if column.isalpha():
          if next.isalpha() or next.isalnum() or next in "-" or next in "_":
"""