package ResursionAndLoop.c.recursionn;

/**
 * Рекурсия - это нечто, что использует сама себя, или нечто что содержит в себе часть, которая эквивалентна целому(см. понятие фракталы))
 * есть только 2 способа повторять какое то действие в java: цикл и рекурсия
 *
 * основное отличие цикла от рекурсии: в цикде мы не можем вернуться к тому что сделали в определенной итерации
 *                                    а в рекурсии можем т.к. когда дошли до конца мы возвращаесмся обратно!!!!
 *
 *  в рекурсии всегда должно быть условие выхода
 *
 * кроме рекурсивных методом, есть рекурсивные(они часто динамические) структуры данных - Node(в котором есть поле Node next - это рекурсия)
 *
 *         Рекурсия
 *        /        \
 *    прямая     косвенная
 *
 *  1) Прямая - когда в теле метода вызывается этот метод
 *  2) Косвенная - в теле метода вызывается другой метод, а в нем вызывается опять наш метод или еще через метод
 *
 *   также   Рекурсия
 *           /       \
 *  без ветвления    с ветвлением(смотри FibonacciRecursion)
 *  (вызыв себя 1    (неск вызовов одного и
 *  раз в методе)     того же метода в теле)
 */
public class IntroduceRecursion {
    public static void main(String[] args) {
        IntroduceRecursion.f(1); // 1 2 4 8
        System.out.println();
        IntroduceRecursion.f1(1); // 8 4 2 1
        System.out.println();
        IntroduceRecursion.f2(1); // 1 2 4 8 8 4 2 1
    }

    //примерт рекурсии (print срабатывает перед тем как вызываем наш метод снова)
    public static void f(int arg){
        System.out.print(" " + arg);
        if(arg < 7) {
            f(2 * arg);
        }
    }

    //print срабатывает во время "возвращения"
    public static void f1(int arg){
        if(arg < 7) {
            f1(2 * arg);
        }
        System.out.print(" " + arg);
    }

    public static void f2(int arg){
        System.out.print(" " + arg);
        if(arg < 7) {
            f2(2 * arg);
        }
        System.out.print(" " + arg);
    }

}
