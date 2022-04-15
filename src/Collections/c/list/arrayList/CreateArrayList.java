package Collections.c.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {
    public static void main(String[] args) {
        //способы создания ArrayList
        //1
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("one");
        arrayList1.add("two");
        System.out.println(arrayList1);

        //2 (без указания в правой части типа добавляемых объектов)
        ArrayList<String> arrayList2 = new ArrayList<>();

        //3 (с определением сразу первоначального размера на 30 элементов например(по дефолту 10))
        ArrayList<String> arrayList3 = new ArrayList<>(30);

        //4 с использование родительского типа ArrayList-а
        List<String> arrayList4 = new ArrayList<>();

        //5 когда в параметры конструктора мы помещаем другой List
        List<String> arrayList5 = new ArrayList<>(arrayList1);

        //Ньюанс!!! мы можем убрать Generic тип из нашего листа при создании и тогда мы можем добавлять элементы любого типа в него
        //мы так можем сделать, потому что в основе ArrayList массив Objects!!!
        //Так делать не стоит!!!
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add("one");
        arrayList6.add(2);
        arrayList6.add(2.45);
        System.out.println(arrayList6);



    }
}
