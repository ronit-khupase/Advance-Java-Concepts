package collections;

import core.PracticeModule;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice implements PracticeModule {

    private static final String TEXT =
            "Hello there this is the string!";

    @Override
    public void run() {
        solutions();
    }

    public void solutions() {

        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
    }

    private void q1() {

        System.out.println(
                "Q1. Count characters preserving insertion order."
        );

        LinkedHashMap<Character, Integer> map =
                new LinkedHashMap<>();

        for (char ch : TEXT.toLowerCase().toCharArray()) {

            map.put(ch,
                    map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }

    private void q2() {

        System.out.println(
                "Q2. Find first unique character."
        );

        LinkedHashMap<Character, Integer> map =
                new LinkedHashMap<>();

        for (char ch : TEXT.toLowerCase().toCharArray()) {

            map.put(ch,
                    map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry
                : map.entrySet()) {

            if (entry.getValue() == 1) {

                System.out.println(
                        "First Unique Character : "
                                + entry.getKey());

                return;
            }
        }

        System.out.println(
                "Unique Character Not Found!"
        );
    }

    private void q3() {

        System.out.println(
                "Q3. Implement LRU Cache Concept."
        );

        LinkedHashMap<Integer, Integer> cache =
                new LinkedHashMap<>(16, 0.75f, true);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);

        cache.get(1);
        cache.put(4, 40);

        System.out.println(cache);
    }

    private void q4() {

        System.out.println(
                "Q4. Store student records preserving order."
        );

        LinkedHashMap<Integer, String> students =
                new LinkedHashMap<>();

        students.put(1, "Ronit");
        students.put(2, "Shubham");
        students.put(3, "Abhi");

        System.out.println(students);
    }

    private void q5() {

        System.out.println(
                "Q5. Ordered word frequency."
        );

        LinkedHashMap<String, Integer> map =
                new LinkedHashMap<>();

        String[] words =
                TEXT.toLowerCase().split("\\s+");

        for (String word : words) {

            map.put(word,
                    map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }

    private void q6() {

        System.out.println(
                "Q6. Browser History Simulation."
        );

        LinkedHashMap<String, Integer> history =
                new LinkedHashMap<>();

        history.put(
                "google.com",
                history.getOrDefault("google.com", 0) + 1);

        history.put(
                "youtube.com",
                history.getOrDefault("youtube.com", 0) + 1);

        history.put(
                "java.com",
                history.getOrDefault("java.com", 0) + 1);

        history.put(
                "google.com",
                history.getOrDefault("google.com", 0) + 1);

        System.out.println(history);
    }

    private void q7() {

        System.out.println(
                "Q7. Preserve insertion order in frequency count."
        );

        int[] arr = {4, 2, 4, 1, 2, 4};

        LinkedHashMap<Integer, Integer> map =
                new LinkedHashMap<>();

        for (int num : arr) {

            map.put(num,
                    map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }

    private void q8() {

        System.out.println(
                "Q8. Ordered Inventory System."
        );

        LinkedHashMap<String, Integer> inventory =
                new LinkedHashMap<>();

        inventory.put("Laptop", 10);
        inventory.put("Mouse", 25);
        inventory.put("Keyboard", 15);

        for (Map.Entry<String, Integer> entry
                : inventory.entrySet()) {

            System.out.println(
                    entry.getKey()
                            + " : "
                            + entry.getValue());
        }
    }

    private void q9() {

        System.out.println(
                "Q9. Remove Eldest Entry."
        );

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        if (!map.isEmpty()) {

            Integer eldestKey =
                    map.keySet()
                            .iterator()
                            .next();

            map.remove(eldestKey);
        }

        System.out.println(map);
    }

    private void q10() {

        System.out.println(
                "Q10. HashMap vs LinkedHashMap"
        );

        System.out.println(
                "HashMap      -> No ordering guarantee"
        );

        System.out.println(
                "LinkedHashMap -> Preserves insertion order"
        );
    }
}