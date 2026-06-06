class Logical
{
    public static void main(String a[])
    {
        // AND operator
        int num1 = 9;
        int num2 = 5;
        int num3 = 7;
        int num4 = 3;
        boolean result1 = num1 > num2 && num3 > num4;
        System.out.println(result1);

        // OR operator
        int num5 = 4;
        int num6 = 6;
        int num7 = 2;
        int num8 = 8;
        boolean result2 = num5 > num6 || num7 < num8;
        System.out.println(result2);

        // NOT operator
        int num9 = 10;
        int num10 = 15;
        boolean result3 = num9 != num10;
        System.out.println(result3);
    }
}