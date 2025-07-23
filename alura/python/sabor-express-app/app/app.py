# primeira aplicacao - sabor express

import os

restaurantes = [
    {"nome": "Praca", "categoria": "Japonesa", "ativo": False},
    {"nome": "Pizza Suprema", "categoria": "Pizza", "ativo": True},
    {"nome": "Cantina", "categoria": "Italiano", "ativo": False}
]

def exibir_titulo():
    """Funcao para mostrar o titulo do programa."""

    print("""
      ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─██████████████─██████████████─██████████████───██████████████─████████████████──────██████████████─████████──████████─██████████████─████████████████───██████████████─██████████████─██████████████─
─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░░░██──────██░░░░░░░░░░██─██░░░░██──██░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
─██░░██████████─██░░██████░░██─██░░██████░░██───██░░██████░░██─██░░████████░░██──────██░░██████████─████░░██──██░░████─██░░██████░░██─██░░████████░░██───██░░██████████─██░░██████████─██░░██████████─
─██░░██─────────██░░██──██░░██─██░░██──██░░██───██░░██──██░░██─██░░██────██░░██──────██░░██───────────██░░░░██░░░░██───██░░██──██░░██─██░░██────██░░██───██░░██─────────██░░██─────────██░░██─────────
─██░░██████████─██░░██████░░██─██░░██████░░████─██░░██──██░░██─██░░████████░░██──────██░░██████████───████░░░░░░████───██░░██████░░██─██░░████████░░██───██░░██████████─██░░██████████─██░░██████████─
─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░░░██──────██░░░░░░░░░░██─────██░░░░░░██─────██░░░░░░░░░░██─██░░░░░░░░░░░░██───██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
─██████████░░██─██░░██████░░██─██░░████████░░██─██░░██──██░░██─██░░██████░░████──────██░░██████████───████░░░░░░████───██░░██████████─██░░██████░░████───██░░██████████─██████████░░██─██████████░░██─
─────────██░░██─██░░██──██░░██─██░░██────██░░██─██░░██──██░░██─██░░██──██░░██────────██░░██───────────██░░░░██░░░░██───██░░██─────────██░░██──██░░██─────██░░██─────────────────██░░██─────────██░░██─
─██████████░░██─██░░██──██░░██─██░░████████░░██─██░░██████░░██─██░░██──██░░██████────██░░██████████─████░░██──██░░████─██░░██─────────██░░██──██░░██████─██░░██████████─██████████░░██─██████████░░██─
─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░░░░░██────██░░░░░░░░░░██─██░░░░██──██░░░░██─██░░██─────────██░░██──██░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
─██████████████─██████──██████─████████████████─██████████████─██████──██████████────██████████████─████████──████████─██████─────────██████──██████████─██████████████─██████████████─██████████████─
──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────""")


def exibir_opcoes():
    """Funcao para mostrar as opcoes disponiveis sobre interacao do programa"""

    print("1. Cadastrar restaurante")
    print("2. Listar restaurante")
    print("3. Alternar estado do restaurante")
    print("4. Sair")


def finalizar_app():
    """Finaliza o programa"""

    os.system("clear")
    print("Finalizando app")


def voltar_menu():
    input("Digite uma tecla para voltar ao menu: ")
    main()


def opcao_invalida():
    """Output: Opcao invalida
    Usa-se a funcao 'voltar_menu()'"""

    print("Opcao invalida!")
    voltar_menu()


def exibir_subtitulo(texto):
    """Exibe um subtítulo estilizado na tela 
    Inputs:
    - texto: str - O texto do subtítulo"""

    os.system("clear")
    linha = '*' * (len(texto))
    print(linha)
    print(texto)
    print(linha)


def cadastrar_restaurante():
    """Cadastra restaurantes

    inputs:
    - nome_restaurante: Pede o nome do restaurante
    - categoria_restaurante: Pede a categoria do restaurante

    outputs:
    - dados_restaurante: Guarda os inputs em um dicionario
    - restaurantes.append: Adiciona o dicionario em uma lista com todos os restaurantes"""

    exibir_subtitulo("Cadastro de novos restaurantes")

    nome_restaurante = str(input("Digite o nome do restaurante que deseja cadastrar"))
    categoria_restaurante = str(input(f"Digite a categoria do restaurante {nome_restaurante}: "))
    dados_restaurante = {"nome": nome_restaurante, "categoria": categoria_restaurante, "ativo": False}

    restaurantes.append(dados_restaurante)

    print(f"O restaurante {nome_restaurante} foi cadastrado com sucesso!")

    voltar_menu()


def listar_restaurantes():
    """Lista todos os restaurantes da lista de restaurantes. O for pega todos os dados de cada restaurante, salva em variaveis e printa.
    - ativo_restaurante: Troca o True e False do restaurante['ativo'] para ativado ou desativado(visualmente)"""

    exibir_subtitulo("Listando restaurantes")

    print(f"{'Restaurantes':<22}| {'Categorias':<20}| Ativo\n")

    for restaurante in restaurantes:
        nome_restaurante = restaurante["nome"]
        categoria_restaurante = restaurante["categoria"]
        ativo_restaurante = "ativado" if restaurante["ativo"] else "desativado"

        print(f"- {nome_restaurante:<20}| {categoria_restaurante:<20}| {ativo_restaurante}")

    voltar_menu()


def alternar_estado_restaurante():
    """Alterna o estado do restaurante.
    inputs:
    - nome_restaurante: Pede o nome para a verificacao. Se tiver na lista dos restaurantes, a variavel restaurante_encontrado se torna True. E inverte o estado do restaurante.
    output: Caso nao existir o restaurante. Mostra que nao foi encontrado."""

    exibir_subtitulo("Alternando estado do restaurante")

    nome_restaurante = str(input("Digite o nome do restaurante: "))
    restaurante_encontrado = False
    
    for restaurante in restaurantes:
        if nome_restaurante == restaurante["nome"]:
            restaurante_encontrado = True
            restaurante["ativo"] = not restaurante["ativo"]
            print(f"O restaurante foi {'ativado' if restaurante["nome"] else 'desativado'} com sucesso.")
    if not restaurante_encontrado:
        print(f"Restaurante {nome_restaurante} nao encontrado.")
    voltar_menu()

def escolher_opcao():
    """Escolhe as opcoes disponiveis."""

    try:
        opcao_escolhida = int(input("Escolha uma opção: "))

        if opcao_escolhida == 1:
            cadastrar_restaurante()
        elif opcao_escolhida == 2:
            listar_restaurantes()
        elif opcao_escolhida == 3:
            alternar_estado_restaurante()
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except:
        opcao_invalida()


def main():
    """Funcao principal, roda todas as outras funcoes."""

    os.system("clear")
    exibir_titulo()
    exibir_opcoes()
    escolher_opcao()


if __name__ == "__main__":
    main()