package com.xworkz.map.runner;

import com.xworkz.map.dto.MapDTO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {

        Map<String, Long> personMap = new HashMap<>();
        personMap.put("Om",1234567890L);
        personMap.put("Bob", 2345678901L);
        personMap.put("Soma", 3456789012L);
        personMap.put("Abhi", 4567890123L);
        personMap.put("Bhusha", 5678901234L);
        personMap.put("Deekshith", 6789012345L);
        personMap.put("Ajay", 7890123456L);
        personMap.put("Rocky", 8901234567L);
        personMap.put("Nikhil", 9012345678L);
        personMap.put("Mallesh", 9123456789L);

        //clear
        personMap.clear();
        System.out.println("clear: " + personMap);

        System.out.println("========================================");


        personMap.put("Om", 1234567890L);
        personMap.put("Bob", 2345678901L);
        personMap.put("Soma", 3456789012L);
        // compute
        personMap.compute("Soma", (key,val) ->val+ 001);
        personMap.compute("Om", (key, val) -> val + 001);
        System.out.println("compute: " + personMap);


        System.out.println("========================================");

        //containsKey
        boolean contains = personMap.containsKey("Om");
        System.out.println("Contains: " + contains);

        System.out.println("========================================");

        //containsValue
        boolean containsMobileNo = personMap.containsValue(3456789012L);
        System.out.println("Contains mobile number: " + containsMobileNo);

        System.out.println("========================================");

        //entrySet
        for (Map.Entry<String, Long> entry : personMap.entrySet()) {
            System.out.println("Entry set: " + entry.getKey() + " - " + entry.getValue());
        }

        //equals
        Map<String, Long> anotherMap = new HashMap<>();
        anotherMap.put("Om", 1234567890L);
        anotherMap.put("Bob", 2345678901L);
        anotherMap.put("Soma", 3456789012L);
        boolean mapsEqual = personMap.equals(anotherMap);
        System.out.println("Maps are equal: " + mapsEqual);

        System.out.println("========================================");

        //forEach
        personMap.forEach((key, value) -> System.out.println(  key + " : " + value));

        System.out.println("========================================");

        //get
        Long mobile = personMap.get(1234567890L);
        System.out.println("mobile: " +mobile);

        System.out.println("========================================");

        //getOrDefault
        Long Mobile = personMap.getOrDefault("Daniel", 8596587659L);
        System.out.println("get or default): " + Mobile);

        System.out.println("========================================");

        //hashCode
        int hashCode = personMap.hashCode();
        System.out.println("HashCode: " + hashCode);

        System.out.println("========================================");

        //isEmpty
        boolean isEmpty = personMap.isEmpty();
        System.out.println("Is map empty: " + isEmpty);

        System.out.println("========================================");


        //keySet
        Collection<String> set =personMap.keySet();
        System.out.println("Key set: " + personMap.keySet());

        System.out.println("========================================");

        //put
        personMap.put("Rocky", 8901234567L);
        System.out.println("put: " + personMap);

        System.out.println("========================================");


        //putAll
        Map<String, Long> additionalMap = new HashMap<>();
        additionalMap.put("Nikhil", 9012345678L);
        additionalMap.put("Mallesh", 9123456789L);
        personMap.putAll(additionalMap);
        System.out.println("putAll: " + personMap);

        System.out.println("========================================");


        //remove(param)
        personMap.remove("Om");
        System.out.println("remove (key): " + personMap);

        System.out.println("========================================");

        //remove(param1, param2)
        personMap.remove("Nikhil",9012345678L);
        System.out.println("remove (key, value): " + personMap);

        System.out.println("========================================");

        //replace(param1, param2)
        personMap.replace("Soma", 3456789019L);
        System.out.println("replace (key, value): " + personMap);

        System.out.println("========================================");

        //replace(param1, param2, param3)
        personMap.replace("Soma", 3456789019L, 3456789014L);
        System.out.println("replace (key, oldValue, newValue): " + personMap);

        System.out.println("========================================");

        //replaceAll
        personMap.replaceAll((k, v) -> v +13455814490L );
        System.out.println("replaceAll: " + personMap);

        System.out.println("========================================");

        //size
        int size = personMap.size();
        System.out.println("Size of the map: " + size);

        System.out.println("========================================");

        //values
        personMap.values();
        System.out.println("Values in the map: " + personMap.values());
    }

}
