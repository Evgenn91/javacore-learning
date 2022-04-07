package Collections.a.comparable;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        //распространенный способ написания compareTo
//        return this.id - o.id;


        if(this.id == o.id) return 0;
        else if(this.id < o.id) return -1;
        return 1;/* чтобы в порядке увеличения передавать, то "текущий объект если больше, то передаем положительное число" */

        /**
         * если в id стоит не int а Integer, то можно использовать функциональность Comparable класса Integer
         *
         *      return this.id.compareTo(o.id);
         *
         *
         * если нужна сортировка по исени:
         *
         *       return this.name.compareTo(o.name);
         *
         *
         *  если необходимо по двум сравнить(тоесть сравниваем имена и если они одинаковы, то сравниваем еще фамилии)
         *
         *       int res = this.name.compareTo(o.name);
         *       if(res == 0){ res = this.surname.compareTo.(o.surname);
         *       return res;
         *
         */


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


}
