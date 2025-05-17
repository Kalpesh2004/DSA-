public class SumOfDigits {
    public static void main(String[] args) {
        int ans = DigitSum(5432);
        System.out.print(ans);
    }
    static int DigitSum(int n)
    {
        if(n == 0)
        {
            return 0 ;
        }
        return (n%10) + DigitSum(n/10);

    }
}
