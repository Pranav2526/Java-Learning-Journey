public class BinaryToDecimal
{
    public static void main(String args[])
    {
       BinToDec(101);
    }

    public static void BinToDec(int BinNum)
    {
        int MyNum = BinNum;
        int pow = 0;
        int DecNum = 0;

        while(BinNum > 0)
        {
            int LastDigit = BinNum % 10;
            DecNum = DecNum + (LastDigit * (int)Math.pow(2, pow));
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal of " + MyNum + ": " + DecNum);
    }
}