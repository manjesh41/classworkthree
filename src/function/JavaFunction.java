package function;

import java.util.Scanner;

public class JavaFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter the first num:");
            int first=sc.nextInt();
            System.out.println("Enter the second num:");
            int second=sc.nextInt();
            int result=first+second;
            System.out.println("The sum is "+" "+result);
            System.out.println("DO you want to sontinue(Y/N)?");
            ch=sc.next().toLowerCase().charAt(0);

        }while (ch=='y');

    }
}
