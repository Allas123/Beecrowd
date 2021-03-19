package iniciante.uri1046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaIncial;
        int horaFinal;
        int duracaoJogo;

        horaIncial = input.nextInt();
        horaFinal = input.nextInt();

        if (horaIncial >= horaFinal) {
            duracaoJogo = ((24 - horaIncial) + horaFinal);
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracaoJogo);

        } else {
            duracaoJogo = (horaFinal - horaIncial);
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracaoJogo);
        }
        input.close();
    }
}
