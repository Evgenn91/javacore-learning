package InputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * запись и чтение объектов(используется с сериализацией)
 */
public class j_ObjectInputStream_ObjectOutputStream {
    public static void main(String[] args) {
        //пример с объектом String
        List<String> names = new ArrayList<>();
        names.add("first name");
        names.add("second name");
        names.add("third name");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("empl.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("empl.bin"))) {
            //записываем наш список в файл
            outputStream.writeObject(names);

            //читаем список из файла
            List<String> namesFromFile;
            namesFromFile =(ArrayList) inputStream.readObject(); //все получилось, потому что List и String используют сериализацию!!!
            System.out.println(namesFromFile);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
