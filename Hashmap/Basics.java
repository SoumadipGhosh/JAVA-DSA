import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        // country(key),population ..
        HashMap<String,Integer>map=new HashMap<>();
        // country - String , population - Integer ..

        // insertion //

        map.put("India", 120);
        map.put("US", 29);
        map.put("China", 134);

        System.out.println(map); 

        // map.put("China", 123);

        // System.out.println(map);

        // // Search //
        // // true / false ..

        // if(map.containsKey("India")){
        //     System.out.println("Key is present in the map"); 
        // }else{
        //     System.out.println("key is not present in the map");
        // }

        // System.out.println(map.get("China")); // print china val ..
        // System.out.println(map.get("Indonesia")); // doesnt exist so give null..


        // new loop ..

        // int[]arr={12,23,45};
        // for(int val:arr){
        //     System.out.println(val + " ");
        // }
        // System.out.println();

        // Iteration //

        // for(Map.Entry<String,Integer> e :Map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());

        // }

        map.remove("China");
        System.out.println(map);



    }
}
