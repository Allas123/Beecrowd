package iniciante.bee1059;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numerosPares = 1;

        while (numerosPares <= 100){

            if (numerosPares % 2 == 0) {
                System.out.printf("%d%n",numerosPares);

            }
            numerosPares++;
        }

        input.close();
    }
}
