package exercicios.ex3;

public class Main {
    public static void main(String[] args) {

      Produto prod1 = new Produto();
      prod1.setNome("Sal");
      prod1.setPreco(2.50);
      prod1.setQuantidade(500);
      System.out.println(prod1);
      prod1.calcularValorTotal();
      prod1.adicionarEstoque(50);
      prod1.removerEstoque(600);
      System.out.println(prod1);

    }
}
