package iniciante.uri1049;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String primeiroTipoAnimal;
        String segundoTipoAnimal;
        String terceiroTipoAnimal;

        primeiroTipoAnimal = input.nextLine();
        segundoTipoAnimal = input.nextLine();
        terceiroTipoAnimal = input.nextLine();

        if (primeiroTipoAnimal.equals("vertebrado") && segundoTipoAnimal.equals("ave") &&
                terceiroTipoAnimal.equals("carnivoro")){

            System.out.printf("aguia%n");
        }
        if (primeiroTipoAnimal.equals("vertebrado") && segundoTipoAnimal.equals("ave") &&
                terceiroTipoAnimal.equals("onivoro")) {

            System.out.printf("pomba%n");
        }
        if (primeiroTipoAnimal.equals("vertebrado") && segundoTipoAnimal.equals("mamifero") &&
                terceiroTipoAnimal.equals("onivoro")) {

            System.out.printf("homem%n");
        }
        if (primeiroTipoAnimal.equals("vertebrado") && segundoTipoAnimal.equals("mamifero") &&
                terceiroTipoAnimal.equals("herbivoro")) {

            System.out.printf("vaca%n");
        }
        if (primeiroTipoAnimal.equals("invertebrado") && segundoTipoAnimal.equals("inseto") &&
                terceiroTipoAnimal.equals("hematofago")) {

            System.out.printf("pulga%n");
        }
        if (primeiroTipoAnimal.equals("invertebrado") && segundoTipoAnimal.equals("inseto") &&
                terceiroTipoAnimal.equals("herbivoro")) {

            System.out.printf("lagarta%n");
        }
        if (primeiroTipoAnimal.equals("invertebrado") && segundoTipoAnimal.equals("anelideo") &&
                terceiroTipoAnimal.equals("hematofago")) {

            System.out.printf("sanguessuga%n");
        }
        if (primeiroTipoAnimal.equals("invertebrado") && segundoTipoAnimal.equals("anelideo") &&
                terceiroTipoAnimal.equals("onivoro")) {

            System.out.printf("minhoca%n");
        }

        input.close();
    }
}
