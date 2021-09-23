package iniciante.uri1113;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;

        while (true) {
            x = input.nextInt();
            y = input.nextInt();

            if (x == y) {
                break;
            }

            if (x > y) {
                System.out.printf("Decrescente%n");
            }

            if (x < y) {
                System.out.printf("Crescente%n");
            }
        }

        input.close();
    }
}

