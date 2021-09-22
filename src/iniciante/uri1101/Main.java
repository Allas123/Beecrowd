package iniciante.uri1101;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m;
        int n;
        int m1;
        int n1;
        int soma;

        while (true) {
            soma = 0;

            m = input.nextInt();
            n = input.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }

            m1 = Math.min(m, n);
            n1 = Math.max(m, n);

            while (m1 <= n1) {
                System.out.printf("%d ", m1);
                soma += m1;
                m1++;
            }

            System.out.printf("Sum=%d%n", soma);
        }

        input.close();
    }
}

