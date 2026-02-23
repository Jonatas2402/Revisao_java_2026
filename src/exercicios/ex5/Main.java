package exercicios.ex5;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("João", 1598.10);
        Funcionario g = new Gerente("Jonatas", 2500.0);

        System.out.println("O bônus de " + f.getNome() + " de salario " + f.getSalario() + " é de " + f.calcularBonus());
        System.out.println("O bônus de " + g.getNome() + " de salario " + g.getSalario() + " é de " + g.calcularBonus());

    }
}
