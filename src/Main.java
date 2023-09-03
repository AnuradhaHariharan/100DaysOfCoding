import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int result=0;
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            int val=(int)c-'A'+1;
            result=result*26+val;
        }
        System.out.print(result);


    }
}