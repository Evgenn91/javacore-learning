package Annotations.a.introduce.annotation;

/**
 * Аннотации - это специальные комментарии/метки/метаданные, которые нужны для передачи определенной информации.
 *  (метаданные это данные от данных)
 *  Здесь рассмотрим аннотации в java
 */
public class IntroduceAnnotations1 {
    public static void main(String[] args) {
        Parent p = new Child("Kolia");
        p.showInfo();//child name = Kolia
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated //говорит что данный метод устарел и его лучше не использовать
    void showInfo(){
        System.out.println("parent name = " + name );
    }
}

class Child extends Parent{
    public Child(String name) {
        super(name);
    }

    @Override //позволяет нам не допустить ошибку в переопределении родительского метода(напримр в имени или переменных)
    void showInfo(){
        System.out.println("child name = " + name );
    }
}
