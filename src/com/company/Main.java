package com.company;

import java.util.Scanner;
public class Main {

    Scanner MyScanner = new Scanner(System.in);
    Scanner enterMyScanner = new Scanner(System.in);

    String graczImie;
    String graczKlasa;
    int graczGotowka;
    int graczHP;
    int choice;




    public static void main(String[] args) {

        Main game;
        game = new Main();
        game.gracz();
        game.poczatek();


    }



    public void gracz(){



        graczGotowka = 9000;
        graczHP = 100;

        System.out.println("Gracz posiada " + graczGotowka + "$ " + "oraz jego hp wynosi: " + graczHP);



        System.out.println("Podaj Imie:");

        graczImie = MyScanner.nextLine();



        System.out.println("Podaj Klase:");
        System.out.println("1: Wojownik");
        System.out.println("2: Złodziej");

        choice = MyScanner.nextInt();
        graczKlasa = MyScanner.nextLine();

        if(choice == 1){
            graczKlasa = "Wojownik";
        }
        else if(choice == 2) {
            graczKlasa = "Złodziej";
        }

        else {
            System.out.println("Podałeś złą klasę postaci ");
            System.out.println("Wybierz jeszcze raz");
            gracz();


        }

        System.out.println("Twoje imię to: " + graczImie);
        System.out.println("Twoje Klasa to: " + graczKlasa);

        enterMyScanner.nextLine();




    }

    public void poczatek(){




        System.out.println("----------------------");
        System.out.println("\n");
        System.out.println("Obudziłeś się na wyspiek");
        System.out.println(" ");
        System.out.println("1: Przeszukaj skrzynkę :");
        System.out.println("2: idź drogrą do najbliższego miasta :");
        System.out.println("3: Zobacz statystyki :");



        choice = MyScanner.nextInt();

        if(choice==1) {
            System.out.println("W drodze do skrzynki zatakował cie potwór");
            if (graczKlasa.equals("Wojownik")) {
                System.out.println("zabiłeś potwora");
                enterMyScanner.nextLine();
                poczatek();
            }
            if (graczKlasa.equals("Złodziej")) {

            graczHP = graczHP - 2;
            System.out.println("Potwór wygrał walkę i musiałeś uciec");
            System.out.println("twoja HP wynosi:" + graczHP);
            enterMyScanner.nextLine();
            poczatek();
        }

        }
        else if(choice==2){
            System.out.println("Rozpoczołeś swoją podróż");
            enterMyScanner.nextLine();
            poczatek();


        }

        else if(choice==3){
            System.out.println("Imie: " + graczImie);
            System.out.println("Klasa: " + graczKlasa);
            System.out.println("HP: " + graczHP);
            System.out.println("Pieniądze: " + graczGotowka +"$");
            enterMyScanner.nextLine();
            poczatek();

        }

        else {
            poczatek();

        }

    }
}
