package mini_projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        //Utilizar Scanner para entrar com os dados.
        System.out.println("Cadastro de usuários");
        int escolha = sc.nextInt();
        List<Usuario> listaDeUsuarios = new ArrayList<>();
        //Lista para salvar os usuários.
        //Criar um while para fazer a lógica de criar, remover, listar entre outros.
        while (escolha != 4){
            switch (escolha){
                case 1:
                    System.out.println("Criando usuario.");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    Usuario user = new Usuario(nome);
                    listaDeUsuarios.add(user);
                    break;
                case 2:
            }
        }
    }
}
