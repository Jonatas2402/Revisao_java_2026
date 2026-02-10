package estruturas_condicionais;

import java.util.Scanner;

public class ValoresComparativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dgite dois valores: ");
        int pao = sc.nextInt();
        int acucar = sc.nextInt();

        System.out.println(pao == acucar);
        System.out.println(pao != acucar);
        System.out.println(pao > acucar);
        System.out.println(pao < acucar);
        System.out.println(pao >= acucar);
        System.out.println(pao <= acucar);
    }
}
