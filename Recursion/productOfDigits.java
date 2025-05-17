public class productOfDigits {
    public static void main(String[] args) {
        int ans = DigitProduct(5432);
        System.out.print(ans);
    }
    static int DigitProduct(int n)
    {
        if(n%10 ==  n)
        {
            return n;
        }
        return (n%10) * DigitProduct(n/10);

    }
}
