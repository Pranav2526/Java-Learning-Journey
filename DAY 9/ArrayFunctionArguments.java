public class ArrayFunctionArguments
{
    public static void main(String args[])
    {
        int Marks[] = {99, 89, 79};
        Update(Marks);

        for(int i = 0; i<Marks.length; i++)
        {
            System.out.print(Marks[i] + " ");
        }
        System.out.println();
    }

    public static void Update(int Marks[])
    {
        for(int i = 0; i<Marks.length; i++)
        {
            Marks[i] = Marks[i] + 1;
        }
    }
}