package ResursionAndLoop.c.recursionn;


/**
 * Простейший парсер арифметических действий
 * работает долько когда одни скобки вложенны в другие
 * не работает если будет так:
 *  2+4+4
 *  (...) + (...)
 *  (...) + 7
 *
 */
public class ParsingArytchmeticOperations {
    public static void main(String[] args) {
        int result = ParsingArytchmeticOperations.eval("3+(3+2)");
        System.out.println(result);//8
    }

    public static int eval(String expr){
        if(expr.startsWith("(") && expr.endsWith(")")){
            return eval(expr.substring(1, expr.length() - 1));
        } else if(expr.startsWith("(") && !expr.endsWith(")")){
            throw new RuntimeException("if expr start width '(' than MVS");
        } else {
            int pos = 0;
            while(pos < expr.length()-1){
                if(Character.isDigit(expr.charAt(pos))){
                    pos++;
                } else {
                    int leftOperand = Integer.valueOf(expr.substring(0, pos));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr.substring(pos + 1));
                    switch (operation){
                        case '+': return leftOperand + rightOperand;
                        case '-': return leftOperand - rightOperand;
                        case '*': return leftOperand * rightOperand;
                        case '/': return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr);
        }

    }
}
