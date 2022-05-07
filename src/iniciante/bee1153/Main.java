package iniciante.bee1153;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int fatorial;

        n = input.nextInt();

        fatorial = n;

        for(int i = 1; n > i; i++) {
            fatorial*= i;
        }

        System.out.printf("%d%n", fatorial);

        input.close();
    }
}
