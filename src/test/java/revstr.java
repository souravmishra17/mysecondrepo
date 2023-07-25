import java.util.Scanner;

public class revstr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("enter a string");
        String rev = "";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
    }
}
