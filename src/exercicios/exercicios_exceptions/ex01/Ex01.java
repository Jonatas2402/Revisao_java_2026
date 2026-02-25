package exercicios.exercicios_exceptions.ex01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o 1° número inteiro: ");
        int a = sc.nextInt();
        System.out.print("Entre com o 2° número inteiro: ");
        int b = sc.nextInt();
        try {
            if (a != 0 && b != 0){
                int divisao = a / b;
                System.out.println("O resultado da divisão é: " + divisao);
            }else {
                System.out.println("Nenhum dos números podem ser 0!");
            }
        } catch (Exception e) {

        }



    }
}
