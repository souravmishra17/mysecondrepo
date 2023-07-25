import java.util.Scanner;

public class screvst {
    public static void main(String[] args){
        String str= "sourav";
        String rev ="";
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            rev=rev+ str.charAt(i);

        }
System.out.println("Hay ......your name is "+rev);
    }
}
