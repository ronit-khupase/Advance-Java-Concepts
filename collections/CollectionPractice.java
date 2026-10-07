package collections;

import core.PracticeModule;

public class CollectionPractice implements PracticeModule {

    @Override
    public void run() {

        new ArrayListPractice().run();
        new LinkedListPractice().run();
        new HashSetPractice().run();
        new LinkedHashSetPractice().run();
        new TreeSetPractice().run();
        new HashMapPractice().run();
        new LinkedHashMapPractice().run();
        new TreeMapPractice().run();
        new PriorityQueuePractice().run();
        new ArrayDequePractice().run();
    }
}