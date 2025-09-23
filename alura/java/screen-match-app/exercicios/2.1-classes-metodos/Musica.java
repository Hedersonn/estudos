/*Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
 e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
 */

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.printf("%s | %s | %d | %.1f", titulo, artista, anoDeLancamento, avaliacao);
    }

    void avaliar(double nota){
        numAvaliacoes++;
        avaliacao += nota;
    }

    double mediaAvaliacao(){
        avaliacao /= numAvaliacoes;
        return avaliacao;
    }

    public static void main(String[] args) {
        Musica another = new Musica();
        another.titulo = "Another Love";
        another.artista = "Tom Odell";
        another.anoDeLancamento = 2013;

        another.avaliar(3);
        another.avaliar(5);
        another.mediaAvaliacao();

        another.exibirFichaTecnica();

    }
}
