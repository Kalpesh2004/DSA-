public class BinarySearch
{
    public static void main(String[ ] args)
    {
            int[] arr = {2,3,4,5,12,34,56,66,78,89,90,93,95,};
            int target = 66;

            int ans = Search(arr,target);
            System.out.println(ans);
    }
    //return the index
    //return -1 if does not exist
    static int Search(int []arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            //find the middle elements

            int mid = start  + (end - start)/2;

            if(target <arr[mid])
            {
                end = mid-1;
            }else if (target>arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}

