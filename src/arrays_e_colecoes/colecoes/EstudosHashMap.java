package arrays_e_colecoes.colecoes;

import java.util.HashMap;
import java.util.Map;

public class EstudosHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();

        notasAlunos.put("Gustavo", 4.5);
        notasAlunos.put("Augusto", 8.2);
        notasAlunos.put("João", 10.0);
        notasAlunos.put("Antonio", 7.8);

        /*O método get pede a chave para acessar o valor.*/
        notasAlunos.get("João");

        double maior = 0;
        /*iteração
        * A iteração no hashMap é feita pelo keySaet que pega o "chave"*/

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println("nota: " + nome + ": " + nota);
        }
        System.out.println();
        /*iteração
        * A iteração feita com entreySet, aqui já pegamos os dois parâmetros*/

        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + ": " + valorNota);
        }

        /*O resto dos comandos é igual*/

        int tamanho = notasAlunos.size();
        boolean estaVazia = notasAlunos.isEmpty();
        /*O contains pode ser feito pela chave(key) ou pelo valor(value).*/
        boolean contem = notasAlunos.containsKey("João");

    }
}
