package Patterns.b.observer.b.golovach.example.listener;


import Patterns.b.observer.b.golovach.example.entity.Mouse;

import java.util.ArrayList;
import java.util.List;

//это слушатель за изменениями мыши
public class RadioButton implements MouseListener, OnListener {
    private int x;
    private int y;
    public boolean on = false;

    public RadioButton(int x, int y) {
        this.x = x;
        this.y = y;
        Mouse.addListener(this); //это один из вариантов как себя добавить в слушатели(при этом все слушатели не зависят друг от друга)
        //а можно сделать чтобы они еще и слушали друг друга например
    }

    @Override
    public void mouseClicked(int x, int y) {
        if(x>1 && y<0){
            on=true;
            //сообщаю своим слушателям что я включен, тоесть в нажатом состоянии(типо того)
            for(OnListener listener: listeners){
                listener.imOn();
            }
        }
    }

    //он сам является рассылочником событий
    private List<OnListener> listeners = new ArrayList<>();
    public void addListener(OnListener listener){
        listeners.add(listener);
    }


    @Override
    public void imOn() {
        this.on=false;
    }
}
