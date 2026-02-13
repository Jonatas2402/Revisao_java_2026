package POO.etapa_de_construcao;

public interface Construcao {
    /*Interfaces possuem apenas métodos, esses métodos podem ter ou não parâmetros.
    * e podem ter ou não retorno.*/
    void construir();
    void pintar(String cor);
    int custoConstrucao(int custoMetragem);

}
