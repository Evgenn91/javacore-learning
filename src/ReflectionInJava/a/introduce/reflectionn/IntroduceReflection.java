package ReflectionInJava.a.introduce.reflectionn;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 *  Рефлексия - это мезанизм исследования данных о программе во время ее выполнения.
 *  Рефлексия позволяет исследовать информацию о полях, методах, конструкторах и других составляющих классов.
 */
public class IntroduceReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //создание объекта "Class" (существует 3 варианта)
        //1
        Class employeeClass = Class.forName("ReflectionInJava.a.introduce.reflectionn.Employee");
        //2
        Class employeeClass2 = Employee.class;
        //3
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();

        //РАБОТА С ПЕРЕМЕННЫМИ

        //получение поля
        Field field = employeeClass.getField("id");
        System.out.println(field.getType()); //int

        //получение полей
        Field[] arrField = employeeClass.getFields();
        System.out.println(Arrays.toString(arrField)); //[public int ReflectionInJava.a.introduce.reflectionn.Employee.id, public java.lang.String ReflectionInJava.a.introduce.reflectionn.Employee.name, public java.lang.String ReflectionInJava.a.introduce.reflectionn.Employee.department]
        for(Field oneField: arrField){
            System.out.println(oneField.getName() +"  " + oneField.getType());
            //вывод: (private поле не вывел)
//            id  int
//            name  class java.lang.String
//            department  class java.lang.String
        }

        //получение всех полей, даже private
        Field[] allField = employeeClass.getDeclaredFields();
        for(Field oneField: allField){
            System.out.println(oneField.getName() +"  " + oneField.getType());
            //вывод: (private поле не вывел)
//            id  int
//            name  class java.lang.String
//            department  class java.lang.String
//            salary  double
        }
        System.out.println("---------------------");
        
        //РАБОТА С МЕТОДАМИ

        //получение метода
        Method methhod1 = employeeClass.getMethod("increaseSalary");
        System.out.println(methhod1);// public void ReflectionInJava.a.introduce.reflectionn.Employee.increaseSalary()
        System.out.println("type method = " + methhod1.getReturnType());//type method = void
        System.out.println("type parameters = " + Arrays.toString(methhod1.getParameterTypes()));//type parameters = []
        System.out.println("---------------------");

        Method methhod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("type method = " + methhod2.getReturnType());//type method = void
        System.out.println("type parameters = " + Arrays.toString(methhod2.getParameterTypes()));//type parameters = [double]
        System.out.println("---------------------");

        //получение методов(приватные методы не получаем!!!)
        Method[] methods = employeeClass.getMethods();
        for(Method method: methods){
            System.out.println("name method = " + method.getName()+" , " + "return type = " + method.getReturnType() + ", "+
                               "param types = " + Arrays.toString(method.getParameterTypes()));
            //вывод
//            name method = toString ,       return type = class java.lang.String, param types = []
//            name method = increaseSalary , return type = void,                   param types = []
//            name method = setSalary ,      return type = void,                   param types = [double]
//            name method = getSalary ,      return type = double,                 param types = []
//            name method = wait ,           return type = void,                   param types = [long, int]
//            name method = wait ,           return type = void,                   param types = [long]
//            name method = wait ,           return type = void,                   param types = []
//            name method = equals ,         return type = boolean,                param types = [class java.lang.Object]
//            name method = hashCode ,       return type = int,                    param types = []
//            name method = getClass ,       return type = class java.lang.Class,  param types = []
//            name method = notify ,         return type = void,                   param types = []
//            name method = notifyAll ,      return type = void,                   param types = []
        }
        System.out.println("---------------------");

        //получение методов(даже приватные + не возвращает унаследованные методы!!!)
        Method[] methods1 = employeeClass.getDeclaredMethods();
        for(Method method: methods1){
            System.out.println("name method = " + method.getName()+" , " + "return type = " + method.getReturnType() + ", "+
                    "param types = " + Arrays.toString(method.getParameterTypes()));
            //вывод
//            name method = toString ,         return type = class java.lang.String, param types = []
//            name method = increaseSalary ,   return type = void,                   param types = []
//            name method = setSalary ,        return type = void,                   param types = [double]
//            name method = getSalary ,        return type = double,                 param types = []
//            name method = changeDepartment , return type = void,                   param types = [class java.lang.String]

        }
        System.out.println("---------------------");

        //получение методов(только из своего класса и только публичные)
        Method[] methods2 = employeeClass.getDeclaredMethods();
        for(Method method: methods2){
            if(Modifier.isPublic(method.getModifiers())){
                System.out.println("name method = " + method.getName()+" , " + "return type = " + method.getReturnType() + ", "+
                        "param types = " + Arrays.toString(method.getParameterTypes()));
            }
            //вывод
//            name method = getSalary ,      return type = double,                 param types = []
//            name method = increaseSalary , return type = void,                   param types = []
//            name method = setSalary ,      return type = void,                   param types = [double]
//            name method = toString ,       return type = class java.lang.String, param types = []

        }
        System.out.println("---------------------");

        //РАБОТА С КОНСТРУКТОРАМИ

        //получение конструктора
        Constructor constructor = employeeClass.getConstructor(); //получ конструктора без параметров
        System.out.println(constructor);  //public ReflectionInJava.a.introduce.reflectionn.Employee()
        System.out.println("count parameters = " + constructor.getParameterCount());//count parameters = 0
        System.out.println("type parameters = " + Arrays.toString(constructor.getParameterTypes()));//type parameters = []
        System.out.println("---------------------");

        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class, double.class); //получ конструктора без параметров
        System.out.println("count parameters = " + constructor1.getParameterCount());//count parameters = 4
        System.out.println("type parameters = " + Arrays.toString(constructor1.getParameterTypes()));//type parameters = [int, class java.lang.String, class java.lang.String, double]
        System.out.println("---------------------");

        //получение конструктора
        //без получения приватных конструкторов
        Constructor[] constructors = employeeClass.getConstructors();
        for(Constructor oneConstr: constructors){
            System.out.println("name constr = "+oneConstr.getName() + ", " + "parameters count = " + oneConstr.getParameterCount()
            + ", " + "type parameters = " + Arrays.toString(oneConstr.getParameterTypes()));
            //вывод:
//            name constr = ReflectionInJava.a.introduce.reflectionn.Employee, parameters count = 4, type parameters = [int, class java.lang.String, class java.lang.String, double]
//            name constr = ReflectionInJava.a.introduce.reflectionn.Employee, parameters count = 3, type parameters = [int, class java.lang.String, class java.lang.String]
//            name constr = ReflectionInJava.a.introduce.reflectionn.Employee, parameters count = 0, type parameters = []
        }

        //возвращение конструкторов с приватными конструкторами
        Constructor[] constructors1 = employeeClass.getDeclaredConstructors();



    }




}
