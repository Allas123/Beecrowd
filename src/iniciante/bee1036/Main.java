package iniciante.bee1036;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double delta;
        double r1;
        double r2;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        delta = Math.pow(b, 2) - (4 * a * c);
        r1 = (- b + Math.sqrt(delta)) / (2 * a);
        r2 = (- b - Math.sqrt(delta)) / (2 * a);

        if (a != 0 && delta >= 0 ) {
            System.out.printf("R1 = %.5f%n", r1 );
            System.out.printf("R2 = %.5f%n", r2 );
        }
        else {
            System.out.printf("Impossivel calcular%n");
        }
        input.close();
    }
}