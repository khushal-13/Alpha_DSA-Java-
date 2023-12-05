public class Practice{

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(" ");
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] =  new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;k++;
        }

        while(j<=ei){
            temp[k]=arr[j];
            j++;k++;
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
      
    }

    public static void changeArray(int arr[], int i, int val){
        if(i==arr.length){
            return;
        }

        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Subsets(String str,int idx,String ans){
        if(idx==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
                return;
            }
            System.out.println(ans); 
            return;
        }

        Subsets(str, idx+1,ans+str.charAt(idx)); //Yes
        Subsets(str, idx+1, ans);  //No

    }

    public static void Permutation(String s, String ans){

        if(s.length()==0){
            //System.out.println(ans);
            return ;
        }

        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i+1);
            Permutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        //int arr[] = {6,3,9,8,2};
        // print(arr);
        // mergesort(arr,0,arr.length-1);
        // print(arr);   

        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // print(arr);

        //Subsets("abc", 0, "");

        String a = "abc";
        Permutation(a,"");

    } 
}