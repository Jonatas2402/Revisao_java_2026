package mini_projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        //Utilizar Scanner para entrar com os dados.
        System.out.println("Cadastro de usuários");

        List<Usuario> listaDeUsuarios = new ArrayList<>();
        //Lista para salvar os usuários.
        //Criar um while para fazer a lógica de criar, remover, listar entre outros.
        int escolha = sc.nextInt();
        while (escolha != 5){
            System.out.println("Escolha uma nova operação.");
            System.out.println("MENU:" +
                    "\n 1 - Criar usuários" +
                    "\n 2 - Listar usuários" +
                    "\n 3 - Remover usuários" +
                    "\n 4 - Buscar usuários" +
                    "\n 5 - Sair");
            escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha){
                case 1:
                    System.out.println("Criando usuario.");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    Usuario user = new Usuario(nome);
                    listaDeUsuarios.add(user);
                    break;
                case 2:
                    System.out.println("Listando");
                    listaDeUsuarios.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("escolha o índice do usuário.");
                    int indiceRemove = sc.nextInt();
                    if (listaDeUsuarios.isEmpty()){
                        System.out.println("Lista está vazia");
                    }else {
                        listaDeUsuarios.remove(indiceRemove);
                    }
                    break;
                case 4:
                    System.out.println("escolha o índice do usuário.");
                    int indice = sc.nextInt();
                    if (listaDeUsuarios.isEmpty()){
                        System.out.println("Lista está vazia");
                    }else {
                        listaDeUsuarios.get(indice).getNome();
                    }
                    break;
            }

        }
        System.out.println("Fim do programa. Obrigado por utilizar.");
    }
}
