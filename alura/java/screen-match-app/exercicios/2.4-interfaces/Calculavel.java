//Crie uma interface Calculavel com um metodo double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais

interface Calculavel {
    double calcularPrecoFinal(double preco);
}

class LivroV2 implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco - (preco * 0.08); //desconto de 8%
    }
}

class ProdutoFisico implements Calculavel {
    @Override
    public double calcularPrecoFinal(double preco) {
        return preco + (preco * 0.08); //taxa de 8%
    }
}

class TesteLivroEProduto {
    public static void main(String[] args) {
        LivroV2 livro = new LivroV2();
        System.out.println(livro.calcularPrecoFinal(100));

        ProdutoFisico produto = new ProdutoFisico();
        System.out.println(produto.calcularPrecoFinal(1000));
    }
}