package iniciante.uri1067;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;

        x = input.nextInt();

        for(int i = 1; i <= x; i++) {
            if(i % 2 != 0) {
                System.out.printf("%d%n", i);
            }
        }
        input.close();
    }

}