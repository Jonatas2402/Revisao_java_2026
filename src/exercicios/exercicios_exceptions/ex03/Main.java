package exercicios.exercicios_exceptions.ex03;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Jonatas");

        conta1.adicionarSaldo(500.0);
        conta1.mostrarConta();

        conta1.sacarSaldo(400.0);
        conta1.mostrarConta();
    }
}
