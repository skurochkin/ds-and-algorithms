package recursive;

/**
 * Created by VKurochkin on 3/7/2017.
 */
public class RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] listOfInt = {1,3,5,6,7,8,9};
        System.out.println("Completed call: " + binarySearchRecursive(listOfInt,0,6,7));
    }

    public static int binarySearchRecursive(int[] a, int p, int r, int x){
        if(p > r){
            return -1;
        }else {
            int q = (p+r)/2;
            if(a[q] == x){
                return q;
            }else if(a[q] > x){
                return binarySearchRecursive(a, p,q-1,x);
            }else{
                return binarySearchRecursive(a,q+1,r, x);
            }
        }
    }
}
