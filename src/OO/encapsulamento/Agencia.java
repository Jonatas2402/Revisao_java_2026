package OO.encapsulamento;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Jonatas", 1500.00);

        /*Utilizando get e set podemos alterar algo errado.*/

        minhaConta.setTitular("Jonatas Silva");

        minhaConta.setSaldo(minhaConta.getSaldo() + 700.00);

        String titularDaConta = minhaConta.getTitular();
        double saldoDaConta = minhaConta.getSaldo();

        System.out.println("O titular da conta é: " + titularDaConta + " e o saldo final é: " + saldoDaConta);

        ContaBancaria conta1 = new ContaBancaria("João");

        System.out.println("O titular da conta é: " + conta1.getTitular() + " e o saldo final é: " + conta1.getSaldo());

    }
}
