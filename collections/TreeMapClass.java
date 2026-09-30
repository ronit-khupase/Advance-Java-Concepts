package collections;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapClass {
    public void solutions() {

        System.out.println("1. Store students sorted by roll number.");
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(1,"Ronit");
        students.put(4,"Kartik");
        students.put(3,"Shubham");
        students.put(2,"Abhi");
        System.out.println("Students : "+students);

        System.out.println("2. Store products sorted by price.");
        TreeMap<Double, String> products = new TreeMap<>();
        products.put(999.99, "Keyboard");
        products.put(49999.99, "Laptop");
        products.put(599.99, "Mouse");

        for (Map.Entry<Double, String> entry : products.entrySet()){
            System.out.println(entry.getValue()+" : " + entry.getKey());
        }

        System.out.println("3. Find the highest and lowest key.");
        int high = students.lastKey();
        int low = students.firstKey();
        System.out.println("Highest Key : "+high+"\nLowest Key : "+low);

        System.out.println("4. Find keys within a range.");
        NavigableMap<Integer, String> range =
                students.subMap(1, false, 4, true);
        System.out.println(range);


        System.out.println("5. Print the map in descending order.");
        System.out.println("Descending Order: "+ students.descendingMap());

        System.out.println("6. Create a grade management system.");

        TreeMap<String, Character> grades = new TreeMap<>();

        grades.put("Ronit", 'A');
        grades.put("Shubham", 'B');
        grades.put("Amit", 'A');
        grades.put("Priya", 'C');

        for (Map.Entry<String, Character> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("7. Create a rank list using marks.");
        TreeMap<Integer, String> rankList = new TreeMap<>(Collections.reverseOrder());

        rankList.put(95, "Amit");
        rankList.put(92, "Ronit");
        rankList.put(88, "Shubham");
        rankList.put(85, "Priya");

        int rank = 1;

        for (Map.Entry<Integer, String> entry : rankList.entrySet()) {
            System.out.println("Rank " + rank + " : "
                    + entry.getValue()
                    + " -> "
                    + entry.getKey());
            rank++;
        }

        System.out.println("8. Word frequency sorted alphabetically.");
        String s = "Hello this is the String! Hello there how are you?";
        String[] words = s.toLowerCase().split("\\s+");
        TreeMap<String, Integer> freq = new TreeMap<>();
        for(String word : words ){
            freq.put(word, freq.getOrDefault(word,0)+1);
        }
        System.out.println("Word Frequencies in Sorted Order : "+ freq);

        System.out.println("9. Employee salary report sorted by salary.");

        TreeMap<Double, String> employees = new TreeMap<>();

        employees.put(75000.0, "Ronit");
        employees.put(50000.0, "Amit");
        employees.put(90000.0, "Shubham");
        employees.put(65000.0, "Priya");

        for (Map.Entry<Double, String> entry : employees.entrySet()) {
            System.out.println(entry.getValue() +
                    " -> ₹" +
                    entry.getKey());
        }

        System.out.println("10. Find the nearest key using `floorKey()` and `ceilingKey()`.");
        int key = 2;
        int floor = students.floorKey(key);
        int ceiling = students.ceilingKey(key);
        System.out.println("Floor Key : "+floor+"\nCeiling Key : "+ceiling);
    }
}
