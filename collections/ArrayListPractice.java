package collections;

import core.PracticeModule;

import java.util.*;

public class ArrayListPractice implements PracticeModule {

    private final Scanner sc = new Scanner(System.in);

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

        System.out.println("Q1. Remove duplicate elements from an ArrayList.");

        List<Integer> list = new ArrayList<>();

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            if (!list.contains(num)) {
                list.add(num);
            }
        }

        System.out.println(list);
    }

    private void q2() {

        System.out.println("Q2. Find second largest element.");

        List<Integer> list =
                Arrays.asList(10, 5, 20, 8, 15);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {

            if (num > largest) {

                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {

                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }

    private void q3() {

        System.out.println("Q3. Rotate ArrayList by k positions.");

        List<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int k = 2;

        for (int i = 0; i < k; i++) {

            int last = list.removeLast();
            list.addFirst(last);
        }

        System.out.println(list);
    }

    private void q4() {

        System.out.println("Q4. Reverse ArrayList.");

        List<Integer> list =
                new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            int temp = list.get(left);

            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println(list);
    }

    private void q5() {

        System.out.println("Q5. Frequency of each element.");

        List<Integer> list =
                Arrays.asList(10, 10, 20, 30, 50, 40);

        boolean[] visited =
                new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {

                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(list.get(i) + " -> " + count);
        }
    }

    private void q6() {

        System.out.println("Q6. Merge two sorted ArrayLists.");

        List<Integer> list1 =
                Arrays.asList(2, 4, 6, 8);

        List<Integer> list2 =
                Arrays.asList(1, 3, 5, 7, 9);

        List<Integer> merged = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) <= list2.get(j)) {

                merged.add(list1.get(i++));

            } else {

                merged.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i++));
        }

        while (j < list2.size()) {
            merged.add(list2.get(j++));
        }

        System.out.println(merged);
    }

    private void q7() {

        System.out.println("Q7. Find pairs with given sum.");

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        int sum = 60;

        for (int num : list) {

            int target = sum - num;

            if (num < target && list.contains(target)) {

                System.out.println(num + " " + target);
            }
        }
    }

    private void q8() {

        System.out.println("Q8. Move zeros to end.");

        List<Integer> list =
                new ArrayList<>(Arrays.asList(0, 10, 20, 0, 0, 50));

        int index = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != 0) {

                int temp = list.get(index);

                list.set(index, list.get(i));
                list.set(i, temp);

                index++;
            }
        }

        System.out.println(list);
    }

    private void q9() {

        System.out.println("Q9. Common elements.");

        List<Integer> list1 =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        List<Integer> list2 =
                Arrays.asList(30, 40, 50, 60, 70);

        list1.retainAll(list2);

        System.out.println(list1);
    }

    private void q10() {

        System.out.println("Q10. Student Management System");

        studentManagementSystem();
    }

    private void studentManagementSystem() {

        ArrayList<ArrayListStudent> students =
                new ArrayList<>();

        while (true) {

            System.out.println("""
                    1. Add
                    2. Display
                    3. Search
                    4. Update
                    5. Delete
                    6. Exit
                    """);

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> addStudent(students);

                case 2 -> students.forEach(System.out::println);

                case 3 -> searchStudent(students);

                case 4 -> updateStudent(students);

                case 5 -> deleteStudent(students);

                case 6 -> {
                    return;
                }

                default -> System.out.println("Invalid Choice");
            }
        }
    }

    private void addStudent(List<ArrayListStudent> students) {

        System.out.print("ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Course : ");
        String course = sc.nextLine();

        students.add(
                new ArrayListStudent(id, name, course)
        );

        System.out.println("Student Added");
    }

    private void searchStudent(List<ArrayListStudent> students) {

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        for (ArrayListStudent student : students) {

            if (student.id == id) {

                System.out.println(student);
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    private void updateStudent(List<ArrayListStudent> students) {

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        for (ArrayListStudent student : students) {

            if (student.id == id) {

                sc.nextLine();

                System.out.print("New Name : ");
                student.name = sc.nextLine();

                System.out.print("New Course : ");
                student.course = sc.nextLine();

                System.out.println("Updated");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    private void deleteStudent(List<ArrayListStudent> students) {

        System.out.print("Enter ID : ");
        int id = sc.nextInt();

        students.removeIf(student -> student.id == id);

        System.out.println("Deleted");
    }
}

class ArrayListStudent {

    int id;
    String name;
    String course;

    ArrayListStudent(int id,
                     String name,
                     String course) {

        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {

        return id + "   " +
                name + "   " +
                course;
    }
}