package iniciante.bee1114;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senha;

        while(true){
            senha = input.nextInt();

            if(senha == 2002){
                System.out.printf("Acesso Permitido%n");
                break;
            }

            else{
                System.out.printf("Senha Invalida%n");
            }
        }

        input.close();
    }
}
