package org.cleosilva.nivel2.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProcessadorDePagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new PagamentoCartaoCredito());
        pagamentos.add(new PagamentoPix());

        for (ProcessadorDePagamento p : pagamentos){
            p.processarPagamento(50);
        }


    }
}
