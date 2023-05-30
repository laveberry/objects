package org.example;

//추상화 : 인터페이스 구현
public class Bus implements Car{
    //캡슐화 : 정보은닉
    private int cnt = 0;
    @Override
    public void move() {
        cnt++;
    }
}
