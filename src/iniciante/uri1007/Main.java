package iniciante.uri1007;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int diferenca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        diferenca = (a * b - c * d);

        System.out.printf("DIFERENCA = %d%n", diferenca);

        input.close();
    }
}
