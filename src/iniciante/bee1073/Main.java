package iniciante.bee1073;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = %d%n", i, (int) Math.pow(i, 2));
            }
        }

        input.close();
    }
}
