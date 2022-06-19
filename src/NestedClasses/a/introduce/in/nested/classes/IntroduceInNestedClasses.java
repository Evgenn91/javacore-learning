package NestedClasses.a.introduce.in.nested.classes;

/**
 * ВВедение во вложенные кассы
 * обычно их используют когда нам нужно тесно привезать один класс к другому (внемшему)
 */
public class IntroduceInNestedClasses {
    public static void main(String[] args) {

    }


    //1. статический класс
    static class A{}

    //2. inner class(просто внутренний класс)
    class B{}

    //3. локальный класс
    void method(){
        class C{}
    }

    //4. анонимный класс
}
