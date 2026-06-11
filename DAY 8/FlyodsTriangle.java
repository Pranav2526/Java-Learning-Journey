// To Print Floyd's Triangle Pattern

public class FlyodsTriangle
{
    public static void main(String args[])
    {
       Flyods_Pattern(10);
    }

    public static void Flyods_Pattern(int n)
    {
        int counter = 1;
        // Outer Loop
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}