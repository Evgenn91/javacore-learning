package Patterns.c.decorator.a.coffe.shop;

//родительский класс напиток
public abstract class Beverage {
    //имеет поле название напитка
    String description = "Unknow Beverage";

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //метод возврата стоимости напитка
    public abstract double cost();
}
