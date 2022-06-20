package NestedClasses.c.inner.classss;

public class Car {
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount, int hoursePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(hoursePower);
    }

//    void mth(){
//        System.out.println(Engine.countOfObj);
//        Engine enj = new Engine(22);
//        System.out.println(enj.horsePower);
//    }

    @Override
    public String toString() {
        return "My car {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
