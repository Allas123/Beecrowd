package iniciante.bee1052;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mes;

        mes = input.nextInt();

        switch (mes){
            case  1:
                System.out.printf("January%n");
                break;

            case 2:
                System.out.printf("February%n");
                break;

            case 3:
                System.out.printf("March%n");
                break;

            case 4:
                System.out.printf("April%n");
                break;

            case 5:
                System.out.printf("May%n");
                break;

            case 6:
                System.out.printf("June%n");
                break;

            case 7:
                System.out.printf("July%n");
                break;

            case 8:
                System.out.printf("August%n");
                break;

            case 9:
                System.out.printf("September%n");
                break;

            case 10:
                System.out.printf("October%n");
                break;

            case 11:
                System.out.printf("November%n");
                break;

            default:
                System.out.printf("December%n");
        }
        input.close();
    }
}

