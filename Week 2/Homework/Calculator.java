import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    
    public static void main(String[] args){
        // creates a scanner
        Scanner scan = new Scanner(System.in);
        // this will store the input
        String input;
        // index location of the first space in the input
        int space_at;
        // the value of the first number
        double first_num;
        // value of the second number
        double second_num;
        // index location of the second space in the input
        int second_space_at;
        // string value of the operation. I am not sure why you wanted an array, but sure
        String[] operation = new String[1];
        // will put first and second num into this. Again, not sure why you wanted an array, but sure
        double[] nums = new double[2];




        while (true){
            System.out.println("Enter a Calculation");
            // gets user input
            input = scan.nextLine();
            // Uses the index of the space to seperate the input into two numbers and an operation
            space_at = input.indexOf(" ");
            nums[0] = Integer.valueOf(input.substring(0, space_at));
            second_space_at = input.substring(space_at+1).indexOf(" ");
            // If there is no second space, ie only one number in the calculation (ex sqrt), it skips some code
            if (second_space_at == -1){
                operation[0] = input.substring(space_at+1);
            }
            else{
                // if there is a second pace, get its true index
                second_space_at += space_at + 1;
                // find the operation based on the location of the two spaces
                operation[0] = input.substring(space_at+1, second_space_at);
                // the second number is equal to the text after the second space
                nums[1] = Integer.valueOf(input.substring(second_space_at+1));
            }

            
            // run the calculations

            if (operation[0].equals("+")){
                System.out.print(String.valueOf(nums[0]) + " + " + String.valueOf(nums[0]) + " = ");
                System.out.println(nums[0] + nums[1]);
            }        
            if (operation[0].equals("-")){
                System.out.print(String.valueOf(nums[0]) + " - " + String.valueOf(nums[0]) + " = ");

                System.out.println(nums[0] - nums[1]);
            }        
            if (operation[0].equals("*")){
                System.out.print(String.valueOf(nums[0]) + " * " + String.valueOf(nums[0]) + " = ");

                System.out.println(nums[0] * nums[1]);
            }        
            if (operation[0].equals("/")){
                System.out.print(String.valueOf(nums[0]) + " / " + String.valueOf(nums[0]) + " = ");

                System.out.println(nums[0] / nums[1]);
            }        
            if (operation[0].equals("%")){
                System.out.print(String.valueOf(nums[0]) + " % " + String.valueOf(nums[0]) + " = ");

                System.out.println(nums[0] % nums[1]);
            }        
            if (operation[0].equals("^")){
                System.out.print(String.valueOf(nums[0]) + "^" + String.valueOf(nums[0]) + " = ");

                System.out.println(Math.pow(nums[0], nums[1]));
            }        
            if (operation[0].equals("sqrt")){
                System.out.print("The Square Root of "+String.valueOf(nums[0]) + " = ");

                System.out.println(Math.sqrt(nums[0]));
            }        
            if (operation[0].equals("cbrt")){
                System.out.print("The Cube Root of "+String.valueOf(nums[0]) + " = ");

                System.out.println(Math.cbrt(nums[0]));
            }        
            if (operation[0].equals("hypotenuse")){
                System.out.print("The hypotenuse of "+String.valueOf(nums[0]) + " and " + String.valueOf(nums[1])+ " is ");

                System.out.println(Math.sqrt(nums[0]*nums[0] + nums[1]*nums[1]));
            }        
        }


    }
}
