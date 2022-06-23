package LambdaExpressions.c.predicatee.and.removeif;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIfExample {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Hi");
        strList.add("Buy");
        strList.add("I am learning java");
        strList.add("this is good");
        strList.add("oh my gosh");

        strList.removeIf(element -> element.length()<5 );

//        Predicate<String> p = element -> element.length()<5 ;
//        strList.removeIf(p);

        System.out.println(strList);
    }
}
