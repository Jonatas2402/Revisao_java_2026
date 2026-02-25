package exercicios.exercicios_exceptions.ex02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        ValidarIdade validarIdade = new ValidarIdade();

        validarIdade.validarIdade(idade);
    }
}
