package iniciante.bee1043;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a;
        float b;
        float c;
        float perimetro;
        float area;

        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        if (b - c < a && a < b + c ) {
            if (a  - c < b && b < a + c) {
                if (a - b < c && c < a + b){

                    perimetro = (a + b + c);
                    System.out.printf("Perimetro = %.1f%n", perimetro);
                }
            }
        } else {
            area =  ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n",area);
        }
        input.close();
    }
}
