package function;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num= sc.nextInt();
        int reverse=0;
        int temp=num;

        while (num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;



        }
        if(reverse==temp)
        System.out.println("paliendrom");

        else{
            System.out.println("not a paliendrom");
        }

    }
}
