package projetos.projeto01.exception;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
