package org.cleosilva.nivel3.desafio1;

/*
* As exceções checked são filas da classe Exception diretamente
* Essas exceções não forem tratadas, lançaram um erro em tempo de compilação,
* ou seja, se código não será compilado.
*
* Requisito do desafio: criar uma exceção personalizada (checked) checada.
* */
public class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String message) {
        super(message);
    }
}
