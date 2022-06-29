package Multithreading.a.introduce.and.create;

/**
 * Немного по другому напишем второй вариант создания(сокращение кода)
 */
public class ExampleWithRunnable implements Runnable {


    public static void main(String[] args) {
        Thread thread = new Thread(new ExampleWithRunnable());
        thread.start();

        //или с помощью лямбды
        Thread thread1 = new Thread(() -> {
            for(int i = 0;i < 1000; i++){
                System.out.println(i);
            }
        });
        thread1.start();
    }

    @Override
    public void run() {
        for(int i = 0;i < 1000; i++){
            System.out.println(i);
        }
    }
}
