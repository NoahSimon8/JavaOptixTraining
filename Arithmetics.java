package JavaOptixTraining;

public class Arithmetics {
    public static void main(String[] args){

        /* 
        Create code that completes the following task:
 - Compute the remainder of 6 multiplied by 1234124 divided by 11345 minus 890809 plus 90800 (use order of operations) is divided by 980098, and store this in a variable called num (get an exact number as opposed to a whole number)
 - Divide num by 100
 - Print num to the terminal

        */
        double num;
        num = ((6*1234124)%11345 - 890809+90800)/980098;
        num/=100;
        System.out.println(num);
    }
}
