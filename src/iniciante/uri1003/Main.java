package iniciante.uri1003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int soma;

        a = input.nextInt();
        b = input.nextInt();

        soma = a + b;

        System.out.printf("SOMA = %d%n", soma);

        input.close();
    }
}
