package iniciante.uri1005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double media;

        a = input.nextDouble();
        b = input.nextDouble();

        a *= 3.5;
        b *= 7.5;

        media = ((a + b) / 11);

        System.out.printf("MEDIA = %.5f%n", media);

        input.close();
    }
}
