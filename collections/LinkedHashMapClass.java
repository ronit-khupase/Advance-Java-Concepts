package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public void solutions(){

        String s = "Hello there this is the string!";

        System.out.println("1. Count characters while preserving insertion order.");
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = s.toLowerCase().toCharArray();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println("Count of each characters is : " + map);

        System.out.println("2. Find first unique character.");
        boolean found = false;
        for(char c : map.keySet()){
            if(map.get(c) == 1){
                System.out.println("First Unique Character is : "+ c);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Unique Character Not Found!");
        }

        System.out.println("3. Implement an LRU Cache concept.");
        LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
        cache.put(1,10);
        cache.put(2,20);
        cache.put(3,30);
        cache.put(1,40);
        System.out.println("LRU : "+cache);


        System.out.println("4. Store student records while preserving order.");
        LinkedHashMap<Integer, String > students = new LinkedHashMap<>();
        students.put(1,"Ronit");
        students.put(2,"Shubham");
        students.put(3,"Abhi");
        System.out.println("Students : "+ students);

        System.out.println("5. Word frequency with ordered output.");
        LinkedHashMap<String, Integer> freq = new LinkedHashMap<>();
        String[] str = s.toLowerCase().split("\\s+");
        for(String word : str){
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println(" Word Frequency : " + freq);

        System.out.println("6. Browser history simulation.");
        LinkedHashMap<String , Integer> history = new LinkedHashMap<>();
        history.put("google.com", history.getOrDefault("google.com",0)+1);
        history.put("youtube.com", history.getOrDefault("youtube.com",0)+1);
        history.put("java.com", history.getOrDefault("java.com",0)+1);
        history.put("google.com", history.getOrDefault("google.com",0)+1);
        System.out.println("History : "+ history);


        System.out.println("7. Preserve insertion order in frequency count.");
        LinkedHashMap<Integer, Integer> f = new LinkedHashMap<>();
        int[] arr = {4, 2, 4, 1, 2, 4};
        for (int num : arr) {
            f.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency Count : "+ f);

        System.out.println("8. Create an ordered inventory system.");
        LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();

        inventory.put("Laptop", 10);
        inventory.put("Mouse", 25);
        inventory.put("Keyboard", 15);

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(" 9. Remove the eldest entry manually.");
        if(!map.isEmpty()){
            Character eldestKey = map.keySet().iterator().next();
            map.remove(eldestKey);
        }
        System.out.println("After Removing Eldest Element : " + map);

        System.out.println("10. Compare HashMap and LinkedHashMap ordering.");
        System.out.println("HashMap : Random Order \nLinkedHashMap : Insertion Order");

    }
}
