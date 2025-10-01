/*Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos.
Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.
 */

public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void verificarIdade() {
        if (idade < 18) {
            System.out.println(nome + " é menor de idade!");
        } else {
            System.out.println(nome + " é maior de idade!");
        }
    }

    public static void main(String[] args) {
        IdadePessoa eu = new IdadePessoa();
        eu.setIdade(18);
        eu.setNome("Hederson");
        eu.verificarIdade();
    }
}
