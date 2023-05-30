package org.example;

public class CarService {
    public void showMove(Car car){
        car.move();
    }

    public void showRealMove(AbstractCar car){
        car.realMove();
    }
}
