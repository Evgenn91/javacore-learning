package Collections.gg.set_realization;

import java.util.HashSet;
import java.util.Set;

/**
 * Set - интерфейс
 *           Set
 *          /   \
 *   HashSet     SortedSet
 *      |             |
 * LinkedHashSet    NavigableSet
 *                      |
 *                   TreeSet
 *  Set - это множество уникальных элементов(ее методы очень быстрые)
 *  В основе Set - урезанная версия HashMap(как value просто хранится какая та константа)
 *
 *  -Не запоминает порядок элементов
 *  -может содержать значение null
 *  - если попробуем добавить дубликат, то ничего не произойдет
 *
 * также нужно переопределять hash и equals!!!
 */
public class IntroduceInSetAndHashSet {
    public static void main(String[] args) {
        Set<String> sett = new HashSet<>();

        //1 метод add
        sett.add("Kolia");
        sett.add("Igor");
        sett.add("Sveta");
        sett.add("Yula");

        for(String s: sett){
            System.out.println(s);
        }

        //2 метод remove
        sett.remove("Kolia");

        //3 метод size
        System.out.print(sett.size());

        //4 метод isEmpty - пустой ли наш сет

        //5 метод contains - есть ли какой то определенный элемент у нас в сете

        //6 метод addAll - объединяет 2 множества
        Set<String> setUnion = new HashSet<>();

        setUnion.add("Kolia1");
        setUnion.add("Igor1");
        setUnion.add("Sveta1");
        setUnion.add("Yula1");

        setUnion.addAll(sett);

        //7 метод retainAll - объединяет 2 множества(оставляет только те элементы, которые были у обоих множеств!!!)

        //8 метод removeAll - объединяет 2 множества(удаляет все элементы которые были у второго множества)


    }
}
