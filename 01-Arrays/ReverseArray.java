import java.util.Arrays;

 class ReverseArray
{
    public static void main(String[] args)
    {
        
        int[] arr = {1,5,6,3,45,78,87,3};

        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start < end)
        {
            swap(arr,start,end);
            
                start++;
                end--;
        }
    }
    public static void swap(int[] arr,int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] =temp;
    }


}