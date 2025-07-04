package org.cleosilva.nivel2.desafio1;

public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
    }

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
