package logica.logica_sequencial.casting;

public class Casting {
    public static void main(String[] args) {
        /*implicita*/
        int numero = 10;
        double d = numero;
        /*explicita*/
        double d2 = 10.50;
        int i2 = (int) d2;

        System.out.println(d);
        System.out.println(i2);

        /*Convertendo inteiros para String <>*/

        Integer numeroInteiro = 300;
        String numeroString = numeroInteiro.toString();

        String numeroStringDois = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroStringDois);

        System.out.println(numeroString);
        System.out.println(numeroConvertido);

        /*convertendo double para String*/

        Double numeroDouble = 12.50;
        String doubleString =  numeroDouble.toString();

        String stringDouble = "14.56";
        Double doubleParaString = Double.parseDouble(stringDouble);

        System.out.println(doubleString);
        System.out.println(doubleParaString);
    }
}
