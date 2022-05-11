package iniciante.bee1078;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int resultando;

        numero = input.nextInt();

        for(int i = 1; i <= 10; i++) {
            resultando = i * numero;

            System.out.printf("%d x %d = %d%n", i, numero, resultando);
        }

        input.close();
    }
}
