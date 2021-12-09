package function;

import java.util.Scanner;

public class FunctionOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first num:");
        int first=sc.nextInt();
        System.out.println("Enter the second num:");
        int second=sc.nextInt();

        int hello=manjesh(first,second);
        System.out.println("sum is" + hello);

    }

    public static int manjesh(int first,int second){
        return first+second;
    }

}
