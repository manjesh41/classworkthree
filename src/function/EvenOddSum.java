package function;//find the sum of all odd numbers also add the last even number
//betweenm1 and 20

public class EvenOddSum {
    public static void main(String[] args) {
        int sumOfOddNum=0;
        int j=0;
        int k=0;
        for (int i=1;i<21;i++){
            if(i%2!=0){
                sumOfOddNum+=i;
            }
            else if(i%2==0){
                j=i;
            }


        }
        k=sumOfOddNum+j;
        System.out.println(k);
    }
}
