package Patterns.b.observer.b.golovach.example.entity;

import Patterns.b.observer.b.golovach.example.listener.MouseListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//класс рассылки своих изменений
public class Mouse {
    private static List<MouseListener> listeners = new ArrayList<>();

    static {
        new Thread(new Runnable() {
            final Random rnd = new Random();
            @Override
            public void run() {
                //в бесконечном цикле кликает на случайное место на экране
                while (true){
                    click(rnd.nextInt(1000), rnd.nextInt(1000));
                }
            }
        }).start();
    }

    public static void click(int x, int y){
        for (MouseListener listener: listeners){
            listener.mouseClicked(x,y);
        }
    }

    public static void addListener(MouseListener listener){
        listeners.add(listener);
    }
}
