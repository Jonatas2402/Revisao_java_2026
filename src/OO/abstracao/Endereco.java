package OO.abstracao;

public abstract class Endereco {
    /*Encapsulando os atributos.*/
    private String rua;
    private String cidade;
    private String numeroCasa;
    private String estado;
    private String cep;
    /*Getters and Setters and constructor*/

    public Endereco() {

    }

    public Endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco(String rua, String cidade, String numeroCasa, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
        this.estado = estado;
        this.cep = cep;
    }



    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public void mostrarEndereco(){
        System.out.println("Endereço " + rua + ", " + numeroCasa + ", " + cidade + ", " + estado + ", " + cep);
    }
}
