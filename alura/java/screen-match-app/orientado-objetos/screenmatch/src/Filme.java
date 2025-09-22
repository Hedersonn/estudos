public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalAvaliacoes;
    int duracao;

    void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(incluidoNoPlano);
    }
    void avalia(double nota){
        avaliacao += nota;
        totalAvaliacoes++;
    }

    double calcularMedia(){
        return avaliacao / totalAvaliacoes;
    }

}
