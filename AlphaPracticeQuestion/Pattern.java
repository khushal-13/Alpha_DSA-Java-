public class Pattern {

    public static void p(int totrows, int totcols)
    {
        System.out.println(totrows +" "+ totcols);
       for(int i=1;i<=totrows;i++)
       {
        for(int j=1;j<=totcols;j++)
        {
           if(i==1 || i==totrows || j==1 || j==totcols)
           {
            System.out.print("*");
           }
           else
           {
            System.out.print(" ");
           } 
        }
        System.out.println();
       }
    }

    public static void Inverted_Half_Pyramid(int n)
    {
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=n-i;j++)
          {
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
            System.out.print("*");
          }
 System.out.println();
       }
    } 

    public static void Inverted_Number(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Floyds_Triangle(int n ) {
      int num=1;
      for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        //int num=1;
         System.out.print(num+" ");
         num++;
      }
      System.out.println();
    }
      
    }

    public static void zero_to_one(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if((i+j)%2==0)
          System.out.print("1 ");
          else
          if((i+j)%2!=0)
          System.out.print("0 ");
        }
        System.out.println();
      }
    }


    public static void butterfly(int n)
    {
       for(int i=1;i<=n;i++)
       {
        for(int j=1;j<=i;j++)
        {
          System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print("*");
        }
        System.out.println();
       }

       for(int i=n;i>=1;i--)
       {
        for(int j=1;j<=i;j++)
        {
          System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          System.out.print("*");
        }
        System.out.println();
       }

    }

    public static void rhombus(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=n;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }


    public static void Hollow_rhombus(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=n;j++)
        {
          if(i==1 || i==n || j==1 || j==5)
          {
            System.out.print("*");
          }
          else
          {
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }

    public static void diamond(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }

      for(int i=n;i>=1;i--)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }


   
    public static void main(String[] args) {
       
      // p(4,5);
      // Inverted_Half_Pyramid(8);
      //Inverted_Number(10);
     // Floyds_Triangle(5);
     //zero_to_one(5);
     //butterfly(5);
     //rhombus(10);
    // Hollow_rhombus(5);
    diamond(7);
    }
}
