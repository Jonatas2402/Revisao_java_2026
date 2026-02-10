package logica.logica_sequencial.entrade_e_saida_de_dados;

import java.util.Scanner;

public class EntradaESaidaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá, digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("DIgite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade + " anos");

    }
}
