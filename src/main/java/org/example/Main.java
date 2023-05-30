package org.example;

public class Main {
    public static void main(String[] args) {

        CarService carService = new CarService();

        carService.showMove(new Bus());
        carService.showMove(new Truck());
        //람다
        carService.showMove(()-> System.out.println("메인 무브 출력"));

        carService.showRealMove(new Taxi());
    }
}