package Generics.a.parameterized.clas.twoparam.identicalparam;


public class TestParamClass {
    public static void main(String[] args) {
        IdentPair<Integer> part1 = new IdentPair<>(6, 3);
        System.out.println("value1 = " + part1.getFirstValue());
        System.out.println("value2 = " + part1.getSecondValue());
    }
}
