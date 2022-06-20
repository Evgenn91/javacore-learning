package NestedClasses.d.local.inner.classs;

public class XLocalInner2 {
    public static void main(String[] args) {

        class Slojenie implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }

        Slojenie slj = new Slojenie();
        System.out.println(slj.doOperation(3,4));
    }
}

interface Math2{
    int doOperation(int a, int b);
}
