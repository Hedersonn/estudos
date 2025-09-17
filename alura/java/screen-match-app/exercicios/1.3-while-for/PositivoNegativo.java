/*Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        System.out.print("Digite um número e descubra se é positivo ou negativo: ");
        int numero = new Scanner(System.in).nextInt();
        if (numero >= 0) {
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }
    }
}