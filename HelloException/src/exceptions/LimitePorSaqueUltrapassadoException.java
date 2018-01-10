package exceptions;

public class LimitePorSaqueUltrapassadoException extends RuntimeException {

    public LimitePorSaqueUltrapassadoException() {
        super("Limite por saque ultrapassado!");
    }
}
