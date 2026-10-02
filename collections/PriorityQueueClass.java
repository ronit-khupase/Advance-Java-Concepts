package collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClass {
    public void solutions() {

        System.out.println("1. Find the 2nd largest element.");
        int k = 2;
        Queue<Integer> queue = new PriorityQueue<>();
        int[] nums = {15,25,30,40,10,50};
        for (int num : nums) {
            queue.offer(num);

            if (queue.size() > k) {
                queue.poll();
            }
        }
        System.out.println("Second Largest : "+queue.peek());

        System.out.println("2. Find the kth smallest element.");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxHeap.offer(num);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        System.out.println("2nd Smallest is : "+maxHeap.peek());


//        System.out.println("3. Implement a min-heap.");
//        System.out.println("4. Implement a max-heap.");


        System.out.println("5. Sort a nearly sorted array.");
        sortNearlySortedArray();

        System.out.println("6. Merge k sorted arrays.");
        int[][] arrays = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int[] arr : arrays) {
            for (int num : arr) {
                minHeap.offer(num);
            }
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        System.out.println("7. Print the top 5 highest marks.");
        int[] marks = {75, 88, 95, 60, 98, 85, 91, 72};

        PriorityQueue<Integer> marksHeap =
                new PriorityQueue<>();

        for (int mark : marks) {

            marksHeap.offer(mark);

            if (marksHeap.size() > 5) {
                marksHeap.poll();
            }
        }

        while (!marksHeap.isEmpty()) {
            System.out.println(marksHeap.poll());
        }

        System.out.println("8. Simulate task scheduling.");
        PriorityQueue<Integer> taskHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        taskHeap.offer(3);
        taskHeap.offer(1);
        taskHeap.offer(5);
        taskHeap.offer(2);

        while (!taskHeap.isEmpty()) {
            System.out.println(
                    "Executing Priority : "
                            + taskHeap.poll());
        }

//        System.out.println("9. Find the median of a running stream.");


        System.out.println("10. Implement a hospital patient priority system.");
        PriorityQueue<Integer> patients =
                new PriorityQueue<>(Collections.reverseOrder());

        patients.offer(2); // mild
        patients.offer(10); // critical
        patients.offer(5);

        while (!patients.isEmpty()) {

            System.out.println(
                    "Treat Patient Severity : "
                            + patients.poll());
        }
    }

    public void sortNearlySortedArray() {

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

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
    }
}
