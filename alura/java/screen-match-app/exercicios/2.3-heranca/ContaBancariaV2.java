//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaBancariaV2 {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {

        if (valor > saldo) {
            System.out.println("Dinheiro insuficiente! Digite outro valor.");
        } else {
            saldo -= valor;
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

class ContaCorrente extends ContaBancariaV2 {
    private double tarifaMensal = 35;
    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa Mensal de R$" + tarifaMensal + " cobrada. Saldo atual: R$" + saldo);
    }
}

class TesteContaCorrente {
    public static void main(String[] args) {
        ContaBancariaV2 conta = new ContaBancariaV2();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(110);
        contaCorrente.consultarSaldo();
    }
}