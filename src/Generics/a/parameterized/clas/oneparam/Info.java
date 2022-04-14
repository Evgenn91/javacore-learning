package Generics.a.parameterized.clas.oneparam;

/**
 * T - подразумевает, что мы можем передать любой параметр
 *
 */
public class Info <T>{
    private T value; /* эта переменная не может быть статической!!! */

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
