public class LinearSearch
{
    public static void main(String args[])
    {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;
        int index = Linear(numbers, key);
        if(index == -1)
        {
            System.out.println("NOT FOUND");
        }
        else
        {
            System.out.println("Key is at index: " + index);
        }
    }

    public static int Linear(int numbers[], int key)
    {
        for(int i = 0; i<numbers.length; i++)
        {
            if(numbers[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
}