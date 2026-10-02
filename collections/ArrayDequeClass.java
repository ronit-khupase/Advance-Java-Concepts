package collections;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public void solutions(){

        System.out.println("1. Implement a Stack using ArrayDeque.");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());


        System.out.println("2. Implement a Queue using ArrayDeque.");
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());


        System.out.println("3. Reverse a string.");
        String str = "RONIT";
        ArrayDeque<Character> reverse = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            reverse.push(ch);
        }

        while (!reverse.isEmpty()) {
            System.out.print(reverse.pop());
        }

        System.out.println();


        System.out.println("4. Check balanced parentheses.");
        ArrayDeque<Character> bracketStack = new ArrayDeque<>();
        String exp = "{[()]}";

        boolean valid = true;

        for (char ch : exp.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                bracketStack.push(ch);
            } else {

                if (bracketStack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = bracketStack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                    valid = false;
                    break;
                }
            }
        }

        System.out.println("Balanced : " + valid);


        System.out.println("5. Find the sliding window maximum.");
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                System.out.print(nums[deque.peekFirst()] + " ");
            }
        }

        System.out.println();


        System.out.println("6. Simulate browser back/forward navigation.");
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        back.push("google.com");
        back.push("youtube.com");

        forward.push("github.com");

        System.out.println("Back : " + back.pop());
        System.out.println("Forward : " + forward.pop());

        System.out.println("7. Check if a string is a palindrome using deque.");
        String word = "madam";

        ArrayDeque<Character> palindromeDeque = new ArrayDeque<>();

        for (char ch : word.toCharArray()) {
            palindromeDeque.offerLast(ch);
        }

        boolean palindrome = true;

        while (palindromeDeque.size() > 1) {

            if (!palindromeDeque.pollFirst()
                    .equals(palindromeDeque.pollLast())) {

                palindrome = false;
                break;
            }
        }

        System.out.println("Palindrome : " + palindrome);


        System.out.println("8. Generate binary numbers from 1 to N.");
        int n = 10;

        ArrayDeque<String> binaryQueue = new ArrayDeque<>();

        binaryQueue.offer("1");

        for (int i = 1; i <= n; i++) {

            String current = binaryQueue.poll();

            System.out.print(current + " ");

            binaryQueue.offer(current + "0");
            binaryQueue.offer(current + "1");
        }

        System.out.println();

        System.out.println("9. Implement undo-redo functionality.");
        ArrayDeque<String> undo = new ArrayDeque<>();
        ArrayDeque<String> redo = new ArrayDeque<>();

        undo.push("A");
        undo.push("B");
        undo.push("C");

        String action = undo.pop();
        redo.push(action);

        System.out.println("Undo : " + action);

        action = redo.pop();
        undo.push(action);

        System.out.println("Redo : " + action);


        System.out.println("10. Design a train coach insertion/removal system.");
        ArrayDeque<String> train = new ArrayDeque<>();

        train.offerFirst("Coach-A");
        train.offerLast("Coach-B");
        train.offerLast("Coach-C");

        System.out.println(train);

        train.pollFirst();

        System.out.println(train);

        train.offerFirst("Coach-X");

        System.out.println(train);
    }
}
