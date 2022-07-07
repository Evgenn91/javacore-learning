package Multithreading.c.methods.sleep.join.and.thread.states;

/**
 * Thread states - это состояния в которых находится наш поток
 *   вывод состояния о потоке: нить.getState()
 *
 *    Состояния:
 *      - NEW - состоягие после создания(но еще не запустили)
 *      - RUNNABLE - состояние когда вызвали start()(состояние выполнения)
 *                   /     \ - у runnable 2 состояния
 *               ready     running
 *           (готовность) (в моменте выполнения)
 *      - TERMINATED - когда работа потока завершена
 */
public class IntroduceThreadStates {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        Thread thread = new Thread(new Worker1());
        System.out.println(thread.getState()); //NEW
        thread.start();
        System.out.println(thread.getState()); //RUNNABLE
        thread.join();
        System.out.println(thread.getState()); //TERMINATED
        System.out.println("main finish");

    }
}

class Worker1 implements Runnable{

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