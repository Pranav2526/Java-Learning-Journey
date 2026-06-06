class Ternary
{
    public static void main(String a[])
    {
        int x = 20;
        
        String solve = x%2 == 0? "Even" : "Odd";  // Ternary Operator Syntax: condition ? value_if_true : value_if_false
        System.out.println(solve);
    }
}