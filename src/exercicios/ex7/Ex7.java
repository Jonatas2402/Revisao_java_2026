package exercicios.ex7;

public class Ex7 {
    public static void main(String[] args) {
        /*FizzBuzz
        * se número for multiplo de 3 = fizz
        * se número for multiplo de 5 = Buzz
        * se ambos = FizzBuzz*/

        for (int i = 1; i <= 100; i++){
           if (i % 3 == 0 && i % 5 == 0){
               System.out.println("FizzBuzz");
           } else if (i % 3 == 0) {
               System.out.println("Fizz");
           } else if (i % 5 == 0) {
               System.out.println("Buzz");
           }else {
               System.out.println(i);
           }
        }
    }
}
