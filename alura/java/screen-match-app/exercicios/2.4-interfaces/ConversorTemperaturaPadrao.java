//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}


interface ConversorTemperatura {
    double celsiusParaFahrenheit(double celsius);
    double fahrenheitParaCelsius(double fahrenheit);
}

class TesteTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();

        System.out.println(conversorTemperatura.celsiusParaFahrenheit(32));
        System.out.println(conversorTemperatura.fahrenheitParaCelsius(98.6));
    }
}
