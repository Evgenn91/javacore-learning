package Patterns.c.decorator.a.coffe.shop;


//это класс, который будут наследовать все декораторы,
// а этот класс должен в свою очередь обязательно унаследован быть от родителя того же класса
// чтобы использовать его как тот класс, который мы декорировали

public abstract class CondimentDecorator extends Beverage {
    //все декораторы должны заново реализовать метод getDescription(потомучто имя напитка изменится)
    public abstract String getDescription();
}
