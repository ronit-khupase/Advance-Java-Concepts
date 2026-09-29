package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapClass {
    public void solutions() {
        String s = "Hello there this is the string!";
        {
            System.out.println("1. Count frequency of each character.");
            HashMap<Character, Integer> map = new HashMap<>();

            char[] ch = s.toLowerCase().toCharArray();
            for (char c : ch) {
                if (map.containsKey(c)) {
                    int freq = map.get(c) + 1;
                    map.put(c, freq);
                } else if(c != ' '){
                    map.put(c, 1);
                }
            }
            System.out.println("Frequency of each character is : " + map);
        }
        {
            System.out.println("2. Count frequency of each word.");
            HashMap<String, Integer> map = new HashMap<>();
            String[] words = s.split("\\s+");
            for (String word : words) {
                if (map.containsKey(word.toLowerCase())) {
                    int freq = map.get(word) + 1;
                    map.put(word.toLowerCase(), freq);
                }else {
                    map.put(word,1);
                }
            }
            System.out.println("Frequency of Each Word is : "+ map);
        }
        {
            System.out.println("3. Find first non-repeating character.");
            HashMap<Character, Integer> map = new HashMap<>();
            char[] ch = s.toLowerCase().toCharArray();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            boolean found = false;
            for(char c : ch){
                if(map.get(c) == 1){
                    found = true;
                    System.out.println("First Non Repeating Character is : "+ c);
                    break;
                }
            }
            if(!found) System.out.println("No Non Repeating Character.");
        }

        {
            System.out.println("4. Find first repeating character.");
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : s.toLowerCase().toCharArray()){
                if(map.containsKey(c)){
                    System.out.println("First Repeating Character is : "+ c);
                    break;
                }else {
                    map.put(c,1);
                }
            }
        }

        {
            System.out.println("5. Group students by department.");
            ArrayList<Students> students = new ArrayList<>();
            students.add(new Students("Ronit", "MCA"));
            students.add(new Students("Shubham", "MCA"));
            students.add(new Students("Kartik", "MSC"));
            students.add(new Students("Sarthak", "MSC"));
            students.add(new Students("Manisha", "MCA"));

            HashMap<String, List<String>> map = new HashMap<>();

            for(Students student : students){
                map.putIfAbsent(student.dept.toLowerCase(), new ArrayList<>());
                map.get(student.dept.toLowerCase()).add(student.name);
            }

            System.out.println("Department wise Students : "+map);
        }

        {
            System.out.println("6. Create a phonebook application.");
            ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
            phoneBooks.add(new PhoneBook("Ronit","7410859630"));
            phoneBooks.add(new PhoneBook("Shubham","1472583690"));
            phoneBooks.add(new PhoneBook("Kartik","7894561230"));
            phoneBooks.add(new PhoneBook("Abhishek","032654987"));
            phoneBooks.add(new PhoneBook("Ronit","7539511462"));

            HashMap<String, ArrayList<String>> map = new HashMap<>();

            for(PhoneBook phoneBook : phoneBooks){
                map.putIfAbsent(phoneBook.name.toLowerCase(),new ArrayList<>());
                map.get(phoneBook.name.toLowerCase()).add(phoneBook.phoneNumber);
            }
            System.out.println("PhoneBook : "+ map);
        }

        {
            System.out.println("7. Find the highest frequency element.");

            HashMap<Character, Integer> map = new HashMap<>();

            for(char ch : s.toLowerCase().toCharArray()){
                if(ch != ' ')
                    map.put(ch , map.getOrDefault(ch,0)+1);
            }

            int maxFreq = 0;
            char c = '\0';
            for(char ch : s.toLowerCase().toCharArray()){
                if(ch != ' ')
                    if(map.get(ch) > maxFreq){
                        maxFreq = map.get(ch);
                        c = ch;
                }
            }
            System.out.println("Max Frequency Char is : "+c+" with frequency : "+maxFreq);

        }

        {
            System.out.println("8. Count occurrences of array elements.");
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[]{10,10,20,30,40,50,50,60};
            for(int i : arr){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
            System.out.println("Array Element Frequencies : "+ map);
        }

        {
            System.out.println("9. Check if two strings are anagrams.");
            String s1 = "race";
            String s2 = "cear";
            HashMap<Character, Integer> map = new HashMap<>();
            for(char ch : s1.toLowerCase().toCharArray()){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            for(char ch : s2.toLowerCase().toCharArray()){
                map.put(ch, map.getOrDefault(ch,0)-1);
            }

            boolean anagram = true;

            for(int i : map.values()){
                if(i != 0){
                    anagram = false;
                    break;
                }
            }
            System.out.println(anagram ? "Anagram" : "Not Anagram");
        }
        {
            System.out.println("10. Create Employee ID → Employee mapping.");
            HashMap<Integer, Employee> employees = new HashMap<>();

            employees.put(101, new Employee(101, "Ronit"));
            employees.put(102, new Employee(102, "Amit"));
            employees.put(103, new Employee(103, "Priya"));

            System.out.println(employees);
        }
    }
}

class Students{
    String name;
    String dept;

    Students(String name, String dept){
        this.name = name;
        this.dept = dept;
    }
}

class PhoneBook{
    String name;
    String phoneNumber;

    PhoneBook(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return " Employee Name : "+name;
    }
}