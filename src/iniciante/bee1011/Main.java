package iniciante.bee1011;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio;
        double PI = 3.14159;
        double volume;

        raio = input.nextDouble();

        volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        input.close();
    }
}
