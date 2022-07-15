package ReflectionInJava.b.introduce.reflection2;

import ReflectionInJava.a.introduce.reflectionn.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * разберем создание объектов с помощью рефлексии
 */
public class IntroduceReflectionPart2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class employeeClass = Class.forName("ReflectionInJava.a.introduce.reflectionn.Employee");

        //создание объекта Employee рефлексией до 11 java
        Employee o = (Employee) employeeClass.newInstance();
        System.out.println(o); //Employee{id=0, name='null', department='null', salary=0.0}

        //создание объекта Employee рефлексией с 11 java
        Constructor constructor1 = employeeClass.getConstructor();
        Employee o1 = (Employee) constructor1.newInstance();
        //или так
//        Constructor<Employee> constructor1 = employeeClass.getConstructor();
//        Employee o1 = constructor1.newInstance();

        //создание объекта с помощью конструктора с 3мя параметрами
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object o2 = constructor2.newInstance(5, "Kolia", "it");
        System.out.println(o2);//Employee{id=5, name='Kolia', department='it', salary=0.0}

        //вызов метода с помощью рефлексии

        Method method = employeeClass.getMethod("setSalary", double.class);

        //запускаем метод
        method.invoke(o2,800.88);
        System.out.println(o2);

        //есть приватное поле security
        //прочитаем его значение
        Employee employee11 = new Employee(12,"Kolya", "it");
        Class emppp = employee11.getClass();
        Field field = emppp.getDeclaredField("security");
        field.setAccessible(true);//даем себе доступ к private переменной
        int vremm =(Integer) field.get(employee11);
        System.out.println("private int = " + vremm); //private int = 100

        //изменяем его значение
        field.set(employee11, 213);
        System.out.println("our emp with change priv field = " + employee11);//our emp with change priv field = Employee{id=12, name='Kolya', department='it', salary=0.0, security=213}



    }
}
