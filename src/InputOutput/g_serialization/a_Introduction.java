package InputOutput.g_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Сериализация - процесс преобразования объекта в последовательность байт
 * Десериализация - процесс восстановления объекта из байт
 */
public class a_Introduction {
    public static void main(String[] args) {
        //пример с объектом String
        List<Employe> employes = new ArrayList<>();
        employes.add(new Employe("firs name", 20));
        employes.add(new Employe("second name", 22));
        employes.add(new Employe("third name", 24));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("empl.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("empl.bin"))) {
            //записываем наш список в файл
            outputStream.writeObject(employes); //не получится если класс Employe будет без серилазиции!!!!

            //читаем список из файла
            List<Employe> employeList;
            employeList =(ArrayList) inputStream.readObject(); //не получится если класс Employe будет без серилазиции!!!!
            System.out.println(employeList);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
