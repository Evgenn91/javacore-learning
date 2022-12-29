package InputOutput.g_serialization;

import java.io.Serializable;

public class Employe implements Serializable {
    static final long serialVersionUID = 1;//это версия нашего класса (если мы что то поменяем в нашем класса(удалим поле например)
    // то должна быть уже другая версия этого класса, т.к. при десериализации проверяется версия класса) - при десериализации ошибка тоже буден, он она уже будет о том что серии классов не совпадают
    private String name;
    private String surName;
    private Integer age;
    transient private double salary; //данное поле не попадет в сериализацию тоесть при десериализации мы не получим данное поле

    public Employe(String name, String surName, Integer age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
