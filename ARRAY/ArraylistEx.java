
import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEx {
    public static void main(String[] args) {
        // syntax.
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        
        // we can add by list.add()..

        // list.add(67);
        // list.add(89);

        // // System.out.println(list.contains(67)); // cheak if 67 present or not ..
        // // list.set(0, 99);
        // list.remove(1);
        // System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //get ..
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));

        }
        System.out.println(list);

    }
}
