package NestedClasses.b.staticc.nestedd.classss;



public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int stCarElem;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void mth(){
        System.out.println(Engine.countOfObj);
        Engine enj = new Engine(22);
        System.out.println(enj.horsePower);
    }

    @Override
    public String toString() {
        return "My car {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        private static int countOfObj;

        public Engine(int horsePower) {
            System.out.println(stCarElem);
//            System.out.println(doorCount);//не разрешит это сделать(к переменным non-static внешнего класа нельзя обращаться!!!)
            this.horsePower = horsePower;
            countOfObj++;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
