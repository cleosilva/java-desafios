package org.cleosilva.nivel2.desafio1;

public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes(){
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
        System.out.println(getAutor());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                '}';
    }
}
