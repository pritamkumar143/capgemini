
import java.util.Scanner;

public class First{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String hash = "";
       String rem = "";
       for(int i=0; i<s.length(); i++) {
        if(s.charAt(i) == '#'){
            hash +="#";
        }
        else{
            rem +=s.charAt(i);
        }
       }
       String result = hash+rem;
       System.out.println(result);

    }
}
