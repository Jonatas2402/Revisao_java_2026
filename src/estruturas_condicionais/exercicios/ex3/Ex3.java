package estruturas_condicionais.exercicios.ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Entre com dois número: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % 2 == 0 && numero2 % 2 == 0){
            System.out.println("São multiplos.");
        }else {
            System.out.println("Não são multiplos.");
        }
    }
}
