package arrays_e_colecoes.colecoes;

import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Double> notasAlunos = new TreeMap<>();

        notasAlunos.put("Gustavo", 4.5);
        notasAlunos.put("Augusto", 8.2);
        notasAlunos.put("João", 10.0);
        notasAlunos.put("Antonio", 7.8);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println("nota: " + nome + ": " + nota);
        }
        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Ultima chave: " + notasAlunos.lastKey());
    }
}
