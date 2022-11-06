import java.util.HashSet;

public class SubArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b={3,4,1};
        System.out.println(isSubArray(a,b)? " Present ": " Not Present ");

    }
    static boolean isSubArray(int []a, int b[]){
        HashSet<Integer>hashSet=new HashSet<>();
        for (int i=0;i<a.length;i++){
            if(!hashSet.contains(a[i]))
                hashSet.add(a[i]);
        }
        for (int i=0;i<b.length;i++){
            if (!hashSet.add(b[i]))
                return true;
        }
        return false;

    }


}
