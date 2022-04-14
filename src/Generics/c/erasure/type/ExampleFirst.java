package Generics.c.erasure.type;

/**
 * erasure - это стирание типов
 * Информацию о дженериках знает только компилятор, в runtime информация удаляется!(т.е. JVM видит другое)
 */
public class ExampleFirst {
    //пример: эти 2 метода не будут работать вместе!!!! (хотя вроде мы "перегружаем" метод abc)
    //для JVM они будут выглядеть одинаково и поэтому компилятор не пропустит данное написание

//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }

    public void abc(Info<Integer> info) {
        Integer i = info.getValue();
    }
}
class Info<T>{
    private T value;

    public Info(T value) { this.value = value; }

    public T getValue() { return value; }

    @Override
    public String toString() { return "Info{" + "value=" + value + '}'; }
}
