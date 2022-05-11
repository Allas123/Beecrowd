package iniciante.bee1016;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minuto;
        int distancia;

        distancia = input.nextInt();

        minuto = distancia *  60 / 30 ;

        System.out.printf("%d minutos%n", minuto);

        input.close();
    }
}
