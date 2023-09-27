package exerciciosNelioAlves.secao15_tratamento_de_excecoes.aula173.model.exceptions;

public class DomainException extends RuntimeException {

    public DomainException(String msg) {
        super(msg);
    }
}
