# exercicio 2 - Utilizando o dicionário criado no item 1:

# Modifique o valor de um dos itens no dicionário (por exemplo, atualize a idade da pessoa);
# Adicione um campo de profissão para essa pessoa;
# Remova um item do dicionário.

pessoa = {
    "nome": "Hederson",
    "idade": 16,
    "cidade": "Londrina"
}

pessoa["idade"] = 17
pessoa["profissao"] = "Sushiman"
del pessoa["cidade"]
