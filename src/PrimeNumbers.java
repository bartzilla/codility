/**
 * Created by ciprianosanchez on 6/21/17.
 */
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        System.out.println(PrimeNumbers.getNumberOfPrimes(10));
    }

    //checks whether an int is prime or not.
    static boolean isPrime(int n) {

        if(n >=1 ){
            for(int i=2;i<n;i++) {
                if(n%i==0)
                    return false;
            }
            return true;
        }
        return false;
    }

    static int getNumberOfPrimes(int N)
    {
        int counter = 0;

        for(int i=2; i<N; i++)
        {
            if(isPrime(i))
            {
                counter++;
            }
        }
        return counter;
    }
}
