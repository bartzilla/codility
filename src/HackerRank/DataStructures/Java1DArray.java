package HackerRank.DataStructures;
import java.util.*;

public class Java1DArray {
    public static boolean canWin(int leap, int[] game) {

        for(int i=0; i<game.length; i++)
        {
            if (game[i] != 0)
            {
                if(i - 1 < 0|| game[i - 1] == 1)
                {
                    return false;
                }

                int stepBack = i - 1;

                int gameSize = game.length - 1;

                int newPosition = stepBack + leap;

                if (newPosition >= gameSize)
                {
                    return true;
                }

                if (game[newPosition] == 1)
                {
                    return false;
                }

                i = newPosition - 1;
            }

        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}