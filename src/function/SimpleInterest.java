package function;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the parameter:");
        int parameter=sc.nextInt();

        System.out.println("Enter the time:");
        int time=sc.nextInt();
        System.out.println("Enter the rate:");
        int rate=sc.nextInt();

        int SimpleInterest= manjesh(parameter,time,rate);
        System.out.println("the simple interest is"+ SimpleInterest);
    }
    public static int manjesh(int parameter,int time,int rate){
        return parameter*time*rate;
    }
}
