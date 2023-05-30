package org.example;

public class Truck implements Car{
    //캡슐화
    private int cnt = 0;
    @Override
    public void move() {
        cnt+=2;
    }
}
