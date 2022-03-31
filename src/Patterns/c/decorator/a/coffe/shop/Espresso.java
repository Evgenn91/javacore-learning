package Patterns.c.decorator.a.coffe.shop;

//конкретный класс, который мы будем декорировать

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
