package logica.logica_sequencial.operadores_aritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 8.50;
        double queijo = 8.30;
        double acucar = 1.50;
        double desconto = 5.00;
        int totalDiaMes = 30;

        //Somandio valor total

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiaMes;
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Valor com desconto: " + valorTotalComDesconto);
        System.out.println("Valor dividido: " + valorTotalDividido);
        System.out.println("Valor total no mês: " + valorTotalMensal);

    }
}
