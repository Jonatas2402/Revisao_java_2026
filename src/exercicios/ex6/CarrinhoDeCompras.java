package exercicios.ex6;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtoList = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtoList.add(produto);
    }
    public void removerProduto(String nome){
        produtoList.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }
    public double calcularTotal(){
        double total = 0;
        for (Produto p : produtoList){
            total += p.getValor();
        }
        return total;
    }
    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
