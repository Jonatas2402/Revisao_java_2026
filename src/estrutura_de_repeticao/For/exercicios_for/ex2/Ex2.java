package estrutura_de_repeticao.For.exercicios_for.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int contador = sc.nextInt();

        System.out.print("Digite os valores: ");
        int valorIntervalo = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < contador; i++){
            if (valorIntervalo >= 10 && valorIntervalo <=20){
                in++;
            }else {
                out++;
            }
            System.out.print("Digite o valor: ");
            valorIntervalo = sc.nextInt();
        }
        System.out.println("in: " + in);
        System.out.println("out: " + out);
    }
}
