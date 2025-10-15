//Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o metodo converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.48;
    }
}

interface ConversaoFinanceira {
    double converterDolarParaReal(double dolar);
}

class TesteConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda converter = new ConversorMoeda();
        System.out.println(converter.converterDolarParaReal(11));

    }
}
