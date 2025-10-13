//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um metodo específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        int numeroDivisoes = 0;

        for (int i = 1; i < numero + 1; i++) {
            if (numero % i == 0) {
                numeroDivisoes += 1;
            }
        }

        if (numeroDivisoes == 2) {
            return true;
        } else {
            return false;
        }
    }

    public void listarPrimos(int numeroMaximo) {
        for (int i = 1; i < numeroMaximo + 1; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int numero) {

        System.out.print("O número " + numero);
        if (verificarPrimalidade(numero)) {
            System.out.println(" é primo.");
        } else {
            System.out.println(" não é primo.");
        }
    }
}

class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int numeroAnterior) {
        int proximoPrimo = numeroAnterior + 1;

        while (!verificarPrimalidade(proximoPrimo)) {
            proximoPrimo++;
        }
        return proximoPrimo;
    }
}

class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        System.out.println("Próximo número primo: " + gerador.gerarProximoPrimo(17));

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
