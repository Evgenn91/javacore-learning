package Collections.i.queue;

import java.util.PriorityQueue;

/**
 * у данной очереди отсортированная очередь хранится и отдает крайнийц элемент(тоесть получаем наивысший или наименьший)
 * (необходимо реализвывать Comparator или Comparable !!!)
 */
public class PriorityQueueee {
    public static void main(String[] args) {
        PriorityQueue<Integer> prtyList = new PriorityQueue<>();
        prtyList.add(1);
        prtyList.add(3);
        prtyList.add(6);
        prtyList.add(23);
        prtyList.add(55);

        System.out.println(prtyList.peek()); //вывод: 1  (вернет элемент с наивысшим приоритетом(это наименьший элемент)\
        //нюанс когда выводим на экран элементы у них нету сортировки!!!! (тоесть так: System.out.println(prtyList);)
        //а когда используем есть!!!!


        //такие же методы как и в LinkedList (от Queue)
    }
}
