package Generics.a.parameterized.clas.oneparam;

public class TestParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("hello");/* (hello)- это наш конструктор */
        String inf = info1.getValue();
        System.out.println(info1);

        System.out.println("---------------------");
        System.out.println("---------------------");

        Info<Integer> info2 = new Info<>(1);
        System.out.println(info2);

    }
}
