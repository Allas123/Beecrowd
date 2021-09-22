package iniciante.uri1099;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int x;
        int y;
        int x1;
        int y2;
        int soma;

        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            soma = 0;

            x = input.nextInt();
            y = input.nextInt();

            x1 = Math.max(x, y);
            y2 = Math.min(x, y);
            y2++;

            while (y2 < x1) {
                if (y2 % 2 != 0) {
                    soma += y2;
                }

                y2++;
            }

            System.out.printf("%d%n", soma);
        }

        input.close();
    }
}

