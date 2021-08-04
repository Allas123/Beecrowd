package iniciante.uri1071;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int x;
        int y;
        int y1;
        int x1;
        int soma = 0;

        x = input.nextInt();
        y = input.nextInt();

        y1 = Math.max(x, y);
        x1 = Math.min(x, y);
        x1 += 1;

        while ( x1 < y1 ){
            if(x1 % 2 != 0) {
                soma += x1;
            }
            x1++;
        }
        System.out.printf("%d%n", soma);

        input.close();
    }
}


