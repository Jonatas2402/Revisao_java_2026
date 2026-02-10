package logica.logica_sequencial.exercicios.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois números: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = numero1+ numero2;

        System.out.println("SOMA: " + soma);
    }
}
