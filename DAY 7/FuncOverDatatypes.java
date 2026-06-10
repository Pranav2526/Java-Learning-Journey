class FuncOverDatatypes
{
    public static void main(String args[])
    {
        int sum1 = sum(2, 2);
        float sum2 = sum(2.0f, 2.0f);
        System.out.println("Sum of 2 integer values: " + sum1);
        System.out.println("Sum of 2 float values: " + sum2);
    }

    public static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    public static float sum(float a, float b)
    {
        float sum = a+b;
        return sum;
    }
}