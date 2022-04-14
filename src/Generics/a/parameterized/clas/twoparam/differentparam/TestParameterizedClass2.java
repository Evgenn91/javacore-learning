package Generics.a.parameterized.clas.twoparam.differentparam;

public class TestParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> part1 = new Pair<>("hello", 3);
        System.out.println("value1 = " + part1.getFirstValue());
        System.out.println("value2 = " + part1.getSecondValue());
    }
}
