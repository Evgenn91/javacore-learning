package Streamss.l.methodd.collect;

import Streamss.b.methodd.filter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * метод collect() - преобразает стрим в коллекцию, в которую мы ему скажем
 *         (t)       для преобразования использовали класс Colections
 *                   Класс Collections имеет для нас 2 интересных метода:
 *                   groupingBy() - группирует по спискам результаты
 *                   partitioningBy() - делит на группы результаты(принимает Predicate(тоесть тело должно возвращать boolean))
 *                                      (результат у partitioningBy - это map их дыух элементов(тк с помощью boolean деление происходит))
 *                                      ключом уже будет Boolean!!!
 */
public class IntroduceCollect {
    public static void main(String[] args) {
        Student st1 = new Student("Kolia", 'm', 23,3,0.87);
        Student st2 = new Student("Segei", 'm', 25,1,0.46);
        Student st3 = new Student("Elena", 'f', 28,4,0.65);
        Student st4 = new Student("Irina", 'f', 31,3,0.93);
        Student st5 = new Student("Sveta", 'f', 22,1,0.67);
        List<Student> listStud = new ArrayList<>();
        listStud.add(st1);
        listStud.add(st2);
        listStud.add(st3);
        listStud.add(st4);
        listStud.add(st5);

        //изменим имена у студентов на заглавные и отсортируем по курсам(для каждого курса будет свой лист)
        //ключ у мап это наш атрибут по которому группироем у метода collect
        Map<Integer, List<Student>> map1 = listStud.stream()
                .map(e -> {e.setName(e.getName().toUpperCase(Locale.ROOT)); return e;})
                .collect(Collectors.groupingBy(el -> el.getCourse())); //указываем атрибут, по которому произволим группировку(здесь по курсу)

        for(Map.Entry<Integer, List<Student>> entry: map1.entrySet()){
            System.out.println(entry.getKey() +": " + entry.getValue().toString());
        }
        //вывод:
//        1: [Student{name='SEGEI', sex=m, age=25, course=1, grade=0.46}, Student{name='SVETA', sex=f, age=22, course=1, grade=0.67}]
//        3: [Student{name='KOLIA', sex=m, age=23, course=3, grade=0.87}, Student{name='IRINA', sex=f, age=31, course=3, grade=0.93}]
//        4: [Student{name='ELENA', sex=f, age=28, course=4, grade=0.65}]

        //поделим на группы те кто получают высокую оценку и те кто низкую
        System.out.println("--------------");
        Map<Boolean, List<Student>> map2 = listStud.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade()>0.7)); //указываем атрибут, по которому произволим группировку(здесь по курсу)

        for(Map.Entry<Boolean, List<Student>> entry: map2.entrySet()){
            System.out.println(entry.getKey() +": " + entry.getValue().toString());
        }
        //вывод:
//        false: [Student{name='SEGEI', sex=m, age=25, course=1, grade=0.46}, Student{name='ELENA', sex=f, age=28, course=4, grade=0.65}, Student{name='SVETA', sex=f, age=22, course=1, grade=0.67}]
//        true: [Student{name='KOLIA', sex=m, age=23, course=3, grade=0.87}, Student{name='IRINA', sex=f, age=31, course=3, grade=0.93}]


    }
}
