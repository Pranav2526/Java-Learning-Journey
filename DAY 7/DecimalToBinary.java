public class DecimalToBinary
{
    public static void main(String args[])
    {
        DecToBin(5);
    }

    public static void DecToBin(int DecNum)
    {
        int pow = 0;
        int BinNum = 0;
        int MyNum = DecNum;

        while(DecNum > 0)
        {
            int remainder = DecNum % 2;
            BinNum = BinNum + (remainder * (int)Math.pow(10, pow));
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("Binary no. of " + MyNum + ": " + BinNum);
    }
}