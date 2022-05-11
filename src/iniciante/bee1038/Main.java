package iniciante.bee1038;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double CACHORRO_QUENTE = 4.00;
        double X_SALADA = 4.50;
        double X_BANCON = 5.00;
        double TORRADA_SIMPLES = 2.00;
        double REFRIGERANTE = 1.50;
        int a;
        int b;
        double total;

        a = input.nextInt();
        b = input.nextInt();

        if (a == 1) {
            total = (b * CACHORRO_QUENTE);
            System.out.printf("Total: R$ %.2f%n", total);
        }

        if (a == 2) {
            total = (b * X_SALADA);
            System.out.printf("Total: R$ %.2f%n", total);
        }

        if (a == 3) {
            total = (b * X_BANCON);
            System.out.printf("Total: R$ %.2f%n", total);
        }

        if (a == 4) {
            total = (b * TORRADA_SIMPLES);
            System.out.printf("Total: R$ %.2f%n", total);
        }

        if (a == 5) {
            total = (b * REFRIGERANTE);
            System.out.printf("Total: R$ %.2f%n", total);
        }

        input.close();
    }
}

