public class CountZero {
    public static void main(String[] args) {
        System.out.println(CountZero(302109));
    }
    static int CountZero(int n)
    {
        return helper(n, 0);

    }
    private static int helper(int n , int C)
    {
        if(n == 0)
        {
            return C;
        }
        int rem = n %10;
        if(rem == 0)
        {
            return helper( n/10, C+1);
        }
        return helper(n/10, C);
    }
}
