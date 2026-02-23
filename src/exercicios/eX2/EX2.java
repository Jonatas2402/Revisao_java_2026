package exercicios.eX2;

import java.util.Scanner;

/*Maior de 3 números*/
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Números de repetições: ");
        int numRep = sc.nextInt();
        int maior = 0;
        for (int i = 1; i <= numRep; i++){
            System.out.print("Entre com " + i + "° número: ");
            int num = sc.nextInt();
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
