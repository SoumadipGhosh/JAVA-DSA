import java.util.Arrays;
import java.util.Scanner;
public class Multidimensional {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        // int[][]arr={
        //     {1,2,3},// 0th index of arr.
        //     {4,5,6},// 1th index of arr.
        //     {7,8,9} // 2nd index of arr
        // };
        int[][]arr=new int[3][3]; // row ,col..
        // System.out.println(arr.length);

        // input ..

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
                
            }
            
        } // here  col < arr[row].length beacuse col size may not be same ..then it depends only arr[row] size ..

        // output ..

        for (int row = 0; row < arr.length; row++) {
            // for (int col = 0; col < arr[row].length; col++) {
            //     System.out.print(arr[row][col] +" ");
                System.out.println(Arrays.toString(arr[row]));
            // }
            // System.out.println();
            
        }



        

    }
}
