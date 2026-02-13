package arrays_e_colecoes.colecoes.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(4, 2, 160, 250, 10, -450, 10, 3650, -850);


        int maior = numeros.get(0) ;
        int menor = numeros.get(0);

        for (int n: numeros){
            if (n > maior){
                maior = n;
            }
            if (n < menor){
                menor = n;
            }
        }

        System.out.println(maior);
        System.out.println(menor);

    }
}
