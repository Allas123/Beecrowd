package iniciante.bee1075;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        n = input.nextInt();

        for(int i = 1; i <= 10000; i++){

            if( i % n == 2){
                System.out.printf("%d%n", i);
            }
        }

        input.close();
    }
}

