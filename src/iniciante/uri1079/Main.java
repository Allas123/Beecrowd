package iniciante.uri1079;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        float a;
        float b;
        float c;
        float media;

        n = input.nextInt();

        for(int i = 0; i < n; i++){
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();

            media = (2 * a + 3 * b + 5 * c) /10;

            System.out.printf("%.1f%n", media);
        }

        input.close();
    }
}
