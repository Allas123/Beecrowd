package iniciante.bee1115;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;

        while (true) {
            x = input.nextInt();
            y = input.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.printf("primeiro%n");
            }

            if (x < 0 && y > 0) {
                System.out.printf("segundo%n");
            }

            if (x < 0 && y < 0) {
                System.out.printf("terceiro%n");
            }

            if (x > 0 && y < 0) {
                System.out.printf("quarto%n");
            }
        }

        input.close();
    }
}
