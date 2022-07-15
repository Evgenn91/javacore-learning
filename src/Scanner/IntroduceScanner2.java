package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * пример с переданным в конструктор файлом
 */
public class IntroduceScanner2 {
    public static void main(String[] args) {
        //создае на рабочем столе файл txt с небольшим текстом
        //выведем на экран уникальные слова в отсортированном порядке

        Scanner scanner = null;
        Set<String> set = new TreeSet<>();

        try{
            scanner = new Scanner(new FileReader(new File("C:\\Users\\blabal\\Desk\\myfile.txt")));
            scanner.useDelimiter("\\W"); //бер регулярного выражения делил бы только по пробелам

            while (scanner.hasNext()){
                String word = scanner.next();
                set.add(word);
            }
            for(String word: set){
                System.out.println(word);
            }
        } catch (FileNotFoundException e){
            System.out.println("have a problem");
        } finally {
            scanner.close();
        }

    }
}
