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
        com.company.Car nóż = new com.company.Car("nóż", 2000, 100);
    }
}