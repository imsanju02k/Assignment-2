import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //integer sort
        // int arr[]={38,52,9,18,6,62,13};

        //string sort

        String arr[]={"java","c++","python","go","javascript"};
        int min;

        //int temp=0;//integer

        String temp="";
        int n=arr.length;
        System.out.println("Before sorting : " );
        System.out.println(Arrays.toString(arr));

        System.out.println("After sorting : ");

        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                //integer sort
                //if(arr[j]<arr[min])

                //string sort
                if (arr[j].compareTo(arr[min])<0)
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;


            System.out.print(arr[i] + " ");
        }
    }
}
