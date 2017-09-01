import java.util.ArrayList;
import java.util.List;

public class last_two {
    public static void main (String[] args){
        FizzBuzz(16);
        System.out.println(generate(30));
        System.out.println(generate(1));
    }
    public static void FizzBuzz(int n){
        for(int i=1;i<=n;i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static List<Integer> generate (int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}