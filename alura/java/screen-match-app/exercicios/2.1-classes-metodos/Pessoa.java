//Crie uma classe Pessoa com um metodo que exibe ""Ola Mundo na tela.
public class Pessoa {
    String nome;

    void mensagem(){
        System.out.println("Olá Mundo!");
    }

    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Hederson";

        System.out.print(eu.nome + " > ");
        eu.mensagem();
    }
}
