package Multithreading.c.methods.sleep.join.and.thread.states;

/**
 * метод sleep() - осноновливает поток на определенное время
 */
public class IntroduceMethodSleed extends Thread{
    public static void main(String[] args) throws InterruptedException {
        //пример усыпления потока main
//        for(int i = 5; i >0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("go");

        //пример с несколькими потоками
        Thread thread1 = new Thread(new MyRunnable1());
        IntroduceMethodSleed thread2 = new IntroduceMethodSleed();
        thread1.start();
        thread2.start();
        System.out.println("konec");
        //вывод:
//        konec
//        Thread-0 0
//        Thread-1 0
//        Thread-0 1
//        Thread-1 1
//        Thread-0 2
//        Thread-1 2 и т.д.
//        конец вывелся вначале!!!(а нужно в конце)

    }


    @Override
    public void run() {
        for(int i=0; i< 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i< 10; i++){
            //мы оборачиваем исключение а не пробрасываем, потому что у метода run нету сигнатуры проброса исключения
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
