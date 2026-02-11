package arrays_e_colecoes.array;

public class Array {
    public static void main(String[] args) {
        //Declaração de array
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        String futas[];
        //Inicializar
        futas = new String[]{"Maçâ", "Laranja", "Morango"};

        double salarios[] = new double[5];

        salarios[4] = 450.00;
        salarios[0] = 150.00;
        salarios[1] = 250.00;
        salarios[3] = 300.00;
        salarios[2] = 900.00;

        /*Iteração sobre o array.*/
//        for (int i = 0; i < salarios.length; i++){
//            System.out.println(salarios[i]);
//        }
        /*Array não é muito utilizado em web java. Utilizamos mais coleções.*/

        /*foreach*/
        /*Uma forma mais fácil e simples de iterar sobre um array.*/
        for (double salario: salarios){
            System.out.println(salario);
        }
        salarios[2] = 4.500;
    }
}
