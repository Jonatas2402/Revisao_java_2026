package projetos.projeto01.exception;

public class EntidadeNaoEncontradaException extends RuntimeException{
    public EntidadeNaoEncontradaException(String message) {
        super(message);
    }
}
