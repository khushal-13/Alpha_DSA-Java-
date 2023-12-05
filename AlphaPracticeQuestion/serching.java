import java.util.Scanner;

public class serching {
    
static Scanner sc = new Scanner(System.in);

    public static void display(int a[],int n)
    {
       for(int i=0;i<n;i++)
       {
        System.out.print(a[i] + " ");
       }
    }

    public static int search(int a[], int n)
    {

        System.out.println("\n Enter data to search ");
        int x= sc.nextInt();
        int i;
       // int flag=0;
        for( i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                return i;
             //   flag=1;
            }
        }
        return -1;

    }

   

    public static void insertion(int a[],int n)
    {
        int temp;
        for(int i=1;i<n;i++)
        {
            
            temp=a[i];
            int j=i=1;
            while(j>=0 && a[j]>temp)
            {
               a[j+1]=a[j];
               j--;
            }
            a[j+1]=temp;
        }
    }

    public static int largest(int a[],int n)
    {
       int largest = Integer.MIN_VALUE ; // -Infinity
       int smallest = Integer.MAX_VALUE ; // +Infinity

       for(int i=0;i<a.length;i++)
       {
        if(largest < a[i])
        {
            largest=a[i];
        }
        if(smallest > a[i])
        {
            smallest=a[i];
            
        }
       }
       System.out.println("\n Smallest number is " + smallest);
       return largest;
    }

    public static int binary_Search(int a[]) {
        
        int start=0,end=a.length-1;
        System.out.println(" \n Enter data ");
          int x=sc.nextInt();

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==x)
            {
                return mid;
            }
            else if(x < a[mid])
            {
                 end=mid-1;
            }
            else if(x>a[mid])
            {
                start=mid+1;
            }
        }


        return-1;
    }

    public static void main(String[] args) {
        
        System.out.print("Enter size of array :  ");
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        display(a,n);
      /*  int c= search(a,n);
       if(c==-1)
       {
        System.out.println("Element not found");
       }
       else
       {
        System.out.println("Element found at index " + (c+1));
       }
      */
    
    //  int l = largest(a, n);
    //System.out.println("Largest number is : " + l);
      
     // System.out.println("Element found at index " + (binary_Search(a)+1));
      // index 0 means element not found

      //reverse(a);

      int start=0,end=a.length-1;
      while(start<end)
      {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
      }
      
      display(a, n);
     
    }
}
