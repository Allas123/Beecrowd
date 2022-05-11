package iniciante.bee1035;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if (b > c && d > a &&
                (c + d) > (a + b) &&
                c > 0 && d > 0 &&
                (a % 2) == 0 ) {

            System.out.printf("Valores aceitos%n");
        }
        else {
            System.out.printf("Valores nao aceitos%n");
        }

        input.close();
    }
}
