package binarySearch;

/**
 * Created by VKurochkin on 3/7/2017.
 */
public class BinarySearchGen {


    public static void main(String[] args) {
        Integer[] arrayOfInt =  {1, 2, 4, 6, 7, 8, 9, 10};
        String[]  arrayOfStr = {"amazon", "fun", "job", "quest"};

        // Generic binary search in array
        System.out.println(binarySearchA(arrayOfInt, 9));
        System.out.println(binarySearchA(arrayOfStr, "quest"));
    }

    public static <E extends Comparable<E>> int binarySearchA(E[] genA, E X) {
        int p = 0;
        int r = genA.length-1;
        while(p <= r){
            int q = (p + r)/2;
            if(X.compareTo(genA[q]) < 0){
                r= q-1;
            }else if(X.compareTo(genA[q]) > 0){
                p = q+1;
            }else{
                return q;
            }
        }
        return -1;
    }
}
