public class FindingDuplicate {
    public static void main(String[] args) {
        boolean flag = false;
        int arr[] = {100, 20, 70, 30, 10, 60, 10};
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate " + arr[i] + " found at the index " +i);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicates not found");
        }
    }
}
