package Multithreading.b.thread.name.and.thread.priority;

/**
 * метода имени потока:
 *  - setName - задаем имя потока
 *  - getName - достаем имя потока
 *
 *  Если мы никак не назовем наш thread у него будет дефолтное имя (Thread-'очередность потока')
 */
public class IntroduceThreadName {
    public static void main(String[] args) {
        Mythreadd mythreadd = new Mythreadd();
        mythreadd.start();
        Mythreadd mythreadd1 = new Mythreadd();
        mythreadd1.start();
        Mythreadd mythreadd2 = new Mythreadd();
        mythreadd2.setName("super potok");
        mythreadd2.start();
        //выводим на экран инфу о нашем потоке
        System.out.println("Name myThread = " + mythreadd.getName()); //Name myThread = Thread-0
        System.out.println("Name myThread = " + mythreadd1.getName()); //Name myThread = Thread-1
        System.out.println("Name myThread = " + mythreadd2.getName()); //Name myThread = super potok
    }
}

class Mythreadd extends Thread {
    public void run(){
        System.out.println("hii");
    }
}