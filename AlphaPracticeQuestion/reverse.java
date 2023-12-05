import java.util.Scanner;

public class reverse {
    static Scanner sc = new Scanner(System.in);

    public static void pairs(int a[]) {
        
        for(int i=0;i<a.length;i++)
        {
            int curr=a[i];
            for(int j=i+1;j<a.length;j++)
            {
               System.out.print("("+curr+","+a[j]+")");
            }
            System.out.println();
        }
    }

   public static  void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i] + " ");
        }
    }

    public static void reverseArray(int a[]) {
        int temp,start=0,end=a.length-1;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
           
            start++;
            end--;
        }

    }

    public static void printSubarray(int a[])
    {
        int start,end;
       
        for(int i=0;i<a.length;i++)
        {   start=i;
            for(int j=i;j<a.length;j++)
            { end=j;
               for(int k=start;k<=end;k++)
               {
                System.out.print(a[k]+" ");
               }
               System.out.println();
            }
            System.out.println();
           
        }
    }

    public static void main(String[] args) {
        
        System.out.print("Enter size of array :  ");
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

       //reverseArray(a);
       //display(a);
       //pairs(a);
      // printSubarray(a);
    
    }
}
