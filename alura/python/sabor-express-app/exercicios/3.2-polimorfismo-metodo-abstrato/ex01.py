# Crie uma classe chamada Veiculo com um método abstrato chamado ligar.
# Crie um construtor para a classe Veiculo que aceita os parâmetros marca e modelo.
# Crie uma nova classe chamada Carro que herda da classe Veiculo.
# No construtor da classe Carro, utilize o método super() para chamar o construtor da classe pai e atribua o atributo específico cor à classe filha.
# Instancie três objetos da classe Carro com diferentes características, como marca, modelo e cor.

from abc import ABC, abstractmethod

class Veiculo(ABC):
    def __init__(self, marca, modelo):
        self.marca = marca 
        self.modelo = modelo


    @abstractmethod
    def ligar(self):
        pass

class Carro(Veiculo):
    def __init__(self, marca, modelo, cor):
        super().__init__(marca, modelo)
        self.cor = cor


    def ligar(self):
        return f"Ligando {self.marca} {self.modelo}."

carro1 = Carro(marca="Ford", modelo="Focus", cor="Preto")
carro2 = Carro(marca="Chevrolet", modelo="Cruze", cor="Prata")
carro3 = Carro(marca="Honda", modelo="Civic", cor="Vermelho")

print(f"Carro 1: {carro1.marca} {carro1.modelo}, Cor: {carro1.cor}")
print(f"Carro 2: {carro2.marca} {carro2.modelo}, Cor: {carro2.cor}")
print(f"Carro 3: {carro3.marca} {carro3.modelo}, Cor: {carro3.cor}")

print(carro1.ligar())

    


    
