package Annotations.b.create.my.own.annotation;

import java.lang.annotation.*;

public class CreateOwnAnnotationWithFields {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("Annotations.b.create.my.own.annotation.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println(sm1.OS()); //Android
        System.out.println(sm1.yearOfCompanyCreation());//2010
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android"; //это поле интерфейса а не метод
    int yearOfCompanyCreation();
    //массивы можно использовать
    //сдесь нельзя использовать ccылочные типы данных (например StringBulder)
}

@SmartPhone(OS = "Android", yearOfCompanyCreation = 2010)
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}