package iniciante.bee1072;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int x;
        int dentro = 0;
        int fora = 0;

        n = input.nextInt();

        for (int i  = 1; i <= n; i++) {

            x = input.nextInt();

            if (x >= 10 & x <= 20) {
                dentro++;

            } else {
                fora++;
            }
        }
        System.out.printf("%d in%n", dentro);
        System.out.printf("%d out%n", fora);

        input.close();
    }
}
