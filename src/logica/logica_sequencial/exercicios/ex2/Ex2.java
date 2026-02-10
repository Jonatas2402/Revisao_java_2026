package logica.logica_sequencial.exercicios.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Entre copm o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        double calcArea = 3.14159 * raio * raio;

        System.out.print("AREA: ");
        System.out.printf("%.4f%n", calcArea);
    }
}
