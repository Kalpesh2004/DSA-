public class CheckSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,12,3,4,5,6,3};
        System.out.println(CheckSort(arr,0));
    }
    static boolean CheckSort(int[] arr , int index)
    {
        if(index == arr.length -1)
        {
            return true;
        }
        return arr[index] < arr[index + 1] && CheckSort(arr,index +1);
    }
}
