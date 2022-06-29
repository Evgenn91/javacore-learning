package Multithreading.a.introduce.and.create;

/**
 * Немного по другому напишем первый вариант создания(сокращение кода)
 */
public class ExampleWithThread extends Thread {

    public void run(){
        for(int i = 0;i < 1000; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ExampleWithThread threa = new ExampleWithThread();
        threa.start();

        for(int i = 1000;i > 0; i--){
            System.out.println(i);
        }
    }
}
