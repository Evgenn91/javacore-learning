package NestedClasses.b.staticc.nestedd.classss;

/**
 * статичный класс мы можем использовать как обычный внешний класс
 * тоесть мы можем создать внутренний статичный класс без создания его внешнего класса
 * - не может обращаться к не static полям внешнего класса(но зато может обращаться даже к private static элементам)
 * - можно сделать final(не будет иметь наследников)
 * - можно сделать private(можно будет только обращаться во внешнем классе)
 * - можно сделать abstract
 * - может быть унаследован от какого то другого класса
 * - может содержать static и non-static элементы
 * - внешний класс можен обращаться даже к private элементам внутр статик класса(и static и non-static(нужно создать внутр класс))
 *
 */
public class StaticNestedClasss {
    public static void main(String[] args) {
        //create nested class
        Car.Engine myEngine = new Car.Engine(150);
        Car car = new Car("red", 2, myEngine);

    }
}
