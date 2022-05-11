package iniciante.bee1037;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;

        a = input.nextDouble();

        if (a < 0.00 || a > 100.00)  {
            System.out.printf("Fora de intervalo%n");
        }

        if ( a >= 0.00 && a <= 25.00) {
            System.out.printf("Intervalo [0,25]%n");
        }

        if (a > 25.00 && a <= 50.0) {
            System.out.printf("Intervalo (25,50]%n");
        }

        if (a > 50.00 && a <= 75.00) {
            System.out.printf("Intervalo (50,75]%n");
        }

        if (a > 75.00 && a <= 100.00) {
            System.out.printf("Intervalo (75,100]%n");
        }

        input.close();
    }
}
