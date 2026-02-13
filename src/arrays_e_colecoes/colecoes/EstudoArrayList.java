package arrays_e_colecoes.colecoes;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        /*comandos:
        * add = adiciona a lista.
        * get = pega um item especifico na lista.
        * remove = remove um item da lista.
        * isEmpty = checa se a lista esta vazia, retorna um boolean(falso or true)
        * size = verifica o tamanho da lista, em posições.
        * clear = limpa toda a lista.
        * contains = verifica se o elemento especifico está na lista.
        * */
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add("Carne");

        /*Colocando item em uma posição*/
        listaDeCompras.add(1, "Frango");

        /*Iteração sobrea alista.*/
        for (String l: listaDeCompras){
            System.out.println(l);
        }
        String item = listaDeCompras.get(2);
        System.out.println("O item da lista na posição 2: " + item);

        listaDeCompras.remove("Macarrão");
        for (String l : listaDeCompras){
            System.out.println(l);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("A lista esta vazia? " + eVazia);
        System.out.println("Qual o tamanho da lista? " + tamanho);
        System.out.println("A lista comtem o item arroz? " + contem);

//        listaDeCompras.clear();
//        System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());

        /*forEach para fazer a iteração na lista.*/
        listaDeCompras.forEach(produto -> System.out.println(produto));
    }
}
