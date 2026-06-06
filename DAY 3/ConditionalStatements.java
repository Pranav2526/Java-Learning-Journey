class Conditional
{
    public static void main(String a[])
    {
        // if-else statement
        int num1 = 9;
        int num2 = 10;
        if(num1 > num2)
        {
            System.out.println("num1 is greater than num2");
        }
        else
        {
            System.out.println("num2 is greater than num1");
        }


        
        // if-else-if statement
        int x = 15;
        int y = 20;
        int z = 25;
        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }

    }
}