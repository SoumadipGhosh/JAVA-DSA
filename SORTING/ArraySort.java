import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int[]arr={1,2,3,7,5};

        // sort by collection framework..
        Arrays.sort(arr);

        for (int i= 0; i< arr.length;i++) {
            System.out.println(arr[i]);
            
        }
    }
}
