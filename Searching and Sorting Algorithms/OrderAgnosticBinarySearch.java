public class OrderAgnosticBinarySearch
{
    public static void main(String[ ] args)
    {
            int[] arr = {100,98,86,76,67,65,64,54,52,43,32,22,11,8,7};
            int target = 99;

            int ans = Search(arr,target);
            System.out.println(ans);
    }
    static int Search(int[] arr,int target)
    {
        int start = 0;
        int end  =arr.length-1;

        //find whether the array sorted in ascending or Descending 
        boolean isAsc =arr[start]<arr[end];
        
        while(start <= end)
        {
            //find the middle elements
            int mid = start  + (end - start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid-1;
                }else
                {
                    start = mid+1;
                }
            }else{
                if(target > arr[mid])
                {
                    end = mid - 1;
                }else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    //return the index
    //return -1 if does not exist
}

