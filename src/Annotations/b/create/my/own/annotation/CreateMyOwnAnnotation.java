package Annotations.b.create.my.own.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * Аннотации, которые вещаются на создаваемые аннотации:
 *     - @Target - показывает область кода, к которой может быть применена данная аннотация
 *                 *TYPE - class, interface, enum
 *                 *FIELD - поле класса
 *                 *METHOD - метод класса
 *                 *PARAMETER - параметры метода или конструктора
 *
 *     - @Retention - описывает жизненный цикл аннотации(говорит до какого этапа в нашей программе будет видна аннотация)
 *                 *SOURCE - аннотация видно в source коде, отбрасывается компилятором и в byte коде уже не видна(пример: @Override)
 *                 *CLASS - аннотация видна в byte коде, отбрасывается JVM во время выполнения программы
 *                 *RUNTIME - аннотация видна во время выполнения программы
 */
public class CreateMyOwnAnnotation {
    public static void main(String[] args) {

    }
}

//@MyAnnotation
class Employee{
    @MyAnnotation
    String name;
    double salary;

//    @MyAnnotation
    public Employee(String name, /*@MyAnnotation*/ double salary) {
        this.name = name;
        this.salary = salary;
    }

    @MyAnnotation
    public void increaseSalary(){
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//создаем аннотацию

//@Target(ElementType.METHOD) //теперь данная аннотация работает только с методам
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{

}
