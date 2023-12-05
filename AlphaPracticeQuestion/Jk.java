//import java.util.*;

class Jk {
   
    
    public static void main(String[] args) {

        int arr[] = {5,3,8,2,1};
        int n = arr.length;
        int temp;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){

                if( arr[j] > arr[j+1]){ //Swapping using temp variable
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
      }
    }
   

   

   
 

 
    

