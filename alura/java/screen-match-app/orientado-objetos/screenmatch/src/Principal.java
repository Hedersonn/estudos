import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracao(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.calcularMedia());
    }
}
