# exercicio 1 - Solicite ao usuário que insira um número e, em seguida, use uma estrutura if else para determinar se o número é par ou ímpar.

escolha = int(input("Digite um numero: "))

if escolha % 2 == 0:
    print("O número que digitou é par!")

else:
    print("O número que digitou é ímpar")