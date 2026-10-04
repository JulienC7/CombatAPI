package com.iim.project.model;

import java.util.Scanner;

public class Main {

    public static void Main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Anisse anisse = new Anisse();
        Quentin quentin = new Quentin();

        int victoireAnisse = 0;
        int victoireQuentin = 0;

        System.out.println("MACHINE A COUPS DE POING");
        System.out.println("ANISSE VS QUENTIN");


        System.out.println("Combien de rounds voulez-vous faire ?");

        int rounds = scanner.nextInt();

        while (rounds <= 0) {

            System.out.println("Veuillez choisir au moins 1 round :");

            rounds = scanner.nextInt();
        }


        for (int i = 1; i <= rounds; i++) {

            System.out.println();
            System.out.println(" ROUND " + i + " ");


            int scoreAnisse = anisse.frapper();


            int scoreQuentin = quentin.frapper();


            if (scoreAnisse > scoreQuentin) {

                System.out.println("Anisse gagne le round !");
                victoireAnisse++;

            } else if (scoreQuentin > scoreAnisse) {

                System.out.println("Quentin gagne le round !");
                victoireQuentin++;

            } else {

                System.out.println("Egalite sur ce round !");
            }

            System.out.println();
            System.out.println("Score general :");
            System.out.println("Anisse : " + victoireAnisse);
            System.out.println("Quentin : " + victoireQuentin);
        }


        System.out.println();
        System.out.println(" FIN DU COMBAT ");

        if (victoireAnisse > victoireQuentin) {

            System.out.println("ANISSE REMPORTE LE DUEL !");

        } else if (victoireQuentin > victoireAnisse) {

            System.out.println("QUENTIN REMPORTE LE DUEL !");

        } else {

            System.out.println("LE DUEL SE TERMINE PAR UNE EGALITE !");
        }

        scanner.close();
    }
}