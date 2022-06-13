package Collections.d.iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * расширяет обычный Iterator
 * имеет методы при которыз модет идти не только с начала но и с конца списка
 */
public class ListIteratorr {


    //будем проверять является ли наш список полиндромом(зеркальные слова) или нет
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()){
            list.add(ch);
        }

        //теперб будем идти с 2ух сторон
        //этот код неэффективный потому что они будут идти до конца противоположных сторон а не только до середины
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());//list.size - это говорим с какой позиции нужно начинать итерацию
        boolean isPalendrom = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalendrom = false;
                break;
            }
        }
        if(isPalendrom){
            System.out.println("this is a palendrom");
        } else {
            System.out.println(" this is not a palendrom");
        }


    }

}
