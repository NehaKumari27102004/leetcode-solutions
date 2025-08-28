import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();

        while (n !=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=sumOfSquares(n);
        }
        return true;
    }

    private int sumOfSquares(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit *digit;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        HappyNumber happy = new HappyNumber();

        int n1 = 19;
        int n2 = 2;

        System.out.println("Is " + n1 + " a happy number? " + happy.isHappy(n1));
        System.out.println("Is " + n2 + " a happy number? " + happy.isHappy(n2));
    }
}
