package iniciante.bee1154;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade;
        int quantidadeIdadeInserida = 0;
        double somaIdade = 0;
        double mediaIdade;

        while(true) {
            idade = input.nextInt();

            if(idade < 0) {
                break;
            }

            somaIdade += idade;
            quantidadeIdadeInserida++;
        }

        mediaIdade = somaIdade / quantidadeIdadeInserida;

        System.out.printf("%.2f%n", mediaIdade);

        input.close();
    }
}
