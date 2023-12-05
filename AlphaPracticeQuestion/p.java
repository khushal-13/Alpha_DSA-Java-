public class p {

    public static void shuffle(int[] nums, int n) {
        int b[] = new int[2*n];
        int len = 2*n; 
        int x=0,y=n;
        int a=0;
 
      while(a<len){
           b[a++] = nums[x++];
           b[a++] = nums[y++];
       }
    } 
 
  
	static int removeDuplicates(int arr[], int n)
	{
		if (n == 0 || n == 1)
			return n;
	
		// To store index of next unique element
		int j = 0;
	
		// Doing same as done in Method 1
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n-1; i++)
			if (arr[i] != arr[i+1]){
          
				arr[j++] = arr[i];
            
	   
    }
   
		arr[j++] = arr[n-1];
		return j;
	}
	
	public static void main (String[] args)
	{
		int arr[] = {1, 2,3,3,4,4};// 3, 4, 4, 4, 5, 5};
		//int n = arr.length;
		
		//n = removeDuplicates(arr, n);

        int k = arr.length;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                int temp = arr[i+1];
                for(int j=i+1;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                    k --; 
                }
            }
        }
        //System.out.println(k);

		// Print updated array
		//for (int i=0; i<n; i++)
		//System.out.print(arr[i]+" ");


        int a[] = {2,5,1,3,4,7};
        shuffle(a, 3);

        for (int i=0; i<a.length; i++)
		System.out.print(a[i]+" ");
    }
}     


   






