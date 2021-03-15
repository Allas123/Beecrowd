package iniciante.uri1041;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float x;
        float y;

        x = input.nextFloat();
        y = input.nextFloat();

        if (x == 0.0f && y == 0.0f) {
            System.out.printf("Origem%n");

        } else if (x == 0.0) {
            System.out.printf("Eixo Y%n");

        } else if (y == 0.0) {
            System.out.printf("Eixo X%n");

        } else if (x > 0.0 && y > 0.0) {
            System.out.printf("Q1%n");

        } else if (x > 0.0 && y < 0.0) {
            System.out.printf("Q4%n");

        } else if (x < 0.0 && y < 0.0) {
            System.out.printf("Q3%n");

        } else {
            System.out.printf("Q2%n");
        }
    }
}