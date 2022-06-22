package LambdaExpressions.a.introduceLambda;

public class Dopolnenie {
    static void def(I i){
        System.out.println(i.abc("Hi"));
    }

    public static void main(String[] args) {
        def((String str) -> { return str.length();});
    }
}

interface I {
    int abc(String s);
}
