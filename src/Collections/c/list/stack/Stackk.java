package Collections.c.list.stack;

import java.util.Stack;

/**
 * Stack - это наследник Vector!!!
 *  Stack - это устаревший synchronized class
 *  использующий прицип LIFO(последний который пришел, тот и выйдет)
 *  Не рекомендован для использования
 *
 *  методы который вызывают другие методы выполняются в стеке!
 *  методы:
 *  1) push() - вставка элемента в самый вверх(конец)
 *  2) pop() - вытаскивание элемента(потом сразу удаляет элемент!!!)(применение его к пустому стеку - юудет exception)
 *  3) peek() - вытаскивание элемента(потом не удаляет элемент!!!)
 *  4) isEmpty() - вернет boolean пустой стек или нет
 */
public class Stackk {
    public static void main(String[] args) {
        Stack<String> listStack = new Stack<>();

        // 1 метод: push() - добавление в Stack
        listStack.push("Sergei");
        listStack.push("Misha");
        listStack.push("Kolya");

        // 2 метод: pop() - взятие элемента из Stack и удаление его из очереди
        listStack.pop();

        // 3 метод: peek() -  взятие элемента из Stack но не удаляет его из очереди


    }
}
