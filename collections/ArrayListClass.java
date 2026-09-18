package collections;

import java.util.*;

public class ArrayListClass {
    Scanner sc = new Scanner(System.in);

    public void solutions(){

        System.out.println("1. Remove duplicate elements from an ArrayList.");
         List<Integer> list = new ArrayList<>();
        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!list.contains(num))
                list.add(num);
        }
        System.out.println("ArrayList After Removing Duplicates : "+ list);


        System.out.println("2. Find the second largest element.");
        list = Arrays.asList(10, 5, 20, 8, 15);
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

        System.out.println("Second Largest: " + secondLargest);

        System.out.println("3. Rotate ArrayList by k positions.");
        list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 2;
        k = k % list.size();
        for (int i = 0; i < k; i++) {
            int last = list.remove(list.size() - 1);
            list.add(0, last);
        }
        System.out.println("Arraylist After Rotation : " + list);


        System.out.println("4. Reverse an ArrayList without using Collections.reverse().");
        list = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        System.out.println("ArrayList After Reverse: "+list);

        System.out.println("5. Find frequency of each element.");
        list = Arrays.asList(10,10,20,30,50,40);
        boolean[] visited = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(list.get(i) + " -> " + count);
        }

        {
            System.out.println("6. Merge two sorted ArrayLists.");
            List<Integer> list1 = Arrays.asList(2, 4, 6, 8);
            List<Integer> list2 = Arrays.asList(1, 3, 5, 7, 9);
            List<Integer> merged = new ArrayList<>();
            int i = 0, j = 0;

            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) <= list2.get(j)) {
                    merged.add(list1.get(i));
                    i++;
                } else {
                    merged.add(list2.get(j));
                    j++;
                }
            }

            while (i < list1.size()) {
                merged.add(list1.get(i));
                i++;
            }
            while (j < list2.size()) {
                merged.add(list2.get(j));
                j++;
            }
            System.out.println("ArrayList After Merged : " + merged);
        }

        System.out.println("7. Find all pairs with given sum.");
        list = Arrays.asList(10,20,30,40,50);
        int sum = 60;

        for (int num : list){
            int target = sum-num;
            if(num < target && list.contains(target)){
                System.out.println(num +" "+ target);
            }
        }

        System.out.println("8. Move all zeros to the end.");
        list = new ArrayList<>(Arrays.asList(0,10,20,0,0,50));
        int index = 0;
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != 0) {
                int temp = list.get(index);
                list.set(index, list.get(i));
                list.set(i, temp);
                index++;
            }
        }

        System.out.println("9. Find common elements between two ArrayLists.");
        List<Integer> list1 =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> list2 =
                Arrays.asList(30, 40, 50, 60, 70);
        list1.retainAll(list2);
        System.out.println(list1);


        System.out.println("10. Implement a simple Student Management System using ArrayList.");
        ArrayList<Student> students = new ArrayList<>();
        while(true) {
            System.out.println("Enter Choice: ");
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("6.Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    String course = sc.nextLine();

                    if (students.add(new Student(id, name, course))) {
                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Failed to Add Student!");
                    }
                    break;

                case 2:
                    System.out.println("Student Id    Student Name   Course");
                    for (Student s : students) {
                        System.out.println(s);
                    }

                    break;

                case 3:
                    System.out.println("Enter Student Id to Search : ");
                    id = sc.nextInt();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.id == id) {
                            found = true;
                            System.out.println("Student Found!");
                            System.out.println(s);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Available!");
                    }

                    break;

                case 4:
                    System.out.print("Enter ID to Update: ");
                    int updateId = sc.nextInt();
                    for (Student s : students) {
                        if (s.id == updateId) {
                            sc.nextLine();
                            System.out.print("New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("New Marks: ");
                            s.course = sc.nextLine();

                            System.out.println("Updated");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to Delete: ");
                    int deleteId = sc.nextInt();
                    students.removeIf(s -> s.id == deleteId);
                    System.out.println("Deleted");

                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}

class Student{
    int id;
    String name;
    String course;

    Student(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return id + "   " + name + "    " + course;
    }
}