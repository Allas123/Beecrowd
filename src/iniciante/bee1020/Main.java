package iniciante.bee1020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int anos;
        int mes;
        int idadeDias;
        int dias;

        idadeDias = input.nextInt();

        anos = (idadeDias / 365);
        mes = (idadeDias % 365  / 30);
        dias = (idadeDias % 365 % 30 );

        System.out.printf("%d ano(s)%n" , anos);
        System.out.printf("%d mes(es)%n" , mes);
        System.out.printf("%d dia(s)%n" , dias);

        input.close();

    }
}
