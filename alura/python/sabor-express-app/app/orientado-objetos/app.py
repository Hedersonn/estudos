from modelos.restaurante import Restaurante

restaurante_praca = Restaurante("Praça", "Gourmet")
restaurante_praca.avaliar("Gui", 10)
restaurante_praca.avaliar("Lais", 8)
restaurante_praca.avaliar("Emy", 2)

def main():
    Restaurante.listar_restaurantes()

if __name__ == "__main__":
    main()