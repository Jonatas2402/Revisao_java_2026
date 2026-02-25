package exercicios.exercicios_exceptions.ex02;

public class ValidarIdade {
    public void validarIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade ivalida");
        }
    }
}
