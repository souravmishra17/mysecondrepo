import java.util.Scanner;

public class countno {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A no to count");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count ++;
        }
        System.out.println("your no having" +" "+ count +" "+ "digit");


    }
}
