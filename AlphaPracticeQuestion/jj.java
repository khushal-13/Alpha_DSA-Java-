public class jj{

    public static String removeDuplicate(String s, char arr[],int idx,StringBuilder sb){
        if(idx==s.length()){
            return sb.toString();
        }

        char currChar = s.charAt(idx);

        if(arr[(currChar-'a')]>=1){
            removeDuplicate(s, arr, idx+1, sb); 
            return sb.toString();  
        }
        else{
            sb.append(s.charAt(idx));
            arr[currChar-'a']++;
            removeDuplicate(s, arr, idx+1, sb);
            return sb.toString();
        }
    }

    public static int tilling(int n){
        if(n==0 || n==1){
            return 1;
        }
                     //vertical    //Horizontal
        int totWays = tilling(n-1) + tilling(n-2);
        return totWays;
    }

    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }

        int half = optimizedPower(x, n/2);
        int halfSquare = half*half;

        if(n%2!=0){
            halfSquare = x*halfSquare;
        }
        
        return halfSquare;
    }

    public static int xPowerN(int x,int n){
        if(n==0){
            return 1;            
        }
        return xPowerN(x, n-1)*x;
    }

    public static int LastOccurrence(int arr[], int idx, int key){
        if(idx==arr.length){
            return -1;
        }

        int isFound = LastOccurrence(arr, idx+1, key);
        if(isFound == -1 && arr[idx]==key ){
            return idx;
        }
        
        return isFound;
    
    }

    public static int FirstOccurrence(int arr[],int idx,int key){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==key){
            return idx;
        }
        return FirstOccurrence(arr, idx+1, key);
    }

    public static boolean IsSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       
        return IsSorted(arr, i+1);
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib = fibo(n-1) + fibo(n-2);
        return fib;
    }

    static int sum=0;
    public static int sumOfNatural(int n){
        if(n==0){
            return 0;
        }
        sum = n + sumOfNatural(n-1);
        return sum;
    }

    public static void increasingNumber(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        increasingNumber(n-1);
        System.out.print(n+" ");
    }

    public static void decreasingNumbers(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        decreasingNumbers(n-1);
        return;
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
      //System.out.println(fact(4));
      //decreasingNumbers(10);
      //increasingNumber(10);
      //System.out.println(sumOfNatural(10));
      //System.out.println(fibo(10));

      int arr[] = {8,3,6,9,5,10,2,5,3};
      //System.out.println(IsSorted(arr, 0));
      //System.out.println(FirstOccurrence(arr, 0, 5));
      //System.out.println(LastOccurrence(arr, 0, 5));
      //System.out.println(xPowerN(2, 10));
      //System.out.println(optimizedPower(2, 5));
      //System.out.println(tilling(3));


      char arr2[] = new char[26];
      String str = "appnnacollege";
      StringBuilder sb = new StringBuilder("");
      System.out.println(removeDuplicate(str, arr2, 0,sb));
    }
}