/*Crie uma classe AlunoV2 com atributos nome, idade, e um metodo para exibir informações.
Crie uma instância da classe AlunoV2, atribua valores aos seus atributos e utilize o metodo para exibir as informações.
 */

public class Aluno {
    String nome;
    int idade;

    void informacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Cleiton";
        aluno1.idade = 22;

        aluno1.informacoes();
    }
}
