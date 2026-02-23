package exercicios.ex6;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(new Produto("TV samsung", 3000.0));
        carrinho.adicionarProduto(new Produto("iPhone", 7500.0));
        System.out.println("Total do carrinho: " + carrinho.calcularTotal());
        carrinho.removerProduto("iPhone");
        System.out.println("Total do carrinho: " + carrinho.calcularTotal());
    }
}
