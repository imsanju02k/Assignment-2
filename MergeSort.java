import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        System.out.println("Before sorting ");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        sort(arr,0,n-1);
        System.out.println("After sorting ");

        for (int i=0;i<n;i++){

            System.out.print(arr[i]+ " ");
        }
        System.out.println();


    }
    public static void sort(int nums[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        sort(nums,start,mid);
        sort(nums,mid+1,end);

        mergeAll(nums,start,mid,end);

    }

    private static void mergeAll(int[] nums,int start,int mid, int end) {
        int merged[]=new int[end-start+1];
        int index1=start;
        int index2=mid+1;
        int x=0;

        while (index1<=mid && index2<=end){
            if(nums[index1]<=nums[index2]){
                merged[x++]=nums[index1++];
            }
            else {
                merged[x++]=nums[index2++];
            }
        }
        while (index1<=mid){
            merged[x++]=nums[index1++];
        }
        while (index2<=end){
            merged[x++]=nums[index2++];
        }
        for(int i=0,j=start;i<merged.length;i++,j++){
            nums[j]=merged[i];
        }
    }
}
