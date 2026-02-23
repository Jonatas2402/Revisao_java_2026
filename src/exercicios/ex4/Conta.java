package exercicios.ex4;

public class Conta {
    private String titular;
    private double saldo;


    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Operação não realizada.");
            System.out.println("Valor de " + valor + " é maior que o saldo de " + saldo);
        }else {
            this.saldo -= valor;
        }
    }
    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "titular " + titular
                + " saldo " + saldo;
    }
}
