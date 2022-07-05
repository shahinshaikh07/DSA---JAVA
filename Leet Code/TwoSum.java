public class TwoSum{
    public static void main(String[] args) {


    //     class Solution {
    // public int[] twoSum(int[] nums, int target) {

        int arr[] = {2, 7, 11, 15};
        int n = arr.length;
       int target = 9;
       int arr1[] = new int[2];
                for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == target - arr[i]) {
                 //   return new int[] { i, j };
                 //int arr1[] = new int[2];
                 arr1[0] = i;
                 arr1[1] = j;


                }
            }
        }
        System.out.println(arr1[0]+" "+arr1[1]);
        //System.out.println(arr1[1]);
        // In case there is no solution, we'll just return null
    //     return null;
    // }
//}

        // int arr[] = { 3,2,4};
        // int target = 9;
        // int n = arr.length;
        // int k;

        // for(int i =0; i<n; i++ )
        // {
        //     k = target - arr[i];

        // }
        // }
}
}