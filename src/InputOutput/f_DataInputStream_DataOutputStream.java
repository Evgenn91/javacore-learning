package InputOutput;

import java.io.*;

/**
 * Позволяют читать и записывать в файл примитивные типы данных
 */
public class f_DataInputStream_DataOutputStream {
    public static void main(String[] args) {
        try(DataInputStream inputStream = new DataInputStream(new FileInputStream("путь к "));
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("куда запис"))){
            int i;
            while ((i = inputStream.read()) != 1){
                outputStream.write(i);
            }
            //виды write
//            outputStream.writeBoolean(true);
//            outputStream.writeByte(1);
//            outputStream.writeShort(3);

            //виды read
//            System.out.println(inputStream.readBoolean());
//            System.out.println(inputStream.readByte());
//            System.out.println(inputStream.readShort());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
