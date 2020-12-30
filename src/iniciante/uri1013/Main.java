package iniciante.uri1013;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int maiorAB;
        int maiorBC;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;

        maiorBC = ((maiorAB + c + Math.abs(maiorAB - c)) /2);

        System.out.printf("%d eh o maior%n" , maiorBC);

        input.close();
    }
}
