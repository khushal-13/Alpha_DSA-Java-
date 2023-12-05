class Solution {
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
       int start=0;
       int end = arr.length-1;
       
       while(start <= end){
           int mid = (start+end)/2;
           if(arr[mid] == n){
              if(arr[mid-1]<arr[mid]){
                return 1;
              }
            }
           else if(arr[mid] < n){
               start=mid+1;
           }
           else
           {
               end = mid-1;
           }
       }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {-1,0,3};
        int n = 0;
        System.out.println(peakElement(arr, n));
    }

}