# Crie um arquivo e importe a classe Livro neste arquivo.

# No arquivo, empreste o livro chamando o método emprestar e imprima se o livro está disponível ou não após o empréstimo.

# No arquivo, utilize o método estático verificar_disponibilidade para obter a lista de livros disponíveis publicados em um ano específico.

# instancie dois objetos da classe Livro e exiba a mensagem formatada utilizando o método str.

from ex01 import Livro

book1 = Livro("Learning Python", "David Ascher", 1999)
book2 = Livro("Fluent Python", "Luciano Ramalho", 2015)

book2.emprestar()

livros_disponiveis = Livro.verificar_disponibilidade(2015)
for livro in livros_disponiveis:
    print(livro)

print(book1)
print(book2)