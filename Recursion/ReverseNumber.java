public class ReverseNumber {
    public static void main(String[] args) {
       reverse(12345);
       System.out.println(rev);
    }
     static int rev = 0;
    static void reverse(int n)
    {
        int Digit = 0;
    
        if(n == 0)
        {
            return;
        }
        Digit = n %10;
        rev = rev *10 + Digit;
        reverse(n /10);
    }
}
