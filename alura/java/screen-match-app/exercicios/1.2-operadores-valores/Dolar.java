//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

public class Dolar {
    public static void main(String[] args) {
        double valorEmDolar = 19;
        double valorDoReal = 4.94;
        double dolarPraReal = valorEmDolar * valorDoReal;
        String mensagem = "$" + valorEmDolar + " = R$" + dolarPraReal;
        System.out.println(mensagem);
    }
}