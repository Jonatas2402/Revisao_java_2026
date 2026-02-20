package OO.polimorfismo;

public class Principal {
    public static void main(String[] args) {
        //Polimorfismo de Compilação(Sobrecarga de métodos).
        int sabaoEmPo = 6;
        int banana = 4;

        double sabonete = 2.50;
        double feijao = 8.40;

        Integer arroz = 5;
        Integer batata = 4;
        Integer melancia = 9;

        /*Na hora de compilar vamos decidir qual método utilizar.*/

        int total = Calculadora.somar(sabaoEmPo, banana);
        double totalDouble = Calculadora.somar(sabonete, feijao);
        Integer totalInteger = Calculadora.somar(arroz, batata, melancia);

        Carro corrola = new Carro();
        corrola.mover();
    }
}
