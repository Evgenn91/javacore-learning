package Generics.a.parameterized.clas.twoparam.identicalparam;

/**
 *таким образом мы создали класс, который может хранить 2 значения одного типа!
 */
public class IdentPair<V> {
    private V value1;
    private V value2;

    public IdentPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
