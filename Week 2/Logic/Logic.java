public class Logic {
    public static void main(String[] args){
        int tea = 0;
        int candy = 2;
        
        
        int value=0;

        // A bad teaparty
        if (tea<5 || candy<5){
            value=  0;
        }
        // if the party isn't bad, what if it's great?
        else if (tea>=candy*2 || candy >= tea*2){
            value= 2;
        }
        // if it's not great, but not bad, it's good
        else {
            value= 1;   
        }
        
        System.out.println(value);
    }
}
