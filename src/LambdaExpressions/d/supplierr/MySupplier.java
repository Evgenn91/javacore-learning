package LambdaExpressions.d.supplierr;


import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * Supplier<T> - следующий интерфейс из java.util.function
 *  у него есть метод - T get(); (не принимает параметры а возвращает объект типа T) (метож который поставляет объекты)
 *
 */
public class MySupplier {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){
        ArrayList<Car> al = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }


    public static void main(String[] args) {
//        Car car1 = new Car("bmw", "red", 1.8);
//        Car car2 = new Car("vw", "blue", 2.0);
//        Car car3 = new Car("bmw", "black", 1.6);
//        Car car4 = new Car("mb", "white", 4.8);
//        Car car5 = new Car("audi", "black", 3.4);

        ArrayList<Car> listCal = createThreeCars(() -> new Car("bmw", "red", 1.8)); //добавит 3 таких машины
        System.out.println(listCal);

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
