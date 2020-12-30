package iniciante.uri1006;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double media;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        a *= 2;
        b *= 3;
        c *= 5;

        media = ((a + b + c) / 10);

        System.out.printf("MEDIA = %.1f%n" , media);

        input.close();
    }
}
