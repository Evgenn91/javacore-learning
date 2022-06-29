package Multithreading.b.thread.name.and.thread.priority;

/**
 * метода приоритета потока:
 *  - setPriority - задаем приоритет(при задании потока можно использовать числа (1-10)
 *                  а можно использовать готовые варианты:
 *                  - Thread.MIN_PRIORITY(=1)
 *                  - Thread.NORM_PRIORITY(=5)
 *                  - Thread.MAX_PRIORITY(=10)
 *
 *  - getPriority - достаем приоритет
 *
 *  дефолтный приоритет - это 5
 *  шкала приоритетов сотоит от 1 - 10 (10 - самый высокий приоритет)
 *
 *
 *  нет никакой гарантии что поток с более высоким приоритетом запустится быстрее!!!!!
 */
public class IntroduceThreadPriority {
    public static void main(String[] args) {
        Mythreadd mythreadd1 = new Mythreadd();
        mythreadd1.start();

        Mythreadd mythreadd2 = new Mythreadd();
        mythreadd2.start();

        Mythreadd mythreadd3 = new Mythreadd();
        mythreadd3.setPriority(9);
        mythreadd3.start();
        //выводим на экран инфу о нашем потоке
        System.out.println("Priority myThread = " + mythreadd1.getPriority()); //Priority myThread = 5
        System.out.println("Priority myThread = " + mythreadd2.getPriority()); //Priority myThread = 5
        System.out.println("Priority myThread = " + mythreadd3.getPriority()); //Priority myThread = 9
    }
}


