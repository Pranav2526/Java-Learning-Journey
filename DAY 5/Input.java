import java.util.*;

public class Input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Using next()
        String word = sc.next();
        System.out.println(word);

        // Using nextLine()
        String sentence = sc.nextLine();
        System.out.println(sentence);

        // Using nextInt()
        int number = sc.nextInt();
        System.out.println(number);

        // Using nextFloat()
        float decimal = sc.nextFloat();
        System.out.println(decimal);

        // Using nextBoolean()
        boolean bl = sc.nextBoolean();
        System.out.println(bl); 
       
    }
}