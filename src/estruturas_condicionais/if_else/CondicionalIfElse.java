package estruturas_condicionais.if_else;

public class CondicionalIfElse {
    public static void main(String[] args) {
//        int idade = 27;
//
//        if (idade >= 18){
//            System.out.println("Você é maior de idade.");
//        }else {
//            System.out.println("Você é menor de idade.");
//        }

//        boolean estaChovendo = true;
//
//        if (!estaChovendo){/*"se !(não) está chovendo"*/
//            System.out.println("Vamos sair para passear. ");
//        }else {
//            System.out.println("Vamos ficar em casa.");
//        }

        boolean temDinheiro = true;

        boolean temCartao = true;

        if (temDinheiro && temCartao){
            System.out.println("Pede um iFood e uma coca");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede um iFood");
        }else {
            System.out.println("Pede nada");
        }
        /*Ternário*/
        String mensagem =(temDinheiro)? "Pede iFood" : "Não pede nada";
        System.out.println(mensagem);

        /*Mesmo que*/
        if (temDinheiro) {
            System.out.println("Pede iFood");
        }else {
            System.out.println("Não pede nada");
        }
    }
}
