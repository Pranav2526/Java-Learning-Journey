class FuncOverParameters
{
    public static void main(String args[])
    {
        int sum1 = sum(2, 2);
        int sum2 = sum(2, 2, 2);
        System.out.println("Sum of 2 numbers: " + sum1);
        System.out.println("Sum of 3 numbers: " + sum2);
    }

    public static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    public static int sum(int a, int b, int c)
    {
        int sum = a+b+c;
        return sum;
    }
}