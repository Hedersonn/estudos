# exercicio 6 - Crie uma lista de números e utilize um loop for para calcular a soma de todos os elementos. Utilize um bloco try-except para lidar com possíveis exceções.

numeros = [1, 4, 10, "2", 21]

try:
    soma = 0
    for n in numeros:
        soma += n
    print(soma)
except Exception as e:
    print(f"Ocorreu um erro: {e}")
