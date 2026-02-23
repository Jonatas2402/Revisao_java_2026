package exercicios.ex4;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Jonatas", 500.0);

        conta.depositar(500);
        System.out.println(conta);
        conta.sacar(1200);
        System.out.println(conta);

    }
}
