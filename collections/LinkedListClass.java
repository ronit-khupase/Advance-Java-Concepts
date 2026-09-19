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
                
            }
        }
    }

//
//8. Check if LinkedList is palindrome.
//9. Remove duplicates from LinkedList.
//10. Convert ArrayList to LinkedList and vice versa.
}
