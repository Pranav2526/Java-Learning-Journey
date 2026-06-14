public class SelectionSort
{
    public static void main(String args[])
    {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        PrintArray(arr);
    }

    public static void sort(int arr[])
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            int MinPos = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[MinPos] > arr[j])
                {
                    MinPos = j;
                }
            }
            // SWAP
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArray(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}