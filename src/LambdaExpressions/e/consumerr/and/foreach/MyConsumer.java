package LambdaExpressions.e.consumerr.and.foreach;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Consumer<T> - следующий интерфейс из java.util.function (противоположен методу Supplier)
 * у него есть метод - void accept(T t); (ничего не отдает, а наоборот берет объект типа T)
 * (тоесть подразумевается что мы хотим что то сделать с объектом)
 */
public class MyConsumer {

    //создадим метод, который как то меняет нашу машину
    public static void changeCar(Car car,Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        Car car1 = new Car("bmw", "red", 1.8);
        Car car2 = new Car("vw", "blue", 2.0);
        Car car3 = new Car("bmw", "black", 1.6);
        Car car4 = new Car("mb", "white", 4.8);
        Car car5 = new Car("audi", "black", 3.4);

        ArrayList<Car> listCar = new ArrayList<>();
        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);
        listCar.add(car5);

        changeCar(listCar.get(0), car -> {
            car.color = "blue";
            car.engine = 3.0;
            System.out.println("upgraded car: " + car);
        });

        System.out.println(listCar);

    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
