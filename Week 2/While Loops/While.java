public class While {
    public static void main(String[] args){

        int num = 64;
        // iteravly divides 64 by 2, printing each number until 1
        while (num >= 1){
            System.out.println(num);
            num/=2;
        }
    }
}
