package Multithreading.c.methods.sleep.join.and.thread.states;

/**
 *  метод join() - поток в котором вызывается join()(мы вызвали внутри main)
 *                 делает так, что main(потому что в нем вызвали) будет ждать тот поток
 *                 на котором вызвали метод join(у нас это thread1 и thread2)
 */
public class IntroduceMethoddJoin extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable2());
        IntroduceMethoddJoin thread2 = new IntroduceMethoddJoin();
        thread1.start();
        thread2.start();

        //объясняем методу main что только после завершения работы потоков, что сверху нужно будет продолжить свою работу
        //так сделаем чтобы слово конец вывелось после работы всех потоков
        thread1.join();
        thread2.join();
        System.out.println("finish");

        //вывод:
//        Thread-0 0
//        Thread-1 0
//        Thread-0 1
//        ...
//        Thread-1 8
//        Thread-0 9
//        Thread-1 9
//        finish

//        конец вывелся в конце!!!
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

class MyRunnable2 implements Runnable{

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
