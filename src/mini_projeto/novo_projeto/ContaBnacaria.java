package mini_projeto.novo_projeto;

public class ContaBnacaria {
    private int numConta;
    private User titular;
    private double saldo;

    public ContaBnacaria(int numConta, User titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public User getTitular() {
        return titular;
    }

    public void setTitular(User titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
