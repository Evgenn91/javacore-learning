package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream и FileOutputStream используются для чтения нечитабельных файлов(бинарных файлов)(например картинки)
 * если попытаться прочитать картинку с помощью FileReader то будут ошибки при чтении
 */
public class d_FileInputStream_FileOutputStream {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("путь к картинке например");
            FileOutputStream outputStream = new FileOutputStream("название новой картинки, котор сделается")){
            int i;
            while ((i = inputStream.read()) != 1){
                outputStream.write(i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
