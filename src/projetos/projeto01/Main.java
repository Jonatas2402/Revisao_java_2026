package projetos.projeto01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Conta> contas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numero) {
                return c;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Ver saldo");
            System.out.println("6 - Extrato");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Numero: ");
                        int numero = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Titular: ");
                        String titular = sc.nextLine();

                        Conta conta = new Conta(numero, titular, 0, Tipo.CORRENTE);
                        contas.add(conta);

                        System.out.println("Conta criada!");
                        break;
                    case 2:
                        System.out.print("Numero da conta: ");
                        numero = sc.nextInt();

                        Conta c = buscarConta(numero);

                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();

                        c.deposito(valor);
                        break;
                    case 3:
                        System.out.print("Numero da conta: ");
                        numero = sc.nextInt();

                        c = buscarConta(numero);

                        System.out.print("Valor: ");
                        valor = sc.nextDouble();

                        c.sacar(valor);
                        break;
                    case 4:
                        System.out.print("Conta origem: ");
                        int origem = sc.nextInt();

                        System.out.print("Conta destino: ");
                        int destino = sc.nextInt();

                        Conta c1 = buscarConta(origem);
                        Conta c2 = buscarConta(destino);

                        System.out.print("Valor: ");
                        valor = sc.nextDouble();

                        c1.transferir(c2, c2.getTitular(), valor);
                        break;

                    case 5:
                        System.out.print("Numero: ");
                        numero = sc.nextInt();

                        c = buscarConta(numero);
                        System.out.println("Saldo: R$" + c.getSaldo());
                        break;
                    case 6:
                        System.out.print("Numero: ");
                        numero = sc.nextInt();

                        c = buscarConta(numero);
                        c.mostrarExtrato();
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

    }
}
