package org.cleosilva.nivel2.desafio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ItemBiblioteca> itemList = new ArrayList<>();

        itemList.add(new Livro("Os Lusiadas", 2022, "Camões" ));
        itemList.add(new Revista("Software Moderno", 2024, 12));

        for(ItemBiblioteca i : itemList){
            i.exibirDetalhes();
            System.out.println("--------------");
        }

    }
}
