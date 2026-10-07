package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
    public void solutions(){
        {
            List<Integer> nums =
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            System.out.println("Q1. Print all numbers using Stream.");
            nums.stream()
                    .forEach(System.out::println);


            System.out.println("Q2. Print only even numbers.");
            nums.stream()
                    .filter(x -> x % 2 == 0)
                    .forEach(System.out::println);


            System.out.println("Q3. Print only odd numbers.");
            nums.stream()
                    .filter(x -> x % 2 != 0)
                    .forEach(System.out::println);


            System.out.println("Q4. Count total even numbers.");
            long num = nums.stream()
                    .filter(x -> x % 2 == 0)
                    .count();
            System.out.println("Count: " + num);


            System.out.println("Q5. Print first 5 numbers using Stream.");
            nums.stream()
                    .limit(5)
                    .forEach(System.out::println);

        }

        {
            List<Integer> nums =
                    Arrays.asList(1, 2, 3, 4, 5);

            System.out.println("Q6. Print square of every number.");
            nums.stream()
                    .map(x -> x*x)
                    .forEach(System.out::println);


            System.out.println("Q7. Print cube of every number.");
            nums.stream()
                    .map(x -> x*x*x)
                    .forEach(System.out::println);


            System.out.println("Q8. Create a new List containing squares of all numbers.");
            List<Integer> list = nums.stream()
                    .map(x -> x*x)
                    .toList();
            System.out.println(list);

        }

        {
            List<String> names =
                    Arrays.asList("Ronit", "Amit", "Priya", "Rahul", "Ronit");

            System.out.println("Q9. Print all names in uppercase.");
            names.stream()
                    .map(x -> x.toUpperCase())
                    .forEach(System.out::println);


            System.out.println("Q10. Remove duplicate names.");
            names.stream()
                    .distinct()
                    .forEach(System.out::println);


            System.out.println("Q11. Print names having length greater than 5.");
            names.stream()
                    .distinct()
                    .filter(x -> x.length() >= 5)
                    .forEach(System.out::println);


            System.out.println("Q12. Count names whose length is greater than 5.");
            long count = names.stream()
                    .distinct()
                    .filter(x -> x.length() >= 5)
                    .count();
            System.out.println("Count: "+count);


            System.out.println("Q13. Print names starting with 'R'.");
            names.stream()
                    .filter(x -> Character.toLowerCase(x.charAt(0)) == 'r')
                    .forEach(System.out::println);
        }

        {
            List<Integer> nums =
                    Arrays.asList(5,2,8,1,9,3);

            System.out.println("Q14. Sort numbers in ascending order.");
            nums.stream()
                    .sorted()
                    .forEach(System.out::print);
            System.out.println();


            System.out.println("Q15. Sort numbers in descending order.");
            nums.stream()
                    .sorted((a,b) -> b-a)
                    .forEach(System.out::print);
            System.out.println();


            System.out.println("Q16. Find maximum element.");
            int max = nums.stream()
                    .max(Integer::compareTo)
                    .get();
            System.out.println("Max : "+max);


            System.out.println("Q17. Find minimum element.");
            int min = nums.stream()
                    .min(Integer::compareTo)
                    .get();
            System.out.println("Max : "+min);
        }

        {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Ronit", 9.81));
            students.add(new Student("Amit", 8.50));
            students.add(new Student("Priya", 9.20));
            students.add(new Student("Rahul", 7.80));

            System.out.println("Q18. Print students having CGPA greater than 9.");
            students.stream()
                    .filter(x -> x.cgpa > 9)
                    .forEach(s -> System.out.println(s.name));


            System.out.println("Q19. Print only student names.");
            students.stream()
                    .map(s -> s.name)
                    .forEach(System.out::println);


            System.out.println("Q20. Find student with highest CGPA.");
            double max = students.stream()
                    .map(s -> s.cgpa)
                    .max(Double::compareTo)
                    .get();
            System.out.println("Max CGPA : "+max);


            System.out.println("Q21. Count students having CGPA greater than 8.");
            long count = students.stream()
                    .map(x -> x.cgpa)
                    .count();
            System.out.println("Count : "+count);


            System.out.println("Q22. Convert all student names to uppercase.");
            students.stream()
                    .map(x -> x.name.toUpperCase())
                    .forEach(System.out::println);


            System.out.println("Q23. Sort students by CGPA in descending order.");
            students.stream()
                    .sorted((a,b) -> Double.compare(b.cgpa, a.cgpa))
                    .forEach(s -> System.out.println(s.name + " "+s.cgpa));


            System.out.println("Q24. Get first 2 students after sorting by CGPA descending.");
            students.stream()
                    .sorted((a,b) -> Double.compare(b.cgpa, a.cgpa))
                    .limit(2)
                    .map(x -> x.name)
                    .forEach(System.out::println);


            System.out.println("Q25. Collect names of students having CGPA greater than 8 into a List.");
            List<String> list = students.stream()
                    .filter(s -> s.cgpa > 8)
                    .map(s -> s.name)
                    .toList();
            System.out.println(list);
        }
    }
}

class Student{
    String name;
    double cgpa;

    Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

}
