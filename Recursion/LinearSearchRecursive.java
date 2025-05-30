public class LinearSearchRecursive{
    public static void main(String[] args) {
        int[] arr = {3,4,6,2,7};
        int target = 6;
 
        System.out.println("Target Found:"+find(arr,target,0));

        System.out.println("Target Index: "+findIndex(arr,target,0));
        
    }
    static boolean find(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);

    }
    static int findIndex(int[] arr, int target, int index)
    {
        if(index == arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        return findIndex(arr, target, index+1);
    }
}
