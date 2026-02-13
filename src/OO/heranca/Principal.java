package OO.heranca;

public class Principal {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudes = new Galinha();
        gertrudes.ciscar();
        gertrudes.comer("Milho");
        gertrudes.beberAgua();
        gertrudes.dormir();
    }
}
