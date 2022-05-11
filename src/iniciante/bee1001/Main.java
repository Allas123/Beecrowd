package iniciante.bee1001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int x;

        a = input.nextInt();
        b = input.nextInt();

        x = a + b;

        System.out.printf("X = %d%n", x);

        input.close();
    }
}
