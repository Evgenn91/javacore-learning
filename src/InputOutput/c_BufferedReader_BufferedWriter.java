package InputOutput;

import java.io.*;

/**
 * Буферизация - процесс загрузки части файла, происходящее во время потоковой передачи(в youtube видно как это происходит)
 * Использование буферизации в стримах позволяет достичь большей эффективности
 * BufferedReader и BufferedWriter - это обертки FileReader и FileWrite
 * это значит что они добавляют с сущ функциональности еще буферизацию
 * уменьшается колличество обращений к файлу
 */
public class c_BufferedReader_BufferedWriter {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("путь к файлу"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("путь к ф",true))){
//            1 способ
//            int character;
//            while((character = bufferedReader.read()) != 1){
//                bufferedWriter.write(character);
//            }

//            2 способ
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
