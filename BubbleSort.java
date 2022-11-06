import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={7,5,2,3,1,4,6};


        System.out.println("Bubble sort elements before sorting ");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("Bubble sort elements After sorting ");
        for(int element:arr){
            System.out.print(element + " ");
        }
    }

}
