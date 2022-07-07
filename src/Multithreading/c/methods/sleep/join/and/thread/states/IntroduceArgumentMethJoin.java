package Multithreading.c.methods.sleep.join.and.thread.states;

/**
 * применение метода join с параметром - принимает милисекунды
 *                       тогда поток в котором вызван метод join()(у нас это метод main())
 *                       будет ждать пока поток на котор вызвали join, не завершит свою работу или
 *                       пока не проудет заданное время в join
 */
public class IntroduceArgumentMethJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        Thread thread = new Thread(new Worker());
        thread.start();
        thread.join(1500);
        System.out.println("main finish");

        //вывод(без задания времени в join):
//        main start
//        work start
//        work finish
//        main finish

        //вывод(с заданием времени в join):
//        main start
//        work start
//        main finish
//        work finish - так вывелось потому что мы задали время ожидания меньше, чем время заканчивания работы потока thread
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("work start");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work finish");
    }
}
