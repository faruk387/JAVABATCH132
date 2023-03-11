package day29exceptionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
     1)Maps have key-value structure
     2)Keys are unique, values can be repeated
     3)Map elements are called as "Entry"
     4)All Map elements are called "Entry Set"
     5)Maps are in 3 types
     i)HashMap
     *HashMaps put the entries in random order, this makes HashMaps so fast.
     *HashMaps accept just one"null" value in key part
     *HashMaps accept multiple "null" values in value part
     ii)HashTable
     iii)TreeMap
     6)If you use same key repeatedly in a Map,final value will be accepted in the Map.
       put() method with the same key and different value updates the value of the key.
       I mean put() method can be used to update the values but this is not recommended, because Java has a method to update values.
       put() method with the same key and different value "overwrites" the value.
 */
public class HashMap01 {
    public static void main(String[] args) {
        HashMap<String, Integer> cp = new HashMap<>();
        System.out.println(cp);//{}
        cp.put("USA", 400000000);
        System.out.println(cp);//{USA=400000000}
        cp.put("Germany", 83000000);
        System.out.println(cp);//{USA=400000000, Germany=83000000}
        cp.put("Albania", 30000000);
        System.out.println(cp);//{USA=400000000, Germany=83000000, Albania=30000000}
        cp.put(null, 45000000);
        System.out.println(cp);//{null=45000000, USA=400000000, Germany=83000000, Albania=30000000}
        cp.put("Democratic Kongo", null);
        cp.put("Nicaragua", null);
        cp.put("Albania", 3500000);
        System.out.println(cp);//{null=45000000, USA=400000000, Democratic Kongo=null, Nicaragua=null, Germany=83000000, Albania=35000000}
        //How to get just the keys
        //Example 1: Type code to find number of characters used in the keys.
        Set<String> keys = cp.keySet();
        System.out.println(keys);//[null, USA, Democratic Kongo, Nicaragua, Germany, Albania]
        int sum = 0;

        for (String w : keys) {
            if (w != null)
                sum += w.length();
        }
        System.out.println(sum);
        //Example 2: Type code to find the total population of the countries in the Map
        Collection<Integer> values = cp.values();
        int sum1 = 0;
        for (Integer w : values) {
            if (w != null) {
                sum1 += w;
            }

        }
        System.out.println(sum1);
        //How to get the value of a specific key
        //Type code to find the population of the USA.
        Integer populationOfUsa=cp.get("USA");//get() method returns the value as a specific key
        System.out.println(populationOfUsa);
        //How to update values in a Map
        cp.replace("USA",410000000);
        System.out.println(cp);
        cp.replace("USA",410000000,390000000);
        System.out.println(cp);
        int numOfEntries=cp.size();//size() method returns num of entries
        System.out.println(numOfEntries);
        int r1=cp.getOrDefault("USA",0);
        System.out.println(r1);
        cp.putIfAbsent("USA",500000000);//putIfAbsent() puts the entry into the map if the key is absent
        System.out.println(cp);
        cp.putIfAbsent("Belgium",500000000);
        System.out.println(cp);
        boolean r2=cp.containsKey("USA");
        System.out.println(r2);
        boolean r3=cp.containsValue(3500000);
        System.out.println(r3);
        Set<Map.Entry<String,Integer>> allEntries=cp.entrySet();//entrySet() method returns all entries in a Set whose elements are in Set<Map.Entry<K,V>> data type.
        System.out.println(allEntries);
        for(Map.Entry<String,Integer> w:allEntries){
            System.out.println(w.getKey()+" - "+w.getValue());
            System.out.println(w);

        }

    }
}
