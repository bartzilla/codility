package Codility;

/*
 *  Correctness: 100%
 *  Performance: not assessed
 *  Task score: 100%
 */
public class BinaryGap
{
    public static void main(String[] args)
    {
        System.out.println("Biggest gap is: " + solution(1376796946));
    }

    private static int solution(int N)
    {
        String binary = Integer.toBinaryString(N);
        System.out.println(N + " in binary is " + binary );
        int counter = 0;
        int biggestGap = 0;

        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                for(int j=i+1; j<= binary.length() - 1; j++)
                {
                    if(binary.charAt(j) == '0')
                    {
                        if(j == binary.length())
                        {
                            return biggestGap;
                        }

                        counter++;
                        continue;
                    }

                    if (counter > biggestGap)
                    {
                        biggestGap = counter;
                    }
                    counter = 0;
                    i = j - 1;
                    break;
                }
            }
        }

        return biggestGap;
    }
}
