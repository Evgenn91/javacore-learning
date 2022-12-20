package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Закрытые ресурсов после работы с файлами
 *
 */
public class b_TryWithResources {
    public static void main(String[] args) {
        //работа с одним ресурсом
        try(FileReader reader = new FileReader("путь к сущ файлу")){
            //some code
        } catch (IOException e){
            e.printStackTrace();
        }

        //работа с двумя ресурсами
        try(FileReader reader = new FileReader("путь к сущ файлу");
            FileWriter writer = new FileWriter("путь к файлу",true)){
            //some code
        } catch (IOException e){
            e.printStackTrace();
        }

        //можем так закрывать только те стримы которые имплементируют интерфейс Closeable
        //тоесть FileReader и FileWriter имплементируют интерфейс Closeable
    }
}
