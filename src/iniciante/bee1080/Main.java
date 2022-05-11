package iniciante.bee1080;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;
        int maior = 0;
        int posicao = 1;

        for(int i = 1; i <= 100; i++) {
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
                posicao = i;
            }
        }

        System.out.printf("%d%n", maior);
        System.out.printf("%d%n", posicao);

        input.close();
    }
}

