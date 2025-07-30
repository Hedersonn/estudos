class Restaurante: 
    nome = ""
    categoria = ""
    ativo = False

restaurante_praca = Restaurante()
restaurante_pizza = Restaurante()

restaurante_praca.categoria = "Gourmet"
restaurante_praca.nome = "Praça"
print(vars(restaurante_praca))