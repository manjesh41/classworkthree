package function;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=num+1;
        }
    }
}
