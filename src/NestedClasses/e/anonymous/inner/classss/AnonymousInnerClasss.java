package NestedClasses.e.anonymous.inner.classss;

import NestedClasses.d.local.inner.classs.Math;

/**
 * анонимный внутренний класс не имеет имени
 * используются всегда, когда нужно использовать локальный внутренний класс
 *
 * второй раз мы не можем воспользоваться анонимным классом( у него нету ссылки)
 * анонимный класс нужен, когда нам нужно на ходу создать объект какого то класса,
 * который унаследован от класса или интерфейса и переопределить метод из родительского класса
 *
 * анонимный класс - это объявление класса и одновременное создание объекта
 * в анонимных классах нельзя написать конструктор(поидее можно)
 * может обращаться даже к private елементам внешнего класса
 *
 * lambda expression - это краткая форма написания анонимных классов
 *
 */
public class AnonymousInnerClasss {
    public static void main(String[] args) {
        Math2 m = new Math2(){
            //можно что нить от себя еще написать
            //int c = 1; например(но нужно ли это)
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m.doOperation(3,6));

        Math2 m2 = new Math2(){
            @Override
            public int doOperation(int a, int b) {
                return a - b;
            }
        };
        System.out.println(m2.doOperation(3,6));

        Math3 m3 = new Math3(){
            @Override
            public int doOperation(int a, int b) {
                return a - b;
            }
        };
        System.out.println(m3.doOperation(3,6));



    }
}

interface Math2{
    int doOperation(int a, int b);
}

class Math3{
    int doOperation(int a, int b){
        return a/b;
    }
}

