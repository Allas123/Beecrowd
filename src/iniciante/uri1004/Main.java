package iniciante.uri1004;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int prod;

        primeiroNumero = input.nextInt();
        segundoNumero = input.nextInt();

        prod = primeiroNumero * segundoNumero;

        System.out.printf("PROD = %d%n", prod);

        input.close();
    }
}
