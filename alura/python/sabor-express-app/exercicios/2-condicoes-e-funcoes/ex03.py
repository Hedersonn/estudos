# exercicio 3 - Solicite um nome de usuário e uma senha e use uma estrutura if else para verificar se o nome de usuário e a senha fornecidos correspondem aos valores esperados determinados por você.

nome_escolhido = "Hederson"
senha_escolhida = "1234"

nome = str(input("Digite o nome: "))
senha = str(input("Digite a senha: "))

if nome == nome_escolhido and senha == senha_escolhida:
    print("Acesso Liberado!")
else:
    print("Acesso Negado!")