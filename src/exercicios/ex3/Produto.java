package exercicios.ex3;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public void calcularValorTotal(){
       System.out.println("Valor total: " + quantidade * preco);
   }
   public void adicionarEstoque(int quanti){
        this.quantidade += quanti;
        if (this.quantidade > 5000){
            System.out.println("Estoque não comporta quantidade maior que 5000 unidades.");
        }
       System.out.println("Total de quantidade em estoque: " + this.quantidade);
   }

   public void removerEstoque(int quanti){
        if (quanti > getQuantidade()){
            System.out.println("Não é possível remover além da quantidade em estoque " + quantidade + " quantidade maxima.");

        }
        this.quantidade -= quanti;
       System.out.println("Total de quantidade em estoque: " + this.quantidade);
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "nome " + getNome() +
                " preço " + getPreco() +
                " quantidade " + getQuantidade();
    }
}
