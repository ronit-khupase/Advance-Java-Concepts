package collections;

import core.PracticeModule;

import java.util.ArrayDeque;

public class ArrayDequePractice implements PracticeModule {

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

        System.out.println("Q1. Implement Stack using ArrayDeque.");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());
    }

    private void q2() {

        System.out.println("Q2. Implement Queue using ArrayDeque.");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());
    }

    private void q3() {

        System.out.println("Q3. Reverse a String.");

        String str = "RONIT";

        ArrayDeque<Character> stack =
                new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
    }

    private void q4() {

        System.out.println("Q4. Check Balanced Parentheses.");

        String expression = "{[()]}";

        ArrayDeque<Character> stack =
                new ArrayDeque<>();

        boolean balanced = true;

        for (char ch : expression.toCharArray()) {

            if (ch == '(' ||
                    ch == '{' ||
                    ch == '[') {

                stack.push(ch);

            } else {

                if (stack.isEmpty()) {

                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == ']' && top != '[')) {

                    balanced = false;
                    break;
                }
            }
        }

        System.out.println("Balanced : " + balanced);
    }

    private void q5() {

        System.out.println("Q5. Sliding Window Maximum.");

        int[] nums =
                {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        ArrayDeque<Integer> deque =
                new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            while (!deque.isEmpty()
                    && deque.peekFirst() <= i - k) {

                deque.pollFirst();
            }

            while (!deque.isEmpty()
                    && nums[deque.peekLast()] < nums[i]) {

                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {

                System.out.print(
                        nums[deque.peekFirst()] + " "
                );
            }
        }

        System.out.println();
    }

    private void q6() {

        System.out.println(
                "Q6. Browser Back/Forward Navigation."
        );

        ArrayDeque<String> back =
                new ArrayDeque<>();

        ArrayDeque<String> forward =
                new ArrayDeque<>();

        back.push("google.com");
        back.push("youtube.com");

        forward.push("github.com");

        System.out.println(
                "Back : " + back.pop()
        );

        System.out.println(
                "Forward : " + forward.pop()
        );
    }

    private void q7() {

        System.out.println(
                "Q7. Palindrome Check."
        );

        String word = "madam";

        ArrayDeque<Character> deque =
                new ArrayDeque<>();

        for (char ch : word.toCharArray()) {
            deque.offerLast(ch);
        }

        boolean palindrome = true;

        while (deque.size() > 1) {

            if (!deque.pollFirst()
                    .equals(deque.pollLast())) {

                palindrome = false;
                break;
            }
        }

        System.out.println(
                "Palindrome : " + palindrome
        );
    }

    private void q8() {

        System.out.println(
                "Q8. Generate Binary Numbers."
        );

        int n = 10;

        ArrayDeque<String> queue =
                new ArrayDeque<>();

        queue.offer("1");

        for (int i = 1; i <= n; i++) {

            String current = queue.poll();

            System.out.print(current + " ");

            queue.offer(current + "0");
            queue.offer(current + "1");
        }

        System.out.println();
    }

    private void q9() {

        System.out.println(
                "Q9. Undo Redo Functionality."
        );

        ArrayDeque<String> undo =
                new ArrayDeque<>();

        ArrayDeque<String> redo =
                new ArrayDeque<>();

        undo.push("A");
        undo.push("B");
        undo.push("C");

        String action = undo.pop();

        redo.push(action);

        System.out.println(
                "Undo : " + action
        );

        action = redo.pop();

        undo.push(action);

        System.out.println(
                "Redo : " + action
        );
    }

    private void q10() {

        System.out.println(
                "Q10. Train Coach Management."
        );

        ArrayDeque<String> train =
                new ArrayDeque<>();

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