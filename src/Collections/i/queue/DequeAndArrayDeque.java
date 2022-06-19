package Collections.i.queue;

import java.util.ArrayDeque;

/**
 * Deque - это двухнаправленная очередь(элементы могут использоваться с обоих сторон)
 * (можно использовать как FIFO так и LIFO(в стеке разбирали))
 * (основные реализации Deque - это LinkedList и ArrayDeque)
 *
 */
public class DequeAndArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrDeq = new ArrayDeque<>();
        arrDeq.addFirst(3);
        arrDeq.addLast(1);
        arrDeq.offerFirst(5);
        arrDeq.offerLast(8);
        arrDeq.add(11);

        //методы для добавления:
        // - addFirst()
        // - addLast()
        // - offerFirst()
        // - offerLast()

        //метод для удаления
        // - removeFirst()
        // - removeLast()
        // - pollFirst()
        // - pollLast()

        //берем элементы из очереди
        // - getFirst()
        // - getLast()
        // - peekFirst()
        // - peekLast()
    }
}
