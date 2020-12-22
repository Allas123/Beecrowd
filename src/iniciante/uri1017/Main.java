package iniciante.uri1017;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tempoGastoViagem;
        int velocidadeMedia;
        int distanciaPercorrida;
        double automovel = 12.0;
        double quantidadeLitrosNecessario;

        tempoGastoViagem = input.nextInt();
        velocidadeMedia = input.nextInt();

        distanciaPercorrida = (velocidadeMedia * tempoGastoViagem);
        quantidadeLitrosNecessario = (distanciaPercorrida / automovel);

        System.out.printf("%.3f%n", quantidadeLitrosNecessario);

        input.close();
    }
}
