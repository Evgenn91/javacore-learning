package Generics.d.subtyping;

/**
 * если мы хотим чтобы <T> было Number или интерфейсом T1 или T2
 * Т может наследоваться только от одного класса и мнжества интерфейсов(но наследование только одно!!!)
 */
public class ClassSubTypeSeveralInterface {
}

class InfoSeverlInterf<T extends Number&T1&T2>{ /* класс обязателько стоит на первом месте */
    private T value;

    public InfoSeverlInterf(T value) { this.value = value; }

    public T getValue() { return value; }

    @Override
    public String toString() { return "Info{" + "value=" + value + '}';}
}

interface T1 { }

interface T2 { }
