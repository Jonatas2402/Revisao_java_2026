package OO.encapsulamento;

public class ContaBancaria {
    /*Para trabalhar com encapsulamento precisamos dos atributos privados.*/
   private String titular;
   private double saldo;

   /*CONSTRUTOR.
   * O construtor serve para iniciar o objeto quando criado.
   * Os construtores podem ser vazios ou com atributos.
   * A classe por default já feita com construtor sem atributos.
   * Se a classe tiver um construtor com atributos e você não quiser inicializar a classe quando criada
   * deve criar um construtor sem atributos.*/
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    //Construtor sem atributos
    public ContaBancaria() {

    }
    //Construtor com 1 atributo.
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    //Construtor que inicializa a conta com saldo 0.
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
    /*GETTERS AND SETTERS
   * Os gets e sets são métodos padrões para podemos acessar e modificar atributos.*/

    //Método para obter (GET)
    public String getTitular(){
        return titular;
    }
    //Método para modificar (SET)
    public void setTitular(String titular) {
        /*this se refere ao atributo, nesse caso titular.*/
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }
}
