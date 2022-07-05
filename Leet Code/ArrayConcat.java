public class ArrayConcat {
    public static void main(String[] args) {
          
        int nums[] = {1,3,2,1};
        int n = nums.length;
        int m = 2*n;
        
        
        int arr[] = new int[m];
        
        for(int i = 0; i< n; i++)
        {
            arr[i]= nums[i];
        }
        for(int i = n;i<m;i++)
        {
            arr[i] = nums[i-n];
        }
        
        for(int i = 0;i<m;i++)
        {
        System.out.print(arr[i]+" ");
    }
        //return arr;
    }
}
