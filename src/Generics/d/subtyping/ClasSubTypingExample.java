package Generics.d.subtyping;

/**
 * задача, чтобы <T> класса Info был только числами
 *
 * Принцип в том, что во время выполнения в <T> подставляется Object(а потом происходит приведение к нужному типу)
 * а во время выполнения <T extends Number> подставляется Number(тоесть наш класс может быть Number или его подвиды)
 */
public class ClasSubTypingExample {
    Info<Integer> info1 = new Info<>(1);
//    Info<String> info2 = new Info<String>("hello"); /* так компилятор не разрешит сделать!!!!! */
}

class Info<T extends Number>{
    private T value;

    public Info(T value) { this.value = value; }

    public T getValue() { return value; }

    @Override
    public String toString() { return "Info{" + "value=" + value + '}';}
}
