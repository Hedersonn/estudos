//Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

public class Produto {
    public static void main(String[] args) {
        double precoProduto = 10.99;
        int quantidade = 3;
        double resultado = precoProduto * quantidade;

        System.out.println("O valor total da compra é de R$" + resultado);
    }
}