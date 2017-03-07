package binarySearch;

/**
 * Created by VKurochkin on 3/7/2017.
 */
public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Binary search of int: " + binarySearchInt(new int[]{1,3,5,7,9,11,13,15,17}, 15));
        System.out.println("Binary search of string: " + binarySearchStr(new String[]{"amazon", "fun", "job", "quest"}, "quest"));
    }

    public static int binarySearchInt(int[] a, int x){
        int p = 0;
        int r = a.length-1;
        while(p <= r) {
            int q = (p + r) / 2;
            if (x < a[q]) {
                r = q-1;
            }else if(x > a[q]){
                p = q+1;
            }else{
                return q;
            }
        }
        return -1;
    }

    public static int binarySearchStr(String[] stA, String st){
        int p = 0;
        int r = stA.length-1;
        while(p <= r){
            int q = (p + r)/2;
            if(st.compareTo(stA[q]) < 0){
                r= q-1;
            }else if(st.compareTo(stA[q]) > 0){
                p = q+1;
            }else{
                return q;
            }
        }
        return -1;
    }
}
