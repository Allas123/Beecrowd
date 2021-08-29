package iniciante.uri1074;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int numero;

        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            numero = input.nextInt();

            if (numero == 0) {
                System.out.printf("NULL%n");
            }

            if (numero % 2 == 0 && numero > 0) {
                System.out.printf("EVEN POSITIVE%n");
            }

            if (numero % 2 != 0 && numero > 0) {
                System.out.printf("ODD POSITIVE%n");
            }

            if (numero % 2 == 0 && numero < 0) {
                System.out.printf("EVEN NEGATIVE%n");
            }

            if (numero % 2 != 0 && numero < 0) {
                System.out.printf("ODD NEGATIVE%n");
            }
        }

        input.close();
    }
}

