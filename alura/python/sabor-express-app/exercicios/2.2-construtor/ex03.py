# 1 - Crie uma classe chamada Restaurante com os atributos nome, categoria, ativo e crie mais 2 atributos. Instancie um restaurante e atribua valores aos seus atributos.
# 2 - Modifique a classe Restaurante adicionando um construtor que aceita nome e categoria como parâmetros e inicia ativo como False por padrão. Crie uma instância utilizando o construtor.
# 3 - Adicione um método especial __str__ à classe Restaurante para que, ao imprimir uma instância, seja exibida uma mensagem formatada com o nome e a categoria. Exiba essa mensagem para uma instância de restaurante.

class Restaurante:
    def __init__(self, nome, categoria, localidade, classe):
        self.nome = nome
        self.categoria = categoria
        self.localidade = localidade
        self.classe = classe
        self.ativo = False

    
    def __str__(self):
        return f"{self.nome} | {self.categoria}"


restaurante_chimarrao = Restaurante("Chimarrão", "Brasileiro", "MG", "Média")
print(restaurante_chimarrao)