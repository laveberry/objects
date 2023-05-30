package org.example;

public class Taxi extends AbstractCar{
    @Override
    void realMove() {
        System.out.println("인터페이스 구현한 추상클래스 상속");
    }
}
