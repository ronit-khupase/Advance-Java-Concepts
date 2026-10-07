package collections;

import core.PracticeModule;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuePractice implements PracticeModule {

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

        System.out.println("Q1. Find 2nd Largest Element.");

        int[] nums = {15, 25, 30, 40, 10, 50};
        int k = 2;

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        System.out.println(
                "2nd Largest : " + minHeap.peek());
    }

    private void q2() {

        System.out.println("Q2. Find 2nd Smallest Element.");

        int[] nums = {15, 25, 30, 40, 10, 50};
        int k = 2;

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {

            maxHeap.offer(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        System.out.println(
                "2nd Smallest : " + maxHeap.peek());
    }

    private void q3() {

        System.out.println("Q3. Implement Min Heap.");

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);
        minHeap.offer(20);

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        System.out.println();
    }

    private void q4() {

        System.out.println("Q4. Implement Max Heap.");

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(40);
        maxHeap.offer(10);
        maxHeap.offer(30);
        maxHeap.offer(20);

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        System.out.println();
    }

    private void q5() {

        System.out.println("Q5. Sort Nearly Sorted Array.");

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        int index = 0;

        for (int i = 0; i <= k; i++) {
            minHeap.offer(arr[i]);
        }

        for (int i = k + 1; i < arr.length; i++) {

            arr[index++] = minHeap.poll();
            minHeap.offer(arr[i]);
        }

        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    private void q6() {

        System.out.println("Q6. Merge K Sorted Arrays.");

        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        for (int[] arr : arrays) {

            for (int num : arr) {
                minHeap.offer(num);
            }
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        System.out.println();
    }

    private void q7() {

        System.out.println("Q7. Top 5 Highest Marks.");

        int[] marks =
                {75, 88, 95, 60, 98, 85, 91, 72};

        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        for (int mark : marks) {

            minHeap.offer(mark);

            if (minHeap.size() > 5) {
                minHeap.poll();
            }
        }

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }

    private void q8() {

        System.out.println("Q8. Task Scheduling.");

        PriorityQueue<Integer> taskQueue =
                new PriorityQueue<>(Collections.reverseOrder());

        taskQueue.offer(3);
        taskQueue.offer(1);
        taskQueue.offer(5);
        taskQueue.offer(2);

        while (!taskQueue.isEmpty()) {

            System.out.println(
                    "Executing Priority : "
                            + taskQueue.poll());
        }
    }

    private void q9() {

        System.out.println("Q9. Running Median.");

        int[] stream = {5, 15, 1, 3};

        PriorityQueue<Integer> lower =
                new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> higher =
                new PriorityQueue<>();

        for (int num : stream) {

            lower.offer(num);

            higher.offer(lower.poll());

            if (higher.size() > lower.size()) {
                lower.offer(higher.poll());
            }

            double median;

            if (lower.size() == higher.size()) {

                median =
                        (lower.peek() + higher.peek()) / 2.0;

            } else {

                median = lower.peek();
            }

            System.out.println(
                    "Median : " + median);
        }
    }

    private void q10() {

        System.out.println(
                "Q10. Hospital Patient Priority System."
        );

        PriorityQueue<Integer> patients =
                new PriorityQueue<>(Collections.reverseOrder());

        patients.offer(2);
        patients.offer(10);
        patients.offer(5);

        while (!patients.isEmpty()) {

            System.out.println(
                    "Treat Patient Severity : "
                            + patients.poll());
        }
    }
}