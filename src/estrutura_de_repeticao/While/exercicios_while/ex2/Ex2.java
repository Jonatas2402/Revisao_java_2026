package estrutura_de_repeticao.While.exercicios_while.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int contagem = sc.nextInt();

        while (contagem != 4){
            if (contagem == 1){
                alcool++;
            }if (contagem == 2){
                gasolina++;
            }
            if (contagem == 3) {
                diesel++;
            }
            System.out.print("DIgite um número: ");
            contagem = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " +diesel);
    }
}
