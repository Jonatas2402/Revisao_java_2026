package OO.etapa_de_construcao;

import POO.etapa_de_construcao.PlantaCasa;

public class Casa {
    public static void main(String[] args) {
        //Criando o objeto.
        PlantaCasa casa = new PlantaCasa();

        /*Iniciando os atributos.*/
        casa.numQuartos = 2;
        casa.numBanheiros = 2;
        casa.metragem = 63;
        casa.cor = "Azul";
        casa.material = "Tijolo";
        //Chamanado funções(métodos).
        casa.construir();

        casa.pintar(casa.cor);

        int resultado = casa.somarMetragem();
        System.out.println("Metragem da casa: " + resultado);

        casa.mudarCorParede("Branco");

        casa.alterarCaracteristicas(100, 3, 2, "Madeira");

        /*Instânciando um novo objeto.
        * basta */
        PlantaCasa casaVizinho = new PlantaCasa();

        casaVizinho.metragem = 50;
        casaVizinho.numQuartos = 2;
        casaVizinho.numBanheiros = 1;
        casaVizinho.material = "Alvenaria";
        casaVizinho.cor = "Amarelo";

        casaVizinho.construir();

        casaVizinho.pintar(casaVizinho.cor);


    }
}
