package estruturas_condicionais.exercicios.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
