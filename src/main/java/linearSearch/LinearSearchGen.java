package linearSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VKurochkin on 3/7/2017.
 */
public class LinearSearchGen {


    public static void main(String[] args) {
        Integer[] list =  {1, 2, 4, 6, 7, 8, 9, 10};
        List<Integer> listInt = new ArrayList<Integer>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);
        System.out.println("Linear search array: " + linearA(list, 6));
        System.out.println("Linear search list: " + linearL(listInt, 6));
    }

    public static <E extends Comparable<E>> int linearA(E[] genA, E X) {
        for (int i = 0; i < genA.length; i++) {
            if (genA[i].equals(X)) {
                return i;
            }
        }
        return -1;
    }

    public static <E extends Comparable<E>> int linearL(List<E> genE, E X) {
        for (int i = 0; i < genE.size(); i++) {
            if (genE.get(i).equals(X)) {
                return i;
            }
        }
        return -1;
    }
}

