# Refaça a classe Musica utilizando uma forma mais concisa e expressiva, aproveitando a sintaxe simplificada do Python.

class Musica:
    def __init__(self, artista, nome, duracao):
        self.artista = artista
        self.nome = nome
        self.duracao = duracao

musica1 = Musica("Queen & David Bowie", "Under Pressure", 248)
musica2 = Musica(nome="The Trooper", artista="Iron Maiden", duracao=245)
musica3 = Musica(nome="Hotel California", artista="Eagles", duracao=390)