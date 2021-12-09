package function;

public class EvenOddLoop {
    public static void main(String[] args) {
        int odd=0;
        int even=0;
        for(int i=1;i<21;i++){
            if (i%2==0){
                even++;
            }
            else{
                odd++;
            }
            }
        System.out.println("NO of even"+ even+" "+
                "NO of even: "+odd);
    }

}
