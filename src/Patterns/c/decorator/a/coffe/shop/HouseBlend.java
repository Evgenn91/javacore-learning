package Patterns.c.decorator.a.coffe.shop;

//второй конкретный класс, который будем декорировать

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend Coffe");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
