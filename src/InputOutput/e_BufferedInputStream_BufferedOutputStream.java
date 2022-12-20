package InputOutput;

import java.io.*;

/**
 * буферизация для FileInputStream и FileOutputStream
 */
public class e_BufferedInputStream_BufferedOutputStream {
    public static void main(String[] args) {
        try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("путь к картинке например"));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("название новой картинки, котор сделается"))){
            int i;
            while ((i = inputStream.read()) != 1){
                outputStream.write(i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
