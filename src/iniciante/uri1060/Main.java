package iniciante.uri1060;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int cont = 1;
        int contPositivo = 0;
        double numero;

        while (cont <= 6) {
            numero = input.nextDouble();

            if (numero > 0 ) {
                contPositivo = contPositivo + 1;
            }

            cont++;
        }

        System.out.printf("%d valores positivos%n", contPositivo );
        input.close();
    }
}
