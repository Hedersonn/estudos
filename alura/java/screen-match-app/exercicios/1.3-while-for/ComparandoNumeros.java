/*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
 */

import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1 = leitura.nextInt();

        System.out.print("Digite o 2° número: ");
        int n2 = leitura.nextInt();

        if (n1 == n2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.print("Os números são diferentes. E ");

            if (n1 > n2) {
                System.out.println("o primeiro número é maior.");
            } else {
                System.out.println("o segundo número é maior.");
            }
        }
    }
}