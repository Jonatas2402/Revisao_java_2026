package OO.abstracao;

public class Pricipal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua esmeralda", "Recife",
                "10", "PE", "123456798",
                "João alberto da silva", "000000000", "Atendente");

        Cliente joana = new Cliente("Rua das roas", "Rio de janeiro",
                "RJ","12345678", "Joana da silva",
                "0000000000");

        System.out.println(joana);
        joana.mostrarEndereco();
        System.out.println();
        System.out.println(joao);
        joao.mostrarEndereco();
    }
}
