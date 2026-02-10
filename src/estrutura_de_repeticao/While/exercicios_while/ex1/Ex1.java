package estrutura_de_repeticao.While.exercicios_while.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 240218;
        System.out.print("Digite a senha: ");
        int tentativa = sc.nextInt();


        while (senha != tentativa){
            System.out.println("Senha incorreta, tente novamente");
            System.out.print("Digite a senha: ");
            tentativa = sc.nextInt();
        }
        System.out.println("Senha correta.");
    }
}
