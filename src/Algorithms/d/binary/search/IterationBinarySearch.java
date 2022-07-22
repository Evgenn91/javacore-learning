package Algorithms.d.binary.search;

/**
 * бинарный поиск, реализованный в jdk
 */
public class IterationBinarySearch {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[]a, int key){
        return IterationBinarySearch.binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[]a, int fromIndex, int toIndex, int key){//formIndex and toIndex - границы массива в котором ищем
        int low = fromIndex;
        int high = toIndex;
        while(low <= high){
            //считаем середину в диапазоне
            int mid = (low + high) >>>1; //считаем середину(>>> - беззнаковый shift вправо)
            //перем значение которое по середине
            int midVal = a[mid];
            //если значение меньше ключа то нижний индекс = среднему + 1
            if(midVal < key) low = mid + 1;
            //если значение больше ключа то верхний индекс = среднему - 1
            else if (midVal > key) high = mid - 1;
            //если же равен, то нашли индекс элемента, который искали
            else return mid;
        }
        return -(low+1); // key not found
    }


//     int mid = (low + high) >>>1;
//     поидее это тоже самое что:
//     mid =(low + high)/2; - но не используем т.к. если будет переполнение(вылезем за пределы int)

}
