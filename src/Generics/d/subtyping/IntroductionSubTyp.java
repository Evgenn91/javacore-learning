package Generics.d.subtyping;

import java.util.ArrayList;
import java.util.List;

/**
 * subtyping - это сужение типа <T> до определенного,
 * например мы можем сузить Т , чтобы мы могли хранить только числовые значени (<T extends Number>)
 * это означает что <T> может быть потомком Number или являться им
 */
public class IntroductionSubTyp {
    public static void main(String[] args) {
        X x = new Y();
//        List<X> listX = new ArrayList<Y>(); /* так мы не можем сделать!!! */

//        List<Number> numberList = new ArrayList<Integer>(); /* так тоже компилятор не позволит сделать */

        /**
         * если так можно было сделать, то мы моглы бы это:
         * numberList.add(18);
         * numberList.add(3.14);
         * numberList.add(5.01f);
         */
    }
}

class X { }

class Y extends X { }

