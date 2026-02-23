package exercicios.ex1;

import java.util.Scanner;

/*Par ou ímpar*/
public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Ímpar");
        }
    }
}
