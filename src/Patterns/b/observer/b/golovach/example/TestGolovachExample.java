package Patterns.b.observer.b.golovach.example;


//когда на одно нажали то другой, который был нажат, перестает был нажатым

import Patterns.b.observer.b.golovach.example.entity.Mouse;
import Patterns.b.observer.b.golovach.example.listener.RadioButton;

//видео находится на OOP#3 December2013 видео4 14:52
public class TestGolovachExample {
    public static void main(String[] args) {
        RadioButton rb0 = new RadioButton(0,0);
        RadioButton rb1 = new RadioButton(10,10);
        RadioButton rb2 = new RadioButton(20,20);
        rb0.addListener(rb1);
        rb0.addListener(rb2);
        rb1.addListener(rb0);
        rb1.addListener(rb2);
        rb2.addListener(rb0);
        rb2.addListener(rb1);

        //доделать с расположение координат я тут не так списал
        System.out.println(rb0.on +" : "+rb1.on +" : "+rb2.on);
        Mouse.click(0,4);
        System.out.println(rb0.on +" : "+rb1.on +" : "+rb2.on);
        Mouse.click(0,0);
        System.out.println(rb0.on +" : "+rb1.on +" : "+rb2.on);

    }
}
