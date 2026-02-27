package projetos.projeto01;

import java.time.LocalDateTime;

public class Movimentacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;

    public Movimentacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return tipo + " -R$" + valor + " - " + data;
    }
}
