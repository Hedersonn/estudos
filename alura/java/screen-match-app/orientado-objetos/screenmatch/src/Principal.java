public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracao = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(3);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        System.out.println(meuFilme.avaliacao);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.calcularMedia());

    }
}
