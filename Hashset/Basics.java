import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        // creating ..

        HashSet<Integer>set=new HashSet<>();

        // same as arraylist ..
        // Arraylist<Integer>list=new Arraylist<>();

        // insert ..
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // set store only 1 copy of 2 not duplicate ..

        // same as arraylist .. list.add();

        // size ..

        System.out.println("Size is : " + set.size()); // same as arraylist ..
        // here we add 4 elements but print 3 beacuse 2 is duplicate ..

        // print all elements ..

        System.out.println(set); //[1,2,3] doesnt contain duplicate 2..

        // search ..-- contains..

        if(set.contains(1)){
            System.out.println("set contain 1");

        }
        if(!set.contains(6)){
            System.out.println("deosnt contain 6");
        }

        // delete ..
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we delete 1 ");
        }





    }
}
