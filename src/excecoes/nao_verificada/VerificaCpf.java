package excecoes.nao_verificada;

import excecoes.ConflitException;

import java.util.Scanner;

public class VerificaCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu CPF: ");
        String verificaCpf = verificarCpf(sc.nextLine());

        System.out.println(verificaCpf);
    }

    public static String verificarCpf(String cpf){
        try {
            if (cpf.equals("0001234500045")) {
                throw new ConflitException("CPF já cadastrado " + cpf);
            }else {
                return "CPF valido, usuário cadastrado.";
            }
        } catch (ConflitException e) {
            throw new ConflitException("CPF já cadastrado " + cpf);
        }
    }
}
