package Streamss.f.princip.chaining;

import Streamss.b.methodd.filter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * chaining - это не метод, а принцип цепочки методов для использования
 *
 * Принцип работы: у нас есть source(коллекция и т.д.)
 *                          |
 *                          V
 *               Intermediate methods(lazy) - это промежуточные методы(обрабатывают поступающие элементы(stream) и возвращают Stream)
 *                          |                     в цепочке их могут быть сколько угодно (нюанс: они не начнут работать до тех пор пока
 *                          V                                                             не запустим терминальный меиод!!! - поэтому и называются lazy)
 *               Terminal Method(eager) - терминальный метод(конечный метод)              lazy - это как раз понятие что метод запускается после сработки какого то
 *                     - обрабатывает стрим и завершает работу стрима
 *                     стоит в конце и после него интермедиат метод уже не вызывешь
 *                     потому что возвращает не стрим а обычно это - void
 *                     срабатывают сразу после вызова
 *
 */

public class IntroduceInChaining {
    public static void main(String[] args) {
        int[] arr = {13,22,53,61,872,225,13,67,278};

        //отфильтруем, чтобы остались только нечетные числа
        //затем поделим на 3 только те числа котор делятся без остатка
        //найдес сумму оставшихся чисел

        int result = Arrays.stream(arr).filter( e -> e%2==1)
                .map(e -> {if(e%3 == 0) {e = e/3;} return e;})
                .reduce((a,e) -> a+e)
                .getAsInt();

        System.out.println(result);


        Student st1 = new Student("Kolia", 'm', 23,3,0.87);
        Student st2 = new Student("Segei", 'm', 25,1,0.46);
        Student st3 = new Student("Elena", 'f', 28,4,0.65);
        Student st4 = new Student("Irina", 'f', 31,3,0.93);
        Student st5 = new Student("Sveta", 'f', 22,1,0.67);

        List<Student> listSt = new ArrayList<>();
        listSt.add(st1);
        listSt.add(st2);
        listSt.add(st3);
        listSt.add(st4);
        listSt.add(st5);

        //сделаем следующее
        //имена заглавными буквами
        //отфильтровать по полу
        //отсортировать по возрасту

        listSt.stream().map(e ->{
            e.setName(e.getName().toUpperCase(Locale.ROOT));
            return e;})
                .filter(element -> element.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(elem -> System.out.println(elem));

        //пример что стрим не работает без терминального метода
        Stream<Integer> str = Stream.of(1,4,6,2,6,87);
        str.filter( el-> {
            System.out.println(el);
            return el%2 == 0;
        });
        //ничего не выведет!!!

        
    }
}
