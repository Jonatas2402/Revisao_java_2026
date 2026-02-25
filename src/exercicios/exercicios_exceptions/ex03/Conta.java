package exercicios.exercicios_exceptions.ex03;

public class Conta {
    private String titular;
    private double saldo;

    public void adicionarSaldo(double valor){
        saldo += valor;
    }
    public void sacarSaldo(double valor)  {
        if (valor > saldo){
            throw new  SaldoInsuficienteException("Saldo insufuciente para saque.");
        }else {
            saldo -= valor;
        }
    }
    public void mostrarConta(){
        System.out.println(toString());
    }
    public Conta(String titular) {
        this.titular = titular;
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

    @Override
    public String toString() {
        return "titular " + titular
                + " saldo " + saldo;
    }
}
