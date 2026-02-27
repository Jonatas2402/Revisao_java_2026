package projetos.projeto01;

import exercicios.exercicios_exceptions.ex03.SaldoInsuficienteException;
import projetos.projeto01.exception.EntidadeNaoEncontradaException;
import projetos.projeto01.exception.ValorInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;
    private Tipo tipo;
    private double limite;
    List<Movimentacao> extrato;

    public Conta(int numeroConta, String titular, double saldo, Tipo tipo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipo = tipo;
        if (tipo.equals(Tipo.POUPANCA)) {
            this.limite = 0;
        }
        this.limite = limite;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public void deposito(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("O VALOR NÃO PODE SER MENOR OU IGUAL A ZERO" + valor);
        }
        saldo += valor;
        extrato.add(new Movimentacao("DEPOSITO", valor));
    }

    public void sacar(double valor) {
        if (valor <= 0){
            throw new ValorInvalidoException("VALOR INVALIDO PARA SAQUE");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("O SALDO DE " + saldo + " É INSUFICIENTE PARA SAQUE");
        }
        saldo -= valor;
        extrato.add(new Movimentacao("SAQUE", valor));
    }

    public void transferir(Conta destino, String titular, double valor){
        if (destino == null || titular == null){
            throw new EntidadeNaoEncontradaException("CONTA OU TITULAR NÃO ENCONTRADOS");
        }
        if (valor <= 0){
            throw new ValorInvalidoException("TRANSFERÊNCIA DEVE SER MAIOR QUE 0");
        }
        this.sacar(valor);
        destino.deposito(valor);

        extrato.add(new Movimentacao("TRANSFERÊNCIA REALIZADA", valor));
        destino.extrato.add(new Movimentacao("TRANSFERÊNCIA RECEBIDA", valor));
    }
    public void mostrarExtrato(){
        System.out.println("Exrato de conta: " + numeroConta);
        for (Movimentacao m: extrato){
            System.out.println(m);
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public List<Movimentacao> getExtrato() {
        return extrato;
    }

    public void setExtrato(List<Movimentacao> extrato) {
        this.extrato = extrato;
    }
}
