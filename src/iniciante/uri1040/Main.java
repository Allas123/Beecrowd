package iniciante.uri1040;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float n1;
        float n2;
        float n3;
        float n4;
        float media;
        float exame;
        float media2;

        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();
        n4 = input.nextFloat();

        media = (2.0f * n1 + 3.0f * n2 + 4.0f * n3 +  n4) / 10.0f;

        System.out.printf("Media: %.1f%n", media);

        if ( media < 5.0f) {
            System.out.printf("Aluno reprovado.%n");
        }

        if (media >= 5.0f &&  media < 7.0f ) {
            System.out.printf("Aluno em exame.%n");
            exame = input.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", exame);
            media2 = (media + exame ) / 2.0f;

            if (media2 >= 5.0f) {
                System.out.printf("Aluno aprovado.%n");
                System.out.printf("Media final: %.1f%n", media2);

            } else {
                System.out.printf("Aluno reprovado.%n");
                System.out.printf("Media final: %.1f%n", media2);
            }
        }

        if (media >= 7.0f) {
            System.out.printf("Aluno aprovado.%n");
        }

        input.close();
    }

}