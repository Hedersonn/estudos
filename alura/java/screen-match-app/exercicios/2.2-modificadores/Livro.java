//Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um metodo exibirDetalhes que imprime o título e o autor do livro.

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    void exibirDetalhes() {
        System.out.printf("Título: %s\nAutor: %s\n", titulo, autor);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("The Little Prince", "Antoine de Saint-Exupéry");
        livro1.exibirDetalhes();
    }
}
