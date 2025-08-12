# Crie uma Classe Pai (Veiculo): Implemente uma classe chamada Veiculo com um construtor que aceita dois parâmetros, marca e modelo. A classe deve ter um atributo protegido _ligado inicializado como False por padrão.
# Construa o Método Especial str: Adicione um método especial str à classe Veiculo que retorna uma mensagem formatada com a marca, modelo e o estado de ligado/desligado do veículo.
# Crie uma Classe Filha (Carro): Agora, crie uma classe chamada Carro que herda da classe Veiculo. No construtor da classe Carro, inclua um novo atributo chamado portas que indica a quantidade de portas do carro.
# Implemente o Método Especial str na Classe Filha: Adicione um método especial str à classe Carro que estenda o método da classe pai (Veiculo) e inclua a informação sobre a quantidade de portas do carro.
# Crie uma Classe Filha (Moto): Similarmente, crie uma classe chamada Moto que também herda de Veiculo. Adicione um novo atributo chamado tipo ao construtor, indicando se a moto é esportiva ou casual.
# Implemente o Método Especial str na Classe Filha (Moto): Adicione um método especial str à classe Moto que estenda o método da classe pai (Veiculo) e inclua a informação sobre o tipo da moto.
# Exiba as Informações: Para cada instância, imprima no console as informações utilizando o método str.

class Veiculo:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self._ligado = False


    def __str__(self):
        return f"{self.marca} {self.modelo} | {self.ligado}"
    

    @property
    def ligado(self):
        return "Ligado" if self._ligado else "Desligado"
    

class Carro(Veiculo):
    def __init__(self, marca, modelo, portas):
        super().__init__(marca, modelo)
        self.portas = portas

    
    def __str__(self):
        return f"{super().__str__()} | {self.portas}"
    

class Moto(Veiculo):
    def __init__(self, marca, modelo, tipo):
        super().__init__(marca, modelo)
        self.tipo = tipo


    def __str__(self):
        return f"{super().__str__()} | {self.tipo}"
    

carro1 = Carro("Toyota", "Corolla", 4)
carro2 = Carro("Honda", "Civic", 2)
carro3 = Carro("Ford", "Fusion", 4)

moto1 = Moto("Harley-Davidson", "Street 750", "Esportiva")
moto2 = Moto("Honda", "CB 500", "Casual")
moto3 = Moto("Yamaha", "MT-09", "Esportiva")

print(carro1)
print(carro2)
print(carro3)

print(moto1)
print(moto2)
print(moto3)