package LambdaExpressions.b.introduceLambdaPart2;

public class Dopoln {

    static void def(I i){
        System.out.println(i.abc("dddd"));
    }

    public static void main(String[] args) {
//        int s = 1; // нельзя в методе объявлять переменные с такьй же символикой, как и в аргументе лямбды
        int i = 10; //ее можно использовать в лямбда выражении НО!!!! ее нельза менять больше!!!!
//        i = 4;//ТАК НЕЛЬЗЯ!!!
        def((String s) -> { return s.length() + i;}); //s видна только внутри лямбда выражения
    }
}

interface I {
    int abc (String s);
}

