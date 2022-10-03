package JavaOptixTraining;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    
    public static void main(String[] args){
        // scan is the input variable
        Scanner scan = new Scanner(System.in);
        String input;
        int space_at;
        double first_num;
        int second_space_at;
        String[] operation = new String[1];
        double second_num;
        double[] nums = new double[2];




        while (true){
            System.out.println("Enter a Calculation");
            // gets user input
            input = scan.nextLine();
            // Uses the index of the space to seperate the input into two numbers and an operation
            space_at = input.indexOf(" ");
            nums[0] = Integer.valueOf(input.substring(0, space_at)) ;
            second_space_at = input.substring(space_at+1).indexOf(" ");
            if (second_space_at == -1){
                operation[0] = input.substring(space_at+1);
            }
            else{
                second_space_at += space_at + 1;

                operation[0] = input.substring(space_at+1, second_space_at);
                nums[1] = Integer.valueOf(input.substring(second_space_at+1));
            }

            
            // Why do you want operations in an array? Well, here's a one element array


            if (operation[0].equals("+")){
                System.out.println(nums[0] + nums[1]);
            }        
            if (operation[0].equals("-")){
                System.out.println(nums[0] - nums[1]);
            }        
            if (operation[0].equals("*")){
                System.out.println(nums[0] * nums[1]);
            }        
            if (operation[0].equals("/")){
                System.out.println(nums[0] / nums[1]);
            }        
            if (operation[0].equals("%")){
                System.out.println(nums[0] % nums[1]);
            }        
            if (operation[0].equals("^")){
                System.out.println(Math.pow(nums[0], nums[1]));
            }        
            if (operation[0].equals("sqrt")){
                System.out.println(Math.sqrt(nums[0]));
            }        
            if (operation[0].equals("cbrt")){
                System.out.println(Math.cbrt(nums[0]));
            }        
            if (operation[0].equals("hypotenuse")){
                System.out.println(Math.sqrt(nums[0]*nums[0] + nums[1]*nums[1]));
            }        
        }


    }
}
