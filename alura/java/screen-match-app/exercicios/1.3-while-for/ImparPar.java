//Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int numero = new Scanner(System.in).nextInt();

        System.out.print("O número " + numero + " é ");
        if (numero % 2 == 0) {
            System.out.println("par.");
        } else {
            System.out.println("ímpar");
        }
    }
}