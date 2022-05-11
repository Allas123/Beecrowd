package iniciante.bee1066;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int numero;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        while (i <= 5) {
            numero = input.nextInt();

            if(numero % 2 == 0) {
                par++;
            }
            if(numero % 2 != 0) {
                impar++;
            }
            if(numero > 0) {
                positivo++;
            }
            if(numero < 0) {
                negativo++;
            }

            i++;
        }
        System.out.printf("%d valor(es) par(es)%n", par);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", positivo);
        System.out.printf("%d valor(es) negativo(s)%n", negativo);

        input.close();
    }
}
