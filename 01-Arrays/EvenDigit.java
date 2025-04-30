// leetcode question.

public class EvenDigit {
    public static void main(String[] args) 
    {

        int[] nums = {12,345,2,6,7546,345676,34, 567, 8764,32};

    
        System.out.println(FindNumbers(nums));


    }
    static int FindNumbers(int[] arr)
    {
        int Count =0;
        for(int i =0; i<arr.length; i++)
        {
            int iNo = arr[i];
            {
                if(even(iNo))
                {
                    Count++;
                }
            }
        }
        return Count;
    }

    //function to check whether number is even or not 
    static boolean even(int num)
    {
       int numberOfDigits = digits(num);

       return numberOfDigits %2 == 0;
    }
    static int  digits(int num)
    {
        int count =0;
        while(num>0)
        {
            count++;
            num = num/10;
        }
        return count;
    }
    
    
}
