package iniciante.bee1117;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota;
        double somaNota = 0;
        double mediaNota;

        for (int quantidadeNota = 0; quantidadeNota < 2;) {

            nota = input.nextDouble();

            if (nota >= 0.0 && nota <= 10.0) {
                somaNota += nota;
                quantidadeNota++;

                if (quantidadeNota == 2) {
                    mediaNota = somaNota / 2;
                    System.out.printf("media = %.2f%n", mediaNota);

                }

            } else {
                System.out.printf("nota invalida%n");
            }
        }

        input.close();
    }
}
