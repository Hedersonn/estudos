//Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}

class ProdutoV3 implements Vendavel {
    private double precoUnitario;

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override //por unidade
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= percentualDesconto * (percentualDesconto / 100);
    }
}

class Servico implements Vendavel {
    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override //por hora
    public double calcularPrecoTotal(int quantidade) {
        return valorHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        valorHora -= valorHora * (percentualDesconto / 100);
    }
}


class TesteProdutoEServico {
    public static void main(String[] args) {
        ProdutoV3 produto = new ProdutoV3();
        produto.setPrecoUnitario(200);
        produto.aplicarDesconto(10);
        System.out.println(produto.calcularPrecoTotal(2));

        Servico servico = new Servico();
        servico.setValorHora(10);
        servico.aplicarDesconto(5);
        System.out.println(servico.calcularPrecoTotal(8));

    }
}