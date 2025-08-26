import java.util.*;

public class PrimefibbonaciUpToLimit {
    static boolean isPrime(long n){
        if(n <2 ) return false;
        if(n == 2) return true;
        if(n % 2 ==0) return false;
        for(long i=3; i* i<=n; i+=2){
            if(n%i ==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Limit(inclusive): ");
        long limit=sc.nextLong();

        long a=0, b=1;
        System.out.print("Prime Fibonnaci number <=" + limit + ": ");
        while(a <= limit){
            if(isPrime(a)) System.out.print(a + " ");
            long c= a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }

}
