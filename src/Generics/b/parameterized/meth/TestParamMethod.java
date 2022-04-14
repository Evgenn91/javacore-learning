package Generics.b.parameterized.meth;

import java.util.ArrayList;

public class TestParamMethod {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        all.add(10);
        all.add(20);
        all.add(30);
        int secondElem = GenerMethod.getSecElem(all);
        System.out.print(secondElem);

//        String secElem = GenerMethod.getSecElem(all); /* так сделать не получится!!! компилятор будет рагаться */
    }
}
