package InputOutput.g_serialization;

import java.io.Serializable;

public class Employe implements Serializable {
    private String name;
    private Integer age;

    public Employe(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employes{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
