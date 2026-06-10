public class Scopes
{
    public static void main(String args[])
    {
        // Method Scope - The variable can only be used after the variable is defined and also used in same function
        int n = 4;
        System.out.println(n);

        // Block Scope - the variable defined inside a particular block and only be used inside that block, not outside eg -
        {
            int m = 5;
            System.out.println(m);
        }
        
    }
}