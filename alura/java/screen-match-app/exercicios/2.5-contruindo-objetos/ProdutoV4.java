import java.util.ArrayList;

public class ProdutoV4 {
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return this.getNome() + " R$" + this.getPreco() + " Quantidade: " + this.getQuantidade();
    }

    public ProdutoV4(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ProdutoV4 celular = new ProdutoV4("Redmi Note 13", 1000, 5);
        ProdutoV4 livro = new ProdutoV4("Pequeno Príncipe", 199, 3);
        ProdutoV4 caneta = new ProdutoV4("BIC", 1.99, 10);

        ArrayList<ProdutoV4> produtos = new ArrayList<>(3);

        produtos.add(celular);
        produtos.add(livro);
        produtos.add(caneta);

        System.out.println(produtos.size());
        System.out.println(produtos.get(0).getNome());

        System.out.println(produtos);
    }
}
