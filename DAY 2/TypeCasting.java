class TypeCasting
{
    public static void main(String a[])
    {
        // Implicit Conversion
        byte b = 20;
        int i = b;   // byte is automatically converted to int
        System.out.println(i);   // will print 20 

        // Explicit Casting 
        int c = 25;
        byte d = (byte) c;  // int is explicitly cast to byte (may cause data loss) risky
        System.out.println(d);   // will print 25 because 25 is within byte range (-128 to 127)

        // For Float to Int
        float f = 5.6f;
        int e = (int) f; // float is explicitly cast to int (decimal part will be lost)
        System.out.println(e);   // will only print 5, not 5.6

        // Type Promotion 
        byte g = 10;
        byte h = 30;
        int result = g * h;
        System.out.println(result);  // because the multiplied number is too big for byte, it will temporarily convert into int
    }
}