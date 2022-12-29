package InputOutput.g_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Сериализация - процесс преобразования объекта в последовательность байт
 * Десериализация - процесс восстановления объекта из байт
 *
 * Чтобы класс объекта можно было сериализовать, но должен имплементировать интерфейс Serializable
 * Поля класса помеченные transient не записываются в файл при сериализации
 */
public class a_Introduction {
    public static void main(String[] args) {
        //пример с объектом String
        List<Employe> employes = new ArrayList<>();
        employes.add(new Employe("firs name","sec name", 20,1200));
        employes.add(new Employe("second name", "sec name", 22, 1400));
        employes.add(new Employe("third name", "sec name", 24, 1200));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("empl.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("empl.bin"))) {
            //записываем наш список в файл
            outputStream.writeObject(employes); //не получится если класс Employe будет без серилазиции!!!!

            //читаем список из файла
            List<Employe> employeList;
            employeList =(ArrayList) inputStream.readObject(); //не получится если класс Employe будет без серилазиции!!!!(если в Employe будет какой то класс, он тоже должен быть сериализован)
            System.out.println(employeList); //в списке поле salary будет пустое(0.0), т.к. мы пометили его transient

            new File("empl.bin").delete();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
