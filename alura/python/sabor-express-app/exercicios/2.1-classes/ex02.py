# 1 - Atribua o valor 'Italiana' ao atributo categoria da instância restaurante_praca da classe Restaurante.
# 2 - Acesse o valor do atributo nome da instância restaurante_praca da classe Restaurante.
# 3 - Verifique o valor inicial do atributo ativo para a instância restaurante_praca e exiba uma mensagem informando se o restaurante está ativo ou inativo.
# 4 - Acesse o valor do atributo de classe categoria diretamente da classe Restaurante e armazene em uma variável chamada categoria.
# 5 - Altere o valor do atributo nome para 'Bistrô'.
# 6 - Crie uma nova instância da classe Restaurante chamada restaurante_pizza com o nome 'Pizza Place' e categoria 'Fast Food'.
# 7 - Verifique se a categoria da instância restaurante_pizza é 'Fast Food'.
# 8 - Mude o estado da instância restaurante_pizza para ativo.
# 9 - Imprima no console o nome e a categoria da instância restaurante_praca.

class Restaurante:
    nome = ""
    categoria = ""
    ativo = False


restaurante_praca = Restaurante()
restaurante_praca.nome = "Praça"    
restaurante_praca.categoria = "Italiana"
restaurante_praca.nome
print(f"O restaurante {restaurante_praca.nome} está {"ativo" if restaurante_praca.ativo else "inativo"}.")
restaurante_praca.nome = "Bistrô"

categoria = Restaurante.categoria

restaurante_pizza = Restaurante()
restaurante_pizza.nome = "Pizza Place"
restaurante_pizza.categoria = "Fast Food"
print(f"A categoria do restaurante {restaurante_pizza.nome} {"é" if restaurante_pizza.categoria == "Fast Food" else "não é"} 'Fast Food'")
restaurante_pizza.ativo = True

print(f"""Nome: {restaurante_praca.nome}
Categoria: {restaurante_praca.categoria}""")