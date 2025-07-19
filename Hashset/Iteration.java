
import java.util.HashSet;
import java.util.Iterator;
public class Iteration {
    public static void main(String[] args) {

        HashSet<Integer>set=new HashSet<>();

        //add

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
       
        // iterator ..

        Iterator it = set.iterator();

        // hashnext , next ..
        // doesnt no gaurantee same order ..
         
        while (it.hasNext()) {
              System.out.println(it.next());
            
        }






    }
}
