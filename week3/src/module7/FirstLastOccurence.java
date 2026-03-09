package module7;
public class FirstLastOccurence {
    public static int first(int[] arr,int target){
        int left=0,right=arr.length-1,res=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                res=mid;
                right=mid-1;
            }
            else if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return res;
    }

    public static int last(int[] arr,int target){
        int left=0,right=arr.length-1,res=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==target){
                res=mid;
                left=mid+1;
            }
            else if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return res;
    }
}
   
