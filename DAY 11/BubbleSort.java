public class BubbleSort
{
    public static void main(String args[])
    {
        int arr[] = {5, 3, 1, 4, 2};
        sort(arr);
        PrintArray(arr);
    }

    public static void sort(int arr[])
    {
        for(int turn = 0; turn<arr.length-1; turn++)
        {
            for(int j = 0; j<=arr.length-2-turn; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void PrintArray(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}