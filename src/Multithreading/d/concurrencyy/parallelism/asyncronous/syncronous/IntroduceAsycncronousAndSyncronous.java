package Multithreading.d.concurrencyy.parallelism.asyncronous.syncronous;

import Multithreading.c.methods.sleep.join.and.thread.states.IntroduceMethoddJoin;

/**
 *  Asynchronous - задания выполняются хаотично(например начали какую то работу и пока она выполняется делаем другую)
 *                 асинхронное программирование помогает нам достичь concurrency
 *
 *       Работа асинхронной программы на многоядерном процессоре - парарелизм
 *       Работа асинхронной программы на одноядерном процессоре - concurrency
 *
 *  Synchronous - все задания выполняются последовательно(друг за другом)
 */
public class IntroduceAsycncronousAndSyncronous extends Thread {


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable3());
        IntroduceMethoddJoin thread2 = new IntroduceMethoddJoin();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("finish");

        //вывод всегда будет разный при запуске
        //это потому что наши потоки работают асинхронно(выполняют свою работу независимо друг от друга)
        //их поведение недетерминированное
    }

    @Override
    public void run() {
        for(int i=0; i< 10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i< 10; i++){
            //мы оборачиваем исключение а не пробрасываем, потому что у метода run нету сигнатуры проброса исключения
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
