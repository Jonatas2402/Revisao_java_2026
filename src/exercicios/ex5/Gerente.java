package exercicios.ex5;

public class Gerente extends Funcionario{

    double bonus = 20.0 / 100;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return getSalario() * 0.20;
    }
}
