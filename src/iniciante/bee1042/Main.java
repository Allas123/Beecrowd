package iniciante.bee1042;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int min1;
        int min2;
        int min3;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        min1 = Math.min(a, Math.min(b, c));

        if (min1 == a) {

            min2 = Math.min(b, c);
            min3 = Math.max(b, c);

            System.out.printf("%d%n",min1);
            System.out.printf("%d%n", min2);
            System.out.printf("%d%n", min3);
            System.out.printf("%n");
            System.out.printf("%d%n", a);
            System.out.printf("%d%n", b);
            System.out.printf("%d%n", c);

        } else if (min1 == b) {

            min2 = Math.min(a, c);
            min3 = Math.max(a, c);

            System.out.printf("%d%n",min1);
            System.out.printf("%d%n", min2);
            System.out.printf("%d%n", min3);
            System.out.printf("%n");
            System.out.printf("%d%n", a);
            System.out.printf("%d%n", b);
            System.out.printf("%d%n", c);

        } else {

            min2 = Math.min(b, a);
            min3 = Math.max(b, a);

            System.out.printf("%d%n",min1);
            System.out.printf("%d%n", min2);
            System.out.printf("%d%n", min3);
            System.out.printf("%n");
            System.out.printf("%d%n", a);
            System.out.printf("%d%n", b);
            System.out.printf("%d%n", c);
        }

        input.close();
    }
}
