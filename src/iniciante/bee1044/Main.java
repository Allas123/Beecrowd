package iniciante.bee1044;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int a;
    int b;
    int resto;

    a = input.nextInt();
    b = input.nextInt();

    resto = (Math.max(a, b) % Math.min(a , b));

    if (resto == 0 ) {
        System.out.printf("Sao Multiplos%n");

    } else {
        System.out.printf("Nao sao Multiplos%n");
    }

    input.close();
    }
}
