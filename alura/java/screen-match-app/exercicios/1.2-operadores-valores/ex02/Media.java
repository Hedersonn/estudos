//Crie um programa que realize a média de duas notas decimais e exiba o resultado.

public class Media {
    public static void main(String[] args) {
        int notaUm = 12;
        int notaDois = 90;
        int media = notaUm + notaDois / 2;
        System.out.println("A média das notas %s e %s é de %s".formatted(notaUm, notaDois, media));
    }
}