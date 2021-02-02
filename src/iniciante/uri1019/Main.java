package iniciante.uri1019;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempoDuracaoSegundo;
        int segundos;
        int horas;
        int minutos;

        tempoDuracaoSegundo = input.nextInt();

        segundos = tempoDuracaoSegundo % 60;
        minutos = tempoDuracaoSegundo / 60;
        minutos %= 60;
        horas = tempoDuracaoSegundo / 3600;

        System.out.printf("%d:%d:%d%n",horas, minutos, segundos);

        input.close();
    }
}
