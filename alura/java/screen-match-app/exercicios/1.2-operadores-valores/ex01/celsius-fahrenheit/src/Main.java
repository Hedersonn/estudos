/*Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
 */

public class Main {
    public static void main(String[] args) {
        //valor de celsius
        double celsius = 24;

        //formula de celsius para fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        //mostrar a conversao
        System.out.println(celsius + "° C = " + fahrenheit + "° F");
    }
}