package com.company;

import java.util.Scanner;
public class Main {

    Scanner MyScanner = new Scanner(System.in);
    Scanner enterMyScanner = new Scanner(System.in);
    public Scanner getEnterMyScanner(){
        System.out.println("PRESS ENTER");
        enterMyScanner.nextLine();
        return enterMyScanner;
    }


    String graczImie;
    String graczKlasa;
    String graczBron;
    int graczGotowka;
    int graczHP;
    int choice;
    int goblinHP;





    public static void main(String[] args) {

        Main game;
        game = new Main();
        game.gracz();
        game.poczatek();
        game.miasto();
        game.tawerna();
        game.gildia();
        game.opuszczonyZanek();
        game.walcz();
        game.zatakuj();
        game.dead();
        game.wygrales();


    }



    public void gracz(){



        graczGotowka = 9000;
        graczHP = 100;
        graczBron ="nóż";
        goblinHP = 10;

        System.out.println("Gracz posiada " + graczGotowka + "$ " + "jego hp wynosi: " + graczHP + "oraz posiada broń " + graczBron);



        System.out.println("Podaj Imie:");

        graczImie = MyScanner.nextLine();


        System.out.println("\n----------------------\n");
        System.out.println("Podaj Klase:");
        System.out.println("1: Wojownik");
        System.out.println("2: Złodziej");
        System.out.println("\n----------------------\n");

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
        System.out.println("\n----------------------\n");
        System.out.println("Twoje imię to: " + graczImie);
        System.out.println("Twoje Klasa to: " + graczKlasa);
        System.out.println("\n----------------------\n");
        getEnterMyScanner().nextLine();




    }

    public void poczatek(){




        System.out.println("\n----------------------\n");
        System.out.println("Obudziłeś się na wyspiek");
        System.out.println("Zauważyłeś skrzynkę");
        System.out.println(" ");
        System.out.println("1: Przeszukaj skrzynkę :");
        System.out.println("2: idź drogrą do najbliższego miasta :");
        System.out.println("3: Zobacz statystyki :");
        System.out.println("\n----------------------\n");



        choice = MyScanner.nextInt();

        if(choice==1) {
            System.out.println("\n----------------------\n");
            System.out.println("W drodze do skrzynki zatakował cie potwór");
            if (graczKlasa.equals("Wojownik")) {
                System.out.println("zabiłeś potwora");
                System.out.println("Otworzyłeś skrzynkę");
                System.out.println("Skrzynka okazała się pusta");
                System.out.println("\n----------------------\n");
                getEnterMyScanner().nextLine();
                poczatek();
            }
            if (graczKlasa.equals("Złodziej")) {

            graczHP = graczHP - 2;
            System.out.println("Potwór  zadał ci 2 punkty obrazen");
            System.out.println("Przegrałeś walkę i musiałeś uciec");
            System.out.println("twoja HP wynosi:" + graczHP);
            System.out.println("\n----------------------\n");
            getEnterMyScanner().nextLine();
            poczatek();
        }

        }
        else if(choice==2){
            System.out.println("Rozpoczołeś swoją podróż");
            System.out.println("\n");
            miasto();
            getEnterMyScanner().nextLine();


        }

        else if(choice==3){
            System.out.println("\n----------------------\n");
            System.out.println("Imie: " + graczImie);
            System.out.println("Klasa: " + graczKlasa);
            System.out.println("HP: " + graczHP);
            System.out.println("Pieniądze: " + graczGotowka +"$");
            System.out.println("Broń: " + graczBron);
            System.out.println("\n----------------------\n");
            getEnterMyScanner().nextLine();
            poczatek();

        }

        else {
            poczatek();

        }

    }

    public void miasto(){
        System.out.println("\n----------------------\n");
        System.out.println("Jesteś w mięśćie");
        System.out.println(" ");
        System.out.println("1:Tawerna:");
        System.out.println("2:Handlarza:");
        System.out.println("3:Gildia:");
        System.out.println("4:Wróć na początek:");
        System.out.println("\n----------------------\n");

        choice = MyScanner.nextInt();

        if(choice==1) {
           tawerna();
           getEnterMyScanner().nextLine();
            }

        if(choice==2) {
            tawerna();
            getEnterMyScanner().nextLine();
        }

        if(choice==3) {
            gildia();
            getEnterMyScanner().nextLine();
        }

        if(choice==4) {
            System.out.println("\n----------------------\n");
            System.out.println("3:Wróciełeś się na początek:");
            System.out.println("\n----------------------\n");
            poczatek();
            getEnterMyScanner().nextLine();
        }

        else {
            miasto();

        }




    }

    public void tawerna() {
        System.out.println("\n----------------------\n");
        System.out.println("Jesteś w Tawernie");
        System.out.println(" ");
        System.out.println("1:Kup jedzenie (Odnowi HP):");
        System.out.println("2:Idź spać:");
        System.out.println("3:Wróć do miasta:");
        System.out.println("4: Zobacz statystyki :");
        System.out.println("\n----------------------\n");

        choice = MyScanner.nextInt();

        if (choice == 1) {
            System.out.println("\n----------------------\n");
            System.out.println("Zjadłeś smaczy posiłek twoje HP jest pełne");
            System.out.println("\n----------------------\n");
            graczHP = 100;
            getEnterMyScanner().nextLine();
        }
        if (choice == 2) {
            System.out.println("\n----------------------\n");
            System.out.println("Jesteś wypoczęty");
            System.out.println("\n----------------------\n");
            getEnterMyScanner().nextLine();
            tawerna();
        }
        if (choice == 3) {
            miasto();
        } else if (choice == 4) {
            System.out.println("\n----------------------\n");
            System.out.println("Imie: " + graczImie);
            System.out.println("Klasa: " + graczKlasa);
            System.out.println("HP: " + graczHP);
            System.out.println("Pieniądze: " + graczGotowka + "$");
            System.out.println("Broń: " + graczBron);
            System.out.println("\n----------------------\n");
            getEnterMyScanner().nextLine();
            tawerna();

        } else {
            tawerna();

        }
    }

    public void gildia(){
        System.out.println("\n----------------------\n");
        System.out.println("Jesteś w Gildi wybierz zadanie");
        System.out.println(" ");
        System.out.println("1:Przeszukaj ruiny zamku:");
        System.out.println("2:--------:");
        System.out.println("3:Wróć do miasta:");
        System.out.println("4: Zobacz statystyki :");
        System.out.println("\n----------------------\n");

        choice = MyScanner.nextInt();

        if (choice == 1) {
            System.out.println("\n----------------------\n");
            System.out.println("idziesz do zamku");
            System.out.println("\n----------------------\n");
            getEnterMyScanner().nextLine();
            opuszczonyZanek();
        }
        if (choice == 3) {
            miasto();
        } else if (choice == 4) {
            System.out.println("\n----------------------\n");
            System.out.println("Imie: " + graczImie);
            System.out.println("Klasa: " + graczKlasa);
            System.out.println("HP: " + graczHP);
            System.out.println("Pieniądze: " + graczGotowka + "$");
            System.out.println("Broń: " + graczBron);
            System.out.println("\n----------------------\n");
            getEnterMyScanner().nextLine();
            gildia();

        } else {
            tawerna();

        }

    }

    public void opuszczonyZanek(){
        System.out.println("\n----------------------\n");
        System.out.println("Jesteś w Zamku");
        System.out.println("Spotkałeś Gobilna na swojej drodze");
        System.out.println(" ");
        System.out.println("1:Walczcz:");
        System.out.println("2:Uciekaj:");
        System.out.println("\n----------------------\n");

        choice = MyScanner.nextInt();

        if (choice == 1) {
            walcz();
        }
        if (choice == 2) {
            miasto();
        }

        else {
            opuszczonyZanek();
        }
    }

    public void walcz(){
        System.out.println("\n----------------------\n");
        System.out.println("Twoje HP: " + graczHP);
        System.out.println("Goblin HP: " + goblinHP);
        System.out.println("\n1: Atakuj");
        System.out.println("\n2: Uciekaj");
        System.out.println("\n----------------------\n");

        choice = MyScanner.nextInt();

        if (choice == 1) {
            zatakuj();
        }
        if (choice == 2) {
            miasto();
        }

        else {
            walcz();
        }

    }

    public void zatakuj(){
        int graczObrazenia = 0;


        if(graczBron.equals("nóż")){
            graczObrazenia = new java.util.Random().nextInt(5);
        }

        if(graczBron.equals("miecz")){
            graczObrazenia = new java.util.Random().nextInt(10);
        }

        System.out.println("Zatakowałeś goblina i zadałeś mu " + graczObrazenia + " Obrażeń");

        goblinHP = goblinHP - graczObrazenia;

        System.out.println("Goblin HP: " + goblinHP);

        if(goblinHP<1){
            wygrales();
        }

        if(goblinHP>0){
            int goblinObrazenia =0;

            goblinObrazenia = new java.util.Random().nextInt(4);

            System.out.println("Gobiln zatakował i otrzymałeś " + goblinObrazenia + " Obrażeń");

            graczHP = graczHP - goblinObrazenia;

            System.out.println("Gracz HP wynosi: " + graczHP);

        }

        if(graczHP<1){
            dead();
        }
        if(graczHP>0){
            walcz();
        }
    }

    public void dead(){
        System.out.println("\n----------------------\n");
        System.out.println("Zginąłeś zacznij od początku");
        getEnterMyScanner().nextLine();
        gracz();
        System.out.println("\n----------------------\n");

    }

    public void wygrales(){
        System.out.println("\n----------------------\n");
        System.out.println("Udało ci się zabić goblina możesz iść dalej");
        System.out.println("\n----------------------\n");
        getEnterMyScanner().nextLine();
        miasto();



    }
}
