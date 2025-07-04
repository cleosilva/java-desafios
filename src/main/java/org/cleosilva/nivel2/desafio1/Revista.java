package org.cleosilva.nivel2.desafio1;

public class Revista extends ItemBiblioteca {
    private int numeroEdicao;

    public Revista(String titulo, int anoPublicacao, int numeroEdicao) {
        super(titulo, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void exibirDetalhes(){
        System.out.println(getTitulo());
        System.out.println(getAnoPublicacao());
        System.out.println(getNumeroEdicao());
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numeroEdicao=" + numeroEdicao +
                '}';
    }
}
