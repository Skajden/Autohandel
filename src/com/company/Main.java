package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Main game;
        game = new Main();
        game.handlarz();
        game.Salon();


    }

    public void handlarz(){

        int handlarzGotowka;
        handlarzGotowka = 5000;

        String handlarzSamochod;
        handlarzSamochod = "Ford";

        System.out.println("handlarz posiada " + handlarzGotowka + "$ " + "oraz masz samochod: " + handlarzSamochod);

        String HandlarzImie;

        Scanner MyScanner;

        MyScanner = new Scanner(System.in);

        System.out.println("Podaj Imie:");

        HandlarzImie = MyScanner.nextLine();

        System.out.println("Twoje imię to: " + HandlarzImie);


    }

    public void Salon(){
        System.out.println("----------------------");
        System.out.println("\n");
        System.out.println("Jesteś w salonie");
        System.out.println("");
        System.out.println("Wybierz samochód do kupna:");

    }
}
