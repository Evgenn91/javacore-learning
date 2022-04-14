package Generics.c.erasure.type;

/**
 * в данном примере у нас есть у предка метод с аргуметном дженериком
 * если мы в потомке попробуем создать такой же метод, но с другим типом аргумента дженерика,
 * то компилятор не даст нам это сделать!!!!
 */
public class ExampleSecond {
}

class Parent {
    public void abcd(Info<String> info) {

    }
}

class Child extends Parent {
//    public void abcd(Info<Integer> info) { /* компилятор не даст это сделать!!!! просто переопределить метод можно, а так нельзя */
//
//    }
}




