class NestedLoop
{
    public static void main(String a[])
    {
        // Nested loop used in While loop
        int match = 1;
        while(match<=3)
        {
            System.out.println("Match " + match + " Kicks Off");

            int half = 1;
            while(half<=2)
            {
                System.out.println("Half " + half + " has started");
                half++;
            }
            match++;
        }
        System.out.println("All Matches are over\n");



        // Nested loop used in For loop
        for(int days = 1; days<=7; days++)
        {
            System.out.println("Day " + days);

            for(int hours = 1; hours<=9; hours++)
            {
                System.out.println("   " + (hours+8) + ":00" + " to " + (hours+9) + ":00");
            }
        }
    }
}