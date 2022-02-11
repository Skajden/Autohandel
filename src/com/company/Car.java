package com.company;

public class Car {

    String nazwa;
    int cena;
    int zniszenie;

    public Car(String nazwa, int cena, int zniszenie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.zniszenie = zniszenie;

    }

    public String getNazwa() {
        return nazwa;
    }

    public static void Bron(String[] args) {
        Car nóż = new Car("nóż", 2000, 100);
        com.company.Car Miecz = new com.company.Car("Miecz", 1000, 10);
        com.company.Car Topor = new com.company.Car("Topor", 600, 20);
        com.company.Car Włócznia = new com.company.Car("Włócznia", 600, 20);
        com.company.Car Młot = new com.company.Car("Młot", 200, 200);
        com.company.Car sztylety = new com.company.Car("sztylety", 200, 200);
        com.company.Car Szable = new com.company.Car("Szable", 200, 200);

        System.out.println(nóż.getNazwa());
    }
}