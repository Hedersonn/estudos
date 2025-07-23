# exercicio 7 - Construa um código que calcule a média dos valores em uma lista. Utilize um bloco try-except para lidar com a divisão por zero, caso a lista esteja vazia.

numeros = []

try:
    contar_numeros = 0
    soma_numeros = 0
    for n in numeros:
        contar_numeros += 1
        soma_numeros += n
    print(f"A media dos numeros e: {soma_numeros / contar_numeros}")

except ZeroDivisionError:
    print("Nao e possivel fazer a media sem numeros na lista.")