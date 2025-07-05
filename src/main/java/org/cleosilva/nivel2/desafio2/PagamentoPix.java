package org.cleosilva.nivel2.desafio2;

public class PagamentoPix implements ProcessadorDePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Processando pagamento com Pix no valor de %.2f\n", valor);
    }
}
