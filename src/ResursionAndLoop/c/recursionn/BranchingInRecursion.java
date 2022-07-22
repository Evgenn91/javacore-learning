package ResursionAndLoop.c.recursionn;

//посмотрим процесс работы цикла фибоначчи
public class BranchingInRecursion {
    public static void main(String[] args) {
        System.out.println(BranchingInRecursion.fibRec1(5)); // 5 3 1 2 0 1 4 2 0 1 3 1 2 0 18
        //на что это похоже:

//                         5
//                  ---------------
//                 3|              |4
//               ------         ---------
//             1|     |2       2|        |3
//                  ----      ----      -----
//                 0|   |1   0|   |1   1|   |2
//                                         ----
//                                        0|   |1

//        судя по результату это обход дерева в глубину!!! (от корня к его концам)
//        обход в ширину был бы таким примерно: 5 3 4 1 2 2 3 0 1 0 1 1 2 0 1


        System.out.println(BranchingInRecursion.fibRec2(5));// 1 0 1 2 3 0 1 2 1 0 1 2 3 4 58

        //печать в момент перехода узлов
        System.out.println(BranchingInRecursion.fibRec3(5));// 3 2 5 2 4 3 28
    }

    public static int fibRec1(int arg){
        System.out.print(" " + arg);
        return arg < 2 ? 1 : fibRec1(arg - 2) + fibRec1(arg - 1); //если переставить fibRec1(arg - 2) и fibRec1(arg - 1) то результат будет прежним, а дерево станет зеркальным
    }

    public static int fibRec2(int arg){
        int result = arg < 2 ? 1 : fibRec2(arg - 2) + fibRec2(arg - 1);
        System.out.print(" " + arg);
        return result;
    }

    public static int fibRec3(int arg){
        int result = arg < 2 ? 1 : fibRec3(arg - 2) + met(arg) + fibRec3(arg - 1);
        return result;
    }

    public static int met(int arg){
        System.out.print(" " + arg);
        return 0;
    }
}
