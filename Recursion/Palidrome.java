public class Palidrome {
    public static void main(String[] args) {
        int num = 121;
        boolean ispalindrome = checkPal(num);
       System.out.println(ispalindrome ? " it is palidrome" : "not a palidrome");
    }

     static int reverse(int n){
        return reverseHelper(n,0);
     }
    static int reverseHelper(int n , int rev)
    {    
        if(n == 0)
        {
            return rev;
        }
        return reverseHelper(n /10 , rev *10 + (n%10));
    }
    static boolean checkPal(int n)
    {
        return n == reverse(n);
    }
}
