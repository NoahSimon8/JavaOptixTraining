import java.lang.Runnable;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.Scanner;

/* I know this is bassically just the answers,
 but I was really unsure about the syntax. I made sure to 
 understand what I was writing though.
*/
public class Lambdas {

    // static variable so that num is accesable to any of the methods
    static int num;

    public static void main(String[] args){

        // scanner for input
        Scanner inp = new Scanner(System.in);

        // will intake a integer and set num to it
        Consumer<Integer> setNum = (Integer count) -> {
            num = count;
        };

        // will return the value of num
        Supplier<Integer> getNum = () -> {
            return num;
        };

        // counts up from 0 until num is reached
        Runnable counter = () -> {
            // sends setNum a user input
            setNum.accept(Integer.valueOf(inp.nextLine()));
            // count starts at 0
            int count = 0;
            // loop until count is equal or greater than num
            while (getNum.get() > count){
                // increment count by 1 each loops
                count++;
                // print count
                System.out.println(count);
            }
        };

        counter.run();

    }
    
}

