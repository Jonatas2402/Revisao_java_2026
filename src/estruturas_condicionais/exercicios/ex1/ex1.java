package estruturas_condicionais.exercicios.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("entre com um valor: ");
        int valor = leitura.nextInt();

        if (valor <0){
            System.out.println("Valor negativo");
        }else {
            System.out.println("Não negativo");
        }
    }
}
