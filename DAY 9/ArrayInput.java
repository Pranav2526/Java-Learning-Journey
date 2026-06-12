import java.util.*;

public class ArrayInput
{
    public static void main(String args[])
    {
        int Marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Physics marks: ");
        Marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        Marks[1] = sc.nextInt();

        System.out.print("Enter Mathematics marks: ");
        Marks[2] = sc.nextInt();

        System.out.println("Physics: " + Marks[0]);
        System.out.println("Chemistry: " + Marks[1]);
        System.out.println("Mathematics: " + Marks[2]);

        // To Update value
        Marks[1] = 99;
        System.out.println("Updated Chemistry marks: " + Marks[1]);

        int percentage = (Marks[0] + Marks[1] + Marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

        // To Check length of an array
        System.out.println("Length of array: " + Marks.length);
    }
}