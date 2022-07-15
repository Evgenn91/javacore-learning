package ReflectionInJava.b.introduce.reflection2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {

    void sum(int a, int b){
        int result = a + b;
        System.out.println("summ " + a +" and "+ b + " = " + result);
    }

    void subtraction(int a, int b){
        int result = a - b;
        System.out.println("subtraction " + a +" and "+ b + " = " + result);
    }

    void multiplication(int a, int b){
        int result = a * b;
        System.out.println("multiplication " + a +" and "+ b + " = " + result);
    }

    void division(int a, int b){
        int result = a / b;
        System.out.println("division " + a +" and "+ b + " = " + result);
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test100.txt"))){
            String methodName = reader.readLine();
            String firsArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();//исп declared чтобы не пробегаться по методам унаследованным от object
            for(Method oneMethod: methods){
                if(oneMethod.getName().equals(methodName)){
                    method = oneMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firsArgument), Integer.parseInt(secondArgument)); //вывод: summ 13 and 5 = 18


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
