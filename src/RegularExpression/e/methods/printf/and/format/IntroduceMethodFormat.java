package RegularExpression.e.methods.printf.and.format;

/**
 * необходим если хотим не просто в каком то определенном формате выводить стринг
 * а еще и хранить его в таком формате
 */
public class IntroduceMethodFormat {
    public static void main(String[] args) {

        String newString = String.format("id = %03d name = \t %-12s \t %-12s \t %,.1f \n",1, "Kolia", "Pupkin", 1200 *(1 + 0.13));
        System.out.println(newString);

        //вывод
//        id = 001 name = 	 Kolia        	 Pupkin       	 1 356,0
    }
}
