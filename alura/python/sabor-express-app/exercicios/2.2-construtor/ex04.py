# Crie uma classe chamada Cliente e pense em 4 atributos. Em seguida, instancie 3 objetos desta classe e atribua valores aos seus atributos através de um método construtor.

class Cliente:
    def __init__(self, nome, valor, avaliacao, idade):
        self.nome = nome
        self.valor = valor
        self.avaliacao = avaliacao
        self.idade = idade


cliente1 = Cliente("Priscila", 24.90, 4, 32)
cliente2 = Cliente("Joaquim", 64.75, 5, 26)
cliente3 = Cliente("Henrique", 6, 3, 10)