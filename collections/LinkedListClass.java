package collections;

import java.util.*;

public class LinkedListClass {

    Scanner sc = new Scanner(System.in);

    public void solutions(){
        System.out.println("1. Insert node at beginning, middle, and end.");
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(50);
        list.add(1,20);
        list.addLast(30);
        System.out.println("LinkedList : "+list);

        System.out.println("2. Reverse a LinkedList.");
        LinkedList<Integer> reverse = new LinkedList<>();
        for (Integer num : list) {
            reverse.addFirst(num);
        }
        System.out.println("List after Reverse: " + reverse);

        System.out.println("3. Find middle node.");
        int middle = list.get(list.size()/2);
        System.out.println("Middle Node is : "+middle);

        System.out.println("5. Remove nth node from end.");
        int k = sc.nextInt();
        if(k > 0 && k <= list.size()){
            list.remove(list.size()-k);
        }
        else{
            System.out.println("Invalid Index");
        }
        System.out.println("List After Removing : "+list);

        System.out.println("6. Find length of LinkedList.");
        System.out.println("Length is : "+ list.size());

        System.out.println("7. Merge two sorted LinkedLists.");
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(10,30,50));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(20,40,60,80));
        LinkedList<Integer> merged = new LinkedList<>();
        {
            int i = 0, j = 0;
            while (i < list1.size() && j < list2.size()){
                if(list1.get(i) <= list2.get(j)){
                    merged.add(list1.get(i));
                    i++;
                }
                else {
                    merged.add(list2.get(j));
                    j++;
                }
            }
            while (i < list1.size()){
                merged.addLast(list1.get(i++));
            }
            while (j < list2.size()){
                merged.addLast(list2.get(j++));
            }

            System.out.println("Merged LinkedList is : "+merged);
        }

        System.out.println("8. Check if LinkedList is palindrome.");
        list = new LinkedList<>(Arrays.asList(10,20,30,20,10));
        boolean palindrome = true;
        for (int i = 0; i < list.size()/2; i++) {
            if(list.get(i) != list.get(list.size()-i-1)){
                System.out.println("LinkedList is Not Palindrome!");
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("LinkedList is Palindrome!");
        }

        System.out.println("9. Remove duplicates from LinkedList.");
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("Linked List After Removing Duplicates :"+list);

        System.out.println("10. Convert ArrayList to LinkedList and vice versa.");
        list = new LinkedList<>(Arrays.asList(10,20,30));
        List<Integer> array = new ArrayList<>(list);
        System.out.println("LinkedList as ArrayList: " +array);

        list = new LinkedList<>(array);
        System.out.println("ArrayList as LinkedList : "+list);
    }
}
