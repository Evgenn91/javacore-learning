package Collections.c.list.stack;

public class StackWorkMethodsExample {
    static void ab1(){
        System.out.println("start ab1");
        System.out.println("finish ab1");
    }

    static void ab2(){
        System.out.println("start ab2");
        ab1();
        System.out.println("finish ab2");
    }

    static void ab3(){
        System.out.println("start ab3");
        ab2();
        System.out.println("finish ab3");
    }
    public static void main(String[] args) {
        StackWorkMethodsExample.ab3();
        //вывод:
        // start ab3
        // start ab2
        // start ab1
        // finish ab1
        // finish ab2
        // finish ab3
    }
}
