import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = 10;
        int K = 5;

        int candies = N;

        int order = sc.nextInt();

        if(order <= 0 || order > candies)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            candies = candies - order;

            if(candies <= K)
            {
                candies = N;
            }

            System.out.println("Number of Candies Sold: " + order);
            System.out.println("Number of Candies available: " + candies);
        }
    }
}
