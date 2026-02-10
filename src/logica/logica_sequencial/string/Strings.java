package logica.logica_sequencial.string;

public class Strings {
    public static void main(String[] args) {
        String nome = "Jonatas";
        String saudacao = "Olá, " + nome;
        int tamanhoCaracter = nome.length(); // length diz a quantidade de caracter

        System.out.println(saudacao + " seu nome tem " + tamanhoCaracter + " caracteres!");

        String nomeDois = " Silva";

        boolean saoIguais = nome.equalsIgnoreCase(nomeDois); // equals vê se o conteúdo é igual.

        System.out.println(saoIguais);

        String nomeCompleto = nome.concat(nomeDois);
        System.out.println(nomeCompleto);
    }
}
