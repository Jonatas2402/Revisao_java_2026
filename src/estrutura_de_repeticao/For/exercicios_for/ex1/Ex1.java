package estrutura_de_repeticao.For.exercicios_for.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int cont = sc.nextInt();

        for (int i = 0; i < cont; i++){
            i++;
            System.out.println(i);
        }
    }
}
