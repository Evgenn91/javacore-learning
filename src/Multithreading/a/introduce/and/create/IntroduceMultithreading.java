package Multithreading.a.introduce.and.create;

/**
 * Ввеление в многопоточность и создание потоков
 *
 * Многопоточность - это принуип построения программы, при котором несколько блоков кодо могут выполнянтся одновременно
 *  Цели многопоточности:
 *   1. Производительность
 *   2. Concurrency(выполнение сразу нескольких задач)
 *
 *   Существует 2 варианта создания нового потока:
 *   1. унаследование от класса Thread( переопределяем метод run())
 *                                  (запуск потока осущ с помощью метода start() у нашего класса)
 *                                  можно использовать, когда у класса нету ни одного родителя
 *   2. переопределение интерфейса Runnable( переопределяем метод run())
 *                                   (запуск потока осущ с помощью метода start() созданного объекта Thread,
 *                                   которому в конструктор передали наш объект!!!)
 */
public class IntroduceMultithreading {
    public static void main(String[] args) {
        //1 вариант создания потока(унаследовавшись от Thread)
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        //запуск потока!!!!
        myThread1.start();
        myThread2.start(); //между потоками нет никакой синхронизауии и не знаем какой начнется первым а кокой закончит последним
        //можно запустить один поток дважды
        MyThread1 myThread11 = new MyThread1();
        myThread11.start();

        //2 вариант создания потока(переопределение интерфейса Runnable)
        Thread thread = new Thread(new MyThread3());
        thread.start();

        //с помощью лямбды
        new Thread(()->{
            for(int i = 1000;i > 0; i--){
                System.out.println("fdfdf");
            }
        }).start();



    }
}

class MyThread1 extends Thread{
    public void run(){
        System.out.println("текущий поток старт: " + Thread.currentThread().getName());

        for(int i = 0;i < 1000; i++){
            System.out.println(i);
        }
        System.out.println("текущий поток конец: " + Thread.currentThread().getName());
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("текущий поток старт: " + Thread.currentThread().getName());
        for(int i = 1000;i > 0; i--){
            System.out.println(i);
        }
        System.out.println("текущий поток конец: " + Thread.currentThread().getName());
    }
}

class MyThread3 implements Runnable{

    @Override
    public void run() {
        for(int i = 1000;i > 0; i--){
            System.out.println(i);
        }
    }
}
