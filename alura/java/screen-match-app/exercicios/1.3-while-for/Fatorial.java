//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

import java.util.Arrays;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        System.out.print("Digite um número para descobrir seu fatorial: ");
        int numero = new Scanner(System.in).nextInt();
        int fatorial = 1;

        System.out.print(numero + "! = ");
        for (int i = numero; i > 0; i--) {
            System.out.print(i);

            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print(" x ");
            }
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}