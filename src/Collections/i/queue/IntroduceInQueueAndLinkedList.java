package Collections.i.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * все эти классы notsyncronized
 *               Queue
 *              /     \
 *         Deque      AbstractQueue
 *         /    \              |
 *  LinkedList  ArrayDeque    PriorityQueue
 *
 * Queue(очередь) - базовый интерфейс, который хранит последовательность элементов
 * нужен, чтобы проводить операции с самым первым, стоящим в очереди
 *  первый кто пришел первый и выйдет(правило FIFO)
 *
 */
public class IntroduceInQueueAndLinkedList {
    public static void main(String[] args) {
        Queue<String> strQueue = new LinkedBlockingDeque<>();

        //1 method : add() - добавляет элемент в конец очереди
        strQueue.add("Igor");
        strQueue.add("Sergei");
        strQueue.add("Kirill");
        System.out.println(strQueue);
        //2 method : offer() - добавляет элемент в конец очереди(разница от add() в том что если бы наша очередь была ограничена
        // например до 4-х эл-тов то при add 5го эл-та будет исключение а у offera норм добавит элемент)



        //3 method : remove() - удаляется по порядку элемнт(который в очереди чейчас на выход)(при этом сначала его возвращает нам)
        // при удалении когда уже нету елементов то будет исключение!!!

        //4 method : poll() - также удаляет но не  выбросит исключение когда не будет элемента на удаление(возвращает null)


        //5 method : element() - показывает верхний элемент в очереди(будет ошибка ели нету элементов а попытаемся вывести)

        //6 method : peek() - работает так же как и element() но уже небудет исключение при пустом списке



        //7 method : remove("какой то определенный элемент, котор есть в очереди") - удалит уже определенный элемент(а не из конца или сначала)(обычно не используют)




    }
}
