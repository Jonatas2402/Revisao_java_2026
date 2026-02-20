package OO.composicao.associacao;

public class Carro {
    /*Atributo do tipo motor.*/
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro(int cilindrada){
        this.motor = new Motor(cilindrada);
    }

    public void mostrasrCilindradas(){
        System.out.println("Carro com motor de " + motor.getCilindrada() + " cilindradas");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
