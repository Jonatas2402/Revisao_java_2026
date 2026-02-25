package excecoes.verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeDocumentos {
    public static void main(String[] args) {
        /*Lendo documento do computador.*/

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\Jonat\\OneDrive\\Área de Trabalho\\doc\\texto.txt"));

            //lê linha por linha
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo." + e.getMessage());
            throw new RuntimeException(e);
        }
        /*FileNotFoundException estende de IOException. Nessa situação colocando o IOException
        * ele se estende também a FileNotFoundException.
        Isso é hierarquia de classes.*/
    }
}
