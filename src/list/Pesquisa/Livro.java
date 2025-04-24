package list.Pesquisa;

public class Livro {
    // atributos
    private String titulo;

    private String autor;

    private int anoPublicacao;
    // construtor  - quando for cirado um objeto do tipo livro -> titulo, autor , ano de
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //metodo get para retornar atributos privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //metodo to string para quando precisa imprimi , nao aparece o endereco de memoria
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
