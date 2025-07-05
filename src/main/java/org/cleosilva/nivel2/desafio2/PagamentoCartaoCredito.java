package org.cleosilva.nivel2.desafio2;

public class PagamentoCartaoCredito implements ProcessadorDePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Processando pagamento com Cartão de Crédito no valor de %.2f \n", valor);
    }
}
