package linearSearch;

/**
 * Created by VKurochkin on 3/7/2017.
 */
public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(linearSearchInt(new int[]{1, 2, 4, 6, 7, 8, 9, 10}, 6));
        System.out.println(linearSearchStr(new String[]{"hello","how", "time", "money", "family", "fun" }, "fun"));
    }

    public static int linearSearchInt(int[] a, int x){
        for(int i = 0; i < a.length; i++ ){
           if(a[i] == x){
               return i;
           }
        }
        return -1;
    }

    public static int linearSearchStr(String[] stA, String stX){
    for(int i = 0; i < stA.length; i++){
        if(stA[i].contentEquals(stX)){
            return i;
            }
        }
        return -1;
    }
}

