package Algorithms.a.components.of.algorithm;

/**
 * Обмен значениями элементов
 * Делается двумя способами:
 * 1. Обмен через временную переменную(работает для любых типов)
 * 2. Обмен без временной переменной(минус: работает только с Integer и вроде как еще с Double)
 * 2.1 Пример с оператором "+"
 * 2.2 Пример с оператором "^" (это только с целыми цислами)
 */

public class a_ExchangeOfElementValues {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        vremPeremenn(a,b);
        vivodNaEkran(a,b);

        bezVremPeremenn21(a,b);
        vivodNaEkran(a,b);

        bezVremPeremenn22(a,b);
        vivodNaEkran(a,b);

    }

    //1. Обмен через временную переменную
    public static void vremPeremenn(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

    //2.1 Обмен без временной переменной (оператор "+")
    public static void bezVremPeremenn21(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
    }

    //2.2 Обмен без временной переменной (оператор "^")
    public static void bezVremPeremenn22(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    //метод вывода на экран
    public static void vivodNaEkran(int a, int b){
        System.out.println("a - "+a);
        System.out.println("b - "+b);
        System.out.println("========================" );
    }
}
