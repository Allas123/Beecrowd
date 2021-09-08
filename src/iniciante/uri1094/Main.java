package iniciante.uri1094;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int quantidadeCobaias;
        float somaCoelhos = 0.0f;
        float somaRato = 0.0f;
        float somaSapos = 0.0f;
        float somaTotal;
        float percentualCoelhos;
        float percentualRatos;
        float percentualSapos;
        String tipoCobaia;

        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            quantidadeCobaias = input.nextInt();
            tipoCobaia = input.next();

            if(tipoCobaia.equals("C")){
                somaCoelhos = somaCoelhos + quantidadeCobaias;
            }

            if(tipoCobaia.equals("R")){
                somaRato = somaRato + quantidadeCobaias;
            }

            if(tipoCobaia.equals("S")){
                somaSapos = somaSapos + quantidadeCobaias;
            }
        }

        somaTotal = somaCoelhos + somaRato + somaSapos;
        percentualCoelhos = (somaCoelhos / somaTotal) * 100;
        percentualRatos = (somaRato / somaTotal) * 100;
        percentualSapos = (somaSapos / somaTotal) * 100;

        System.out.printf("Total: %d cobaias%n", (int) somaTotal);
        System.out.printf("Total de coelhos: %d%n",(int) somaCoelhos);
        System.out.printf("Total de ratos: %d%n", (int) somaRato);
        System.out.printf("Total de sapos: %d%n",(int) somaSapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

        input.close();
    }
}
