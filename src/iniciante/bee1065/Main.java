package iniciante.bee1065;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int pares = 0;

        for(int i = 0; i < 5; i++) {

            numero = input.nextInt();

            if(numero % 2 == 0) {
                pares += 1;
            }
        }

        System.out.printf("%d valores pares%n", pares);

        input.close();
    }
}
