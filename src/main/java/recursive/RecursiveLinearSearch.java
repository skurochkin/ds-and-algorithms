package recursive;

/**
 * Created by VKurochkin on 3/7/2017.
 */
public class RecursiveLinearSearch {

    public static void main(String[] args) {
        int[] listOfInt = {1,3,5,6,7,8,9};
        System.out.println("Completed call: " + linearSearchRecursion(listOfInt, 0, 8));
    }
    public static int linearSearchRecursion(int[] a, int i, int x){
        if(i > a.length -1){
            return -1;
        } else if(a[i] == x){
            return i;
        }else {
            System.out.println("index at: " + i);
            return linearSearchRecursion(a, i+1, x);
        }
    }
}
