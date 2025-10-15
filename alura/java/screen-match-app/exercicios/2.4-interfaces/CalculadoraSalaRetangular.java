//Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public double calcularArea(double altura, double largura) {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return 2 * (altura + largura);
    }
}

interface CalculoGeometrico {
    double calcularArea(double altura, double largura);
    double calcularPerimetro(double altura, double largura);
}

class TesteCalculadoraSalaRetangular {
    public static void main(String[] args) {
        CalculadoraSalaRetangular calcularRetangulo = new CalculadoraSalaRetangular();
        System.out.println(calcularRetangulo.calcularArea(10, 5));
        System.out.println(calcularRetangulo.calcularPerimetro(10, 5));
    }
}
