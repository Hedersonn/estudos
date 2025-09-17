/*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
 Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double medida;
        double area;
        int opcao = 0;

        while (opcao != 1 || opcao != 2) {
            System.out.print("""
                    Digite:
                    1. Calcular área do círculo.
                    2. Calcular área do quadrado.
                    > """);
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.print("Raio do círculo: ");
                medida = leitor.nextDouble();
                area = 3.14159 * (Math.pow(medida, 2));
                System.out.printf("Área do círculo: %.2f%n", area);
                break;
            } else if (opcao == 2) {
                System.out.print("Comprimento do quadrado: ");
                medida = leitor.nextDouble();
                area = Math.pow(medida, 2);
                System.out.printf("Área do quadrado: %.2f%n", area);
                break;
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }
        }
    }
}