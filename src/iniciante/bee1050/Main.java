package iniciante.bee1050;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ddd;

        ddd = input.nextInt();

        if(61 == ddd) {
            System.out.printf("Brasilia%n");

        } else if(71 == ddd) {
            System.out.printf("Salvador%n");

        } else if(11 == ddd) {
            System.out.printf("Sao Paulo%n");

        } else if(21 == ddd) {
            System.out.printf("Rio de Janeiro%n");

        } else if(32 == ddd) {
            System.out.printf("Juiz de Fora%n");

        } else if(19 == ddd) {
            System.out.printf("Campinas%n");

        } else if(27 == ddd) {
            System.out.printf("Vitoria%n");

        } else if(31 == ddd) {
            System.out.printf("Belo Horizonte%n");

        } else {
            System.out.printf("DDD nao cadastrado%n");
        }

        input.close();
    }
}
