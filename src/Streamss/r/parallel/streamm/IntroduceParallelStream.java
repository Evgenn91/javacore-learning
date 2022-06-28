package Streamss.r.parallel.streamm;

import java.util.ArrayList;
import java.util.List;

/**
 * Параллельные потоки
 * По умолчанию используются последовательные потоки
 *  Parallel stream - это возможность использовать несколько ядер проуессора
 *                    при выполнении каких либо операций со stream
 *
 *  stream параллельным можно сделать 2мя способами
 *
 *   1 способ (получение стрима из листа)
 *   2 способ (получение стрима из стрима)
 *
 *   использование паралл стримов лучше пожходит для агрегированных функций(нахождение минимума, суммы и т.д.)
 *   и не подходят когда наши действия напрямую зависят от их очередности
 *   паралельность используют, когда очень много элемнтов(если их мало, то параллельность даже навредит)
 */
public class IntroduceParallelStream {
    public static void main(String[] args) {
        List<Double> listDoubl = new ArrayList<>();
        listDoubl.add(10.0);
        listDoubl.add(5.0);
        listDoubl.add(1.0);
        listDoubl.add(0.25);

        double sumResult = listDoubl.parallelStream()
                .reduce((accumulator, element)-> accumulator + element ).get();

        System.out.println(sumResult); //16.25
        System.out.println("----------");


        //пример неправильного использования стрима

        double devisResult1 = listDoubl.stream()
                .reduce((accumulator, element)-> accumulator/element ).get();

        double devisResult = listDoubl.parallelStream()
                .reduce((accumulator, element)-> accumulator/element ).get();

        System.out.println(devisResult1); //8.0
        System.out.println(devisResult); //0.5  - ответ неверный!!!!





    }
}
