package iniciante.bee1014;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int distanciaTotalPercorrida;
         double totalCombustivelGasto;
         double comsumoMedioAutomovel;

         distanciaTotalPercorrida = input.nextInt();
         totalCombustivelGasto = input.nextDouble();

         comsumoMedioAutomovel = distanciaTotalPercorrida / totalCombustivelGasto;

        System.out.printf("%.3f km/l%n" , comsumoMedioAutomovel);

        input.close();
    }
}
