public class ProdutoPerecivel extends ProdutoV4 {
    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel iogurte = new ProdutoPerecivel("Batavo", 15, 5, "25-12-2025");
        System.out.println(iogurte);
    }
}
