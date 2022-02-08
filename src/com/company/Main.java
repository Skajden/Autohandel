package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Main game;
        game = new Main();
        game.handlarz();


    }

    public void handlarz(){

        int handlarzGotowka;
        handlarzGotowka = 5000;

        String handlarzSamochod;
        handlarzSamochod = "Ford";

        System.out.println("handlarz posiada " + handlarzGotowka + "$ " + "oraz ma samochod: " + handlarzSamochod);

        String HandlarzImie;

        Scanner MyScanner;

        MyScanner = new Scanner(System.in);

        System.out.println("Podaj Imie:");

        HandlarzImie = MyScanner.nextLine();

        System.out.println("Twoje imię to: " + HandlarzImie);





    }
}
