package OO.abstracao;

public interface Pessoa {

    String getNome();
    void setNome(String nome);

    String getDocumento();
    void setDocumento(String documento);

    /*Metodos para buscar e atribuir valores.
    * Isso define que toas asa classes que implementarem essa interface,
    * obrigatoriamente teram que ter nome e documento.
    * Pois a interface é um contrato, ela estabelece coisas imutaveis.*/

}
