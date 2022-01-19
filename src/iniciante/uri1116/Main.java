package iniciante.uri1116;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        float x;
        float y;
        float resultadoDivisao;

        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            x = input.nextInt();
            y = input.nextInt();

            if (y == 0) {
                System.out.printf("divisao impossivel%n");
            }

            else {
                resultadoDivisao = x / y;
                System.out.printf("%.1f%n", resultadoDivisao);
            }
        }
    }
}
