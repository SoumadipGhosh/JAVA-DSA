
import java.util.ArrayList;
import java.util.Collections;




public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        // ArrayList<String> list1=new ArrayList<String>();
        // ArrayList<Boolean> list2=new ArrayList<Boolean>();

        // add..
        list.add(0);
        list.add(2);
        list.add(1);

        // System.out.println(list);

        //get..
        // int element=list.get(1);
        // System.out.println(element);

        // add element in between ..
        // list.add(1,4); // index 1 add 4..
        // System.out.println(list);

        // change ..
        // list.set(1, 5);
        // System.out.println(list);

        //delete..
        // list.remove(2);
        // System.out.println(list);

        //size..
        // int size=list.size();
        // System.out.println(size);

        // loops ..
        // for (int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        //     System.out.println();

        // }

        //sorting ..
        Collections.sort(list); // for arraylist..
        System.out.println(list);



    }
}

