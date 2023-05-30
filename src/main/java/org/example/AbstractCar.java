package org.example;

//추상화 클래스 : 추상메소드를 한개이상 가짐
public abstract class AbstractCar implements Car {

    @Override
    public void move() {
        System.out.println("인터페이스 상속한 추상클래스");
    }

    //추상클래스
    abstract void realMove();
}
