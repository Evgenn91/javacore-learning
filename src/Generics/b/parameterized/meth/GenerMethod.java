package Generics.b.parameterized.meth;

import java.util.ArrayList;

/**
 * можно использовать в классе параметризированный метод
 * после слова static выражение <T> - говорит что мы используем дженерики в этом методе
 * а просто Т - говорит о "возвращаемом типе данного метода"
 *
 * Когда класс параметризирован, то нет необходимости прописывать что мы используем дженерики в каждом методе этого класса
 */
public class GenerMethod {
    public static <T> T getSecElem(ArrayList<T> list) {
        return list.get(1);
    }
}
