//Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o metodo mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

public class TabuadaMultiplicacao implements TabuadaInterface{
    @Override
    public void mostrarTabuada(int numeroTabuada) {
        for (int i = 1; i < 11; i++) {
            int numeroMultiplicado = numeroTabuada * i;
            System.out.printf("%d x %d = %d\n", numeroTabuada, i, numeroMultiplicado);
        }
    }
}

interface TabuadaInterface {
    void mostrarTabuada(int numeroTabuada);
}

class TesteTabuada {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(10);
    }
}