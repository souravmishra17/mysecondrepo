import java.util.Scanner;

public class palindromnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if(rev==num)
        {
            System.out.println("no is a palindrom number");
        }
        //else{
         //   System.out.println("no is not a palindrom number");

       // }

       // System.out.println("this a rev number" + rev);

    }
}
