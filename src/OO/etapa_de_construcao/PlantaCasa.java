package POO.etapa_de_construcao;

public class PlantaCasa implements Construcao{
    //Atributos
    /*O atributo dita o estado da classe.*/
   public int metragem;
   public int numQuartos;
   public int numBanheiros;
   public String cor;
   public String material;

    //métodos
    /*O método dita o comportamento da classe.*/
    @Override
    public void construir(){
        System.out.println("A casa foi construida, e as características são: ");
        System.out.println("Metragem: " + metragem);
        System.out.println("Numero de Quartos: " + numQuartos);
        System.out.println("Número de Banheiros: " + numBanheiros);
        System.out.println("Material: " + material);
    }
    /*Anotação
    * Override: Aponta que esse método vem deu uma interface.*/
    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor: " + cor);
    }

    @Override
    public int custoConstrucao(int custoMetragem) {
        return metragem + custoMetragem;
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar(cor);
    }
    /*Criar um método.*/
    public int somarMetragem(){
       return metragem * numBanheiros + numBanheiros;
    }

    /*Utilizando Parâmetros para atualizar a casa.*/
    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
        metragem = metros;
        numQuartos = quartos;
        numBanheiros = banheiros;
        material = mat;
        construir();
    }
}
