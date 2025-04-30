public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] nums = {23,34,65,46,87,35,56,98,43,24,76,98,26,18,56};
        int target = 56;
        int iRet = linearSearch(nums, target);
        System.out.println(iRet);
    }

    static int linearSearch(int[] arr,int target)
    {
        if(arr.length ==0)
        {
            return -1;
        }

        for(int index =0; index < arr.length; index++)
        {
            int ielement = arr[index];
            if(ielement == target)
            {
                return ielement;
            }
        }
        return -1;
    }
    
}
