package Streamss.d.methodd.reduce;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * метод reduce() - возвращает на выходе всегда 1 элемент(удобно выполнять агрегированные функции
 *        (t)         (суммирование, умножение и т.д.)
 *
 * reduce() - возвращает Optional(обертка для нашего числа) и чтобы из Optional получить значение используем метод get()
 */
public class IntroduceInReduce {
    public static void main(String[] args) {

        //найдем произведение всех элемнтов
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(23);

        //есть 2 варианта нписания reduce
        //1. в reduce указываем 2 параметра
        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        // 5 1 6 23 - это на выходе stream()
        // acumulator - накапливает - 5  5 30 690
        // element = - 1  6  23
        System.out.println(result);

        System.out.println("---------------------");

        // Optional возвращает только либо значение либо null
        List<Integer> list10 = new ArrayList<>();
        int result10 = 0;
//        int result10 = list10.stream().reduce((accumulator, elelement) -> accumulator * elelement).get();
        Optional<Integer> opt= list10.stream().reduce((accumulator, elelement) -> accumulator * elelement);
        if(opt.isPresent()){ System.out.println(opt.get()); }
        else { System.out.println("wrong"); }



        //2. в reduce указываем 3 параметра(get нет необходимости использовать):
        int result2 = list.stream().reduce(1,(accumulator, element) -> accumulator * element);
        //добавленная 1ца - это теперь это значение будет первичным значением нашего аккумулятора


        //пример где ходим сконкатенировать все элементы
        List<String> str = new ArrayList<>();
        str.add("one");
        str.add("two");
        str.add("three");
        str.add("four");
        str.add("five");

        String resStr = str.stream().reduce((a, e) -> a + " " + e).get();

        System.out.println(resStr);


    }
}
