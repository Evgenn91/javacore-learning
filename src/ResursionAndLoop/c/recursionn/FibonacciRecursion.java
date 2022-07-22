package ResursionAndLoop.c.recursionn;

/**
 * Пример рекурсии с ветвлением - числа фибоначчи
 */
public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(FibonacciRecursion.fib(5)); //8
        System.out.println(FibonacciRecursion.fibRec(5)); //8
    }

    //итеративный алгоритм
    public static int fib(int arg){
        if(arg == 0) return 1;
        if(arg == 1) return 1;
        int[] result = new int[arg + 1];
        result[0] = 1;
        result[1] = 1;
        for(int k = 2; k < result.length; k++){
            result[k] = result[k-2] + result[k-1]; //это рекурсивное ветвление(вызов метода несколько раз в нем самом)
                                                   //ветвление, которое получается похоже на дерево(а именно граф в нашем случае)
        }
        return result[arg];
    }

    //рекурсивный алгоритм
    public static int fibRec(int arg){
        if(arg == 0){
            return 1;
        } else if(arg == 1){
            return 1;
        } else {
            return fibRec(arg - 2) + fibRec(arg - 1);
        }
    }

    //с тернарным оператором(не очень читабельно)
    public static int fibRec1(int arg){
        return arg < 2 ? 1 : fibRec1(arg - 2) + fibRec1(arg - 1);
    }
}
