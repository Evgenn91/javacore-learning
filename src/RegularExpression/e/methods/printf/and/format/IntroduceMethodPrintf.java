package RegularExpression.e.methods.printf.and.format;

/**
 *  с помощъю метода printf() мы можем красиво выводить данные на экран
 *
 *  шаблон спецификаторов форматов: %[flags][width][.precision]datatype_specifier
 *       обязательные поля: - %
 *                          - datatype_specifier (какой тип данных с которым мы работаем):b - boolean
 *                                                                                        c - character
 *    flags: "-" - выравнивание по левому краю(работае только когда задали ширину!!)      s - string
 *           "0" - добавл нулей перед числом (когда работ с числами и задали ширину)      d - целое число
 *           "," - разделитель разрядов в числах  (когда работаем с дробями)              f - дробное число
 *
 *       width - минимальное колличество символов, которая будет определена для нашего текста
 *
 *       .precision - можем округлять дробные числа
 *
 */
public class IntroduceMethodPrintf {

    static void info(Employee emp){
        System.out.printf("id = %03d name = \t %-12s \t %-12s \t %,.1f \n",
                emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonus));
        //%03d - говорит что работаем с целыми числами(d),
        //                    выделяем 3 символа для id(3),
        //                    если id меньше чем 3 цифры то увидим нули(0)
    }

    public static void main(String[] args) {
//        System.out.printf("", "privet", "3.1415"); //в 1 параметре мы говорим как нужнов выводить остальные параметры(также можно вставить какое нибуть слово в формат)
                                                   // privet и 3.1415 - это уже данные пошли
        Employee emp1 = new Employee(1, "Kolia", "Pupkin", 1200, 0.13 );
        Employee emp2 = new Employee(4, "Sergei", "Sidorov", 1345, 0.26 );
        Employee emp3 = new Employee(15, "Ann", "Kirilovna", 1534, 0.32 );

        info(emp1);
        info(emp2);
        info(emp3);
        //вывод:
//        id = 001 name = 	 Kolia        	 Pupkin       	 1 356,0
//        id = 004 name = 	 Sergei       	 Sidorov      	 1 694,7
//        id = 015 name = 	 Ann          	 Kirilovna    	 2 024,9

    }
}

class Employee{
    int id;
    String name;
    String surname;
    int salary;
    double bonus;

    public Employee(int id, String name, String surname, int salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }
}
