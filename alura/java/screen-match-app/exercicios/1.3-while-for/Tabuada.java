/*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero = new Scanner(System.in).nextInt();

        System.out.println("Tabuada do " + numero);
        for (int i = 1; i < 11; ++i) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}