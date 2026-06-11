public class SolidRhombus
{
    public static void main(String args[])
    {
        Solid_Rhombus(4);
    }

    public static void Solid_Rhombus(int n)
    {
        //Outer Loop
        for(int i = 1; i<=n; i++)
        {
            //Inner Loop
            for(int j = 1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}