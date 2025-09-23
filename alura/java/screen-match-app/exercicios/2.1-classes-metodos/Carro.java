/*Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
 */

import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.printf("%s | %d | %s\n", modelo, ano, cor);
    }

    void calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        int anoDoCarro = anoAtual - ano;

        System.out.println("O carro tem " + anoDoCarro + " anos.");
    }

    public static void main(String[] args) {
        Carro toyota = new Carro();
        toyota.modelo = "Toyota";
        toyota.ano = 2008;
        toyota.cor = "Vermelho";

        toyota.fichaTecnica();
        toyota.calcularIdade();
    }
}
