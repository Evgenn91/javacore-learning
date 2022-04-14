package Generics.a.parameterized.clas.twoparam.differentparam;

/**
 *таким образом мы создали класс, который может хранить 2 значения разных типом(и одинаковых)
 */
public class Pair <V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
