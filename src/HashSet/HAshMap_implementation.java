package HashSet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HAshMap_implementation {
    public static void main(String[] args) {
//        Map<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer>map=new HashMap<>();//unorder

        map.put("A",88);
        map.put("B",90);
        map.put("C",0);
        map.put("AB",881);
        map.put("BA",900);
        map.put("C",10);
        map.put(null,0);
        System.out.println(map.containsKey("A"));//return true or false corresponding to key
        System.out.println(map.containsKey("D"));
        System.out.println(map.get("A"));//give value
        System.out.println(map);
        System.out.println("##############################################################################");
        TreeMap<String,Integer>map1=new TreeMap<>();//lexco graphical sorted order
        map1.put("A",88);
        map1.put("B",90);
        map1.put("C",0);
        map1.put("AB",881);
        map1.put("BA",900);
        map1.put("C",10);
//        map1.put(null,0);
        System.out.println(map1.containsKey("A"));//return true or false corresponding to key
        System.out.println(map1.containsKey("D"));
        System.out.println(map1.get("A"));//give value
        System.out.println(map1);
        System.out.println("##############################################################################");
        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();//Jis order mai data h usi order mai rhega //and use doubly linked list
        map2.put("Amit",88);
        map2.put("ankit",90);
        map2.put("aditya",0);
        map2.put("suraj",881);
        map2.put("pankaj",900);
        map2.put("dhiraj",10);
//        map1.put(null,0);
        System.out.println(map2.containsKey("A"));//return true or false corresponding to key
        System.out.println(map2.containsKey("D"));
        System.out.println(map2.get("A"));//give value
        System.out.println(map2);
    }
}
