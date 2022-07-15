package Scanner;

import java.util.Scanner;

/**
 * Необходим, чтобы считывать данные с консоли
 */
public class IntroduceScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number");
        int i = scanner.nextInt();
        System.out.println("my numb = "+i);

        System.out.println("enter 2 numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("chastnoe = "+x/y);
        System.out.println("ostatok = "+x%y);

        System.out.println("enter 2 string");
        String str = scanner.nextLine(); //есть еще метод next() - он выводит слово до первого пробела
        System.out.println("my str = "+ str);
        scanner.close();


        Scanner scan = new Scanner("Hello my friend");
        System.out.println("my str = "+ scan.next()); //my str = Hello
        scan.close();

        Scanner scan1 = new Scanner("Hello my friend\n How are you \nWhat do you want?");
        System.out.println("my str = "+ scan1.nextLine()); //my str = Hello my friend
        System.out.println("my str = "+ scan1.nextLine()); //my str =  How are you
        System.out.println("my str = "+ scan1.nextLine()); //my str = What do you want?
        scan1.close();

        //или так
        Scanner scan2 = new Scanner("Hello my friend\n How are you \nWhat do you want?");
        while (scan2.hasNextLine()){ //можно написать hasNext() - работает так же
            System.out.println("my str = "+ scan2.nextLine());
        }
        scan2.close();


    }
}
