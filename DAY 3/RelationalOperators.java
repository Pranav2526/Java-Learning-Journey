class Relational
{
    public static void main(String a[])
    {
        int p = 10;
        int b = 15;
        boolean result1 = p > b; // Used less than operator
        System.out.println(result1);

        int c = 20;
        int d = 25;
        boolean result2 = c < d; // Used greater than operator
        System.out.println(result2);

        int e = 40;
        int f = 30;
        boolean result3 = e <= f; // Used less than or equal to operator
        System.out.println(result3);

        int g = 40;
        int h = 35;
        boolean result4 = g >= h; // Used greater than or equal to operator
        System.out.println(result4);

        int i = 50;
        int j = 50;
        boolean result5 = i == j; // Used equality operator
        System.out.println(result5);

        int k = 70;
        int l = 70;
        boolean result6 = k != l; // Used not equal to operator 
        System.out.println(result6);
    }
}