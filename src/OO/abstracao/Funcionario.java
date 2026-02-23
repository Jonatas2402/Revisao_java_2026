package OO.abstracao;

public class Funcionario extends Endereco implements Pessoa{
/*A partir do momento que é implementado a interface pessoa
* a classe obrigatoriamente ter que implementar seus métodos.
* Obrigando ter os getters e setters sendo assim nos obrigadno a ter os atributos
* nome e documento.*/
    private String nome;
    private String documento;
    private String cargo;
    /*SUper: referência de método que esta dentro da superClasse*/
    public Funcionario(String rua, String cidade, String numeroCasa, String estado,
                       String cep, String nome, String documento, String cargo) {
        super(rua, cidade, numeroCasa, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public void mostrarEndereco(){
        System.out.println("Endereço do funcionario " + getRua() + ", " + getNumeroCasa() + ", " + getCidade() + ", " + getEstado() + ", " + getCep());
    }

    @Override
    public String toString() {
        return "nome " + nome
                + " documento " + documento
                + " cargo " + cargo;
    }
}
