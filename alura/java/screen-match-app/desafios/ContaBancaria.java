import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Hederson Mendes Rigonatii";
        String tipoConta = "Corrente";
        double saldoInicial = 200;
        int escolhaUsuario = 0;
        boolean rodando = true;

        //Mostra os dados iniciais do usuário.
        System.out.printf("""
                    Dados do Usuário
                    Nome: %s
                    Tipo de Conta: %s
                    Saldo Inicial: %.2f""", nome, tipoConta, saldoInicial);


        while (rodando) {
            //Mostra opções disponíveis e pede entrada de usuário.
            System.out.println("""
                    \n
                    Operações
                    
                    1 - Consultar Saldo;
                    2 - Depositar Dinheiro;
                    3 - Sacar dinheiro;
                    4 - Sair.
                    """);
            escolhaUsuario = leitor.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.printf("\nO saldo atual é de: R$%.2f\n", saldoInicial);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$");
                    double adicionarValor = leitor.nextDouble();
                    saldoInicial += adicionarValor;
                    System.out.printf("\nSaldo atualizado: R$%.2f\n", saldoInicial);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$");
                    double removerValor = leitor.nextDouble();
                    if (removerValor > saldoInicial) {
                        System.out.println("Não há saldo suficiente para fazer o saque!");
                        break;
                    } else {
                        saldoInicial -= removerValor;
                        System.out.printf("Saldo atualizado: R$%.2f", saldoInicial);
                    }
                    break;
                case 4:
                    rodando = false;
            }

        }
    }
}
