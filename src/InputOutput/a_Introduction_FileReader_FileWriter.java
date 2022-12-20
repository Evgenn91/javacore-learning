package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Stream для работы с файлами - упорядоченная последовательность данных
 * Файлы могут быть:
 *    - читабельные для человека ( text files ) - FileReader, FileWriter (текстовый файл)
 *    - нечитабельные для человека ( binary files ) - FileInputStream, FileOutputStream (бинарный файл)
 * При работе с разными файлами используются разные стримы
 */
public class a_Introduction_FileReader_FileWriter {
    public static void main(String[] args) throws IOException {
        //Streams для работы с текстовыми файлами(FileReader and FileWriter)
        String rubai ="text text text text text text text\n" +
                       "text text text text text\n";

        //1) FileWriter(write this text in file1.txt) (не самый эффективный способ записи в файл)
        FileWriter writer = null;
        try {
            //1 способ
            writer = new FileWriter("путь к файлу/file1.txt");
            //1а способ
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));  //посимвольная запись
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close(); // обязательно!!! если не закрыт, то ничего не запишем в файл
        }

        //2 способ: можно создать файл во время записи
        writer = new FileWriter("file1.txt");// файл создастся в корне нашего проекта
        //2a способ: вместо цикла for можно просто написать
        writer.write(rubai);

        //теперь если что нибуть еще запишем способ сверху то новая инфа перезапишет старую!!!!!!!!!!!!!!!!!!
        //чтобы можно было добавлять к сущ инфе новую то нужно так
        writer = new FileWriter("путь к файлу", true); //добавить второй параметр true
        writer.close();

        //====================================================================================================================
        //====================================================================================================================

        //2) FileReader(read text from file1.txt)
        FileReader reader = null;
        try {
            reader = new FileReader("путь к существуюшему файлу");
            int character;
            while((character = reader.read()) != 1) {     //чтение идет посимвольно(если возвращает -1 то значит конец файла)
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
