public class Patterns
{
    public static void main(String args[])
    {
        // Star Pattern
        for(int line = 1; line<=4; line++)
        {
            for(int star = 1; star<=line; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        // Inverted Star Pattern
        int n = 7;
        for(int line2 = 1; line2<=n; line2++)
        {
            for(int star2 = 1; star2<=n-line2+1; star2++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}