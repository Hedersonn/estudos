# Crie uma classe chamada Livro com um construtor que aceita os parâmetros titulo, autor e ano_publicacao. Inicie um atributo chamado disponivel como True por padrão.

# Na classe Livro, adicione um método especial str que retorna uma mensagem formatada com o título, autor e ano de publicação do livro. Crie duas instâncias da classe Livro e imprima essas instâncias.

# Adicione um método de instância chamado emprestar à classe Livro que define o atributo disponivel como False. Crie uma instância da classe, chame o método emprestar e imprima se o livro está disponível ou não.

# Adicione um método estático chamado verificar_disponibilidade à classe Livro que recebe um ano como parâmetro e retorna uma lista dos livros disponíveis publicados nesse ano.


class Livro:

    livros = []
    def __init__(self, titulo, autor, ano_publicacao):
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacao = ano_publicacao
        self.disponivel = True
        Livro.livros.append(self)

    
    def emprestar(self):
        if not self.disponivel:
            return "Livro não disponível."
        self.disponivel = False


    @staticmethod
    def verificar_disponibilidade(ano):
        livros_disponiveis = [livro for livro in Livro.livros if livro.ano_publicacao == ano and livro.disponivel]

        return livros_disponiveis



    def __str__(self):
        return(f"\nTítulo: {self.titulo}\nAutor: {self.autor}\nAno de Publicação: {self.ano_publicacao}")
    

# book1 = Livro("Learning Python", "David Ascher", 1999)
# book2 = Livro("Fluent Python", "Luciano Ramalho", 2015)

# print(book1, "\n", book2)

# book3 = Livro("Python Cookbook", "Samuel Developer", 2019)
# print(book3)
# print(f"Antes de emprestar: Livro disponível? {book3.disponivel}")
# book3.emprestar()
# print(f"Depois de emprestar: Livro disponível? {book3.disponivel}")
