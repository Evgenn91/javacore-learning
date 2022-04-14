package Generics.d.subtyping;

import java.util.ArrayList;

public class MethSubTypingExample {
    public static <T extends Number> T getSecondElement(ArrayList<T> all) {
        return all.get(1);
    }
}
