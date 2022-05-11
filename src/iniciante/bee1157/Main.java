package iniciante.bee1157;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero;

        numero = input.nextInt();

        for(int divisor = 1; divisor <= numero; divisor++){

            if(numero % divisor == 0){
                System.out.printf("%d%n",divisor);
            }
        }

        input.close();
    }
}
