package iniciante.uri1047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaIncial;
        int minutoInicial;
        int horaFinal;
        int minutoFinal;
        int duracaoJogoHoras;
        int duracaoJogoMinutos;

        horaIncial = input.nextInt();
        minutoInicial = input.nextInt();
        horaFinal = input.nextInt();
        minutoFinal = input.nextInt();


        duracaoJogoHoras = (horaFinal - horaIncial);
        duracaoJogoMinutos = (minutoFinal - minutoInicial);

        if (duracaoJogoHoras < 0 ) {
            duracaoJogoHoras = (24 + (horaFinal - horaIncial));
        }

        if (duracaoJogoMinutos < 0) {
            duracaoJogoMinutos = (60 + (minutoFinal - minutoInicial));
            duracaoJogoHoras--;
        }

        if(horaIncial == horaFinal && minutoInicial == minutoFinal) {
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)%n");

        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoJogoHoras, duracaoJogoMinutos);
        }

        input.close();
    }
}
