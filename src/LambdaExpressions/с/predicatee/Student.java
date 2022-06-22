package LambdaExpressions.с.predicatee;

public class Student {
    String name;
    char sex;
    int age;
    int course;
    double grade;

    public Student(String name, char sex, int age, int course, double grade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
