package LambdaExpressions.e.consumerr.and.foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("buy");
        list.add("oh my gosh");
        list.add("this is cool");

        for(String i:list){
            System.out.println(i);
        }
        System.out.println("------------------");
        list.forEach(str -> System.out.println(str));

        System.out.println("------------------");
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);

        listInt.forEach(in -> {
            System.out.println(in);
            in *= 5;
            System.out.println(in);
        });

    }
}
