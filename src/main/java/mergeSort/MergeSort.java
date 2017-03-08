package mergeSort;

/**
 * Created by VKurochkin on 3/8/2017.
 */
public class MergeSort {

    private static int tempArray[]; // an array used for merging
    // To use the mergeInPlace() method, you'll need to initialize tempArray as
    // shown on the next line inside of the wrapper sort() method
    // tempArray = new int[inputArray.length];

    public static void main(String[] args) {
        int[] inputArray = {9,7,3,1,6,3,2,6,8,9,2,3,0};
        sort(inputArray);

        for(int i= 0; i < inputArray.length; i++){
            System.out.println(inputArray[i]);
        }
    }

    public static void sort(int inputArray[]){
          sort(inputArray, 0, inputArray.length-1);
    }

    public static void sort(int inputArray[], int start, int end){
         if(end <= start){
             return; // we are done traversing the array
         }

        int mid= (start + end)/2;
        sort(inputArray, start, mid);
        sort(inputArray, mid+1, end);
        merge(inputArray, start, mid, end);
    }

    public static void merge(int inputArray[], int start, int mid, int end){
        int tempArray[] = new int[end - start + 1];

        // index counter of the left side of the array
        int leftSlot = start;
        // index counter of the right side of the array
        int rightSlot = mid+1;
        int k = 0;

        while(leftSlot <= mid && rightSlot <= end){
            if(inputArray[leftSlot] < inputArray[rightSlot]){
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
            }else{
               tempArray[k] = inputArray[rightSlot];
                rightSlot = rightSlot +1;
            }
            k = k+1;
        }
        /**
         * When it get's to  here, that means the above loop has completed.
         * So both the right and the left side of the sub-array can be considered sorted
         */

        if(leftSlot <= mid){ // consider the right side done being sorted. Left must be sorted already
            while (leftSlot <= mid){
                tempArray[k] = inputArray[leftSlot];
                leftSlot = leftSlot + 1;
                k = k +1;
            }
        }else if(rightSlot <= end){
           while(rightSlot <=end){
            tempArray[k] = inputArray[rightSlot];
            rightSlot = rightSlot+1;
            k = k+1;
        }
    }

    // copy over temp array into the appropriate slots of the inputArray
    for(int i = 0; i < tempArray.length; i++){
        inputArray[start+i] = tempArray[i];
    }
    }
}
