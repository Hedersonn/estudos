//Crie uma classe Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.

public class Calculadora {
    int dobro(int numero){
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora n1 = new Calculadora();
        System.out.println(n1.dobro(4));
    }
}
