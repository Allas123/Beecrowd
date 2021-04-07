package iniciante.uri1070;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int i = 1;

        x = input.nextInt();

        while (i <= 12) {
            if (x % 2 != 0) {
                System.out.printf("%d%n", x);
            }
            x = x + 1;
            i++;
        }
        input.close();
    }
}
