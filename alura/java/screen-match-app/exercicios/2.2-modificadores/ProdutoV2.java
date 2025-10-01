//Desenvolva uma classe ProdutoV2 com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

public class ProdutoV2 {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void aplicarDesconto(int percentual) {
        preco -= (preco * percentual) / 100;
        System.out.printf("R$%.2f", preco);
    }

    public static void main(String[] args) {
        ProdutoV2 produto = new ProdutoV2();
        produto.setNome("Celular");
        produto.setPreco(2999);
        produto.aplicarDesconto(10);
    }
}