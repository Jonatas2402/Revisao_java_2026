package OO.abstracao;

public class Cliente extends Endereco implements Pessoa{
    private String nome;
    private String documento;
    /*Aqui so implemnetamos o que era necessario da classe endereço.
    * Essa é a vantagem da classe abstrata, não precisa implementar TUDO como na interface.
    * */
    public Cliente(String rua, String cidade, String estado,
                   String cep, String nome, String documento) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    @Override
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    @Override
    public void mostrarEndereco(){
        System.out.println("Endereço " + getRua() + ", "
                + getCidade() + ", " + getEstado() + ", " + getCep());
    }

    @Override
    public String toString() {
        return "nome " + nome
                + " documento " + documento;
    }
}
