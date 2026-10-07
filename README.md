# Advance Java Practice Repository

A structured Java practice repository covering Core Java concepts through hands-on problem solving.

---

## Project Structure

```text
src/
├── core/
│   ├── Main.java
│   └── PracticeModule.java
│
├── collections/
│   ├── ArrayListPractice.java
│   ├── LinkedListPractice.java
│   ├── HashSetPractice.java
│   ├── LinkedHashSetPractice.java
│   ├── HashMapPractice.java
│   ├── LinkedHashMapPractice.java
│   ├── TreeSetPractice.java
│   ├── TreeMapPractice.java
│   ├── PriorityQueuePractice.java
│   ├── ArrayDequePractice.java
│   └── CollectionPractice.java
│
├── exceptions/
│   └── ExceptionPractice.java
│
├── lambdas/
│   └── LambdaPractice.java
│
└── streams/
    └── StreamPractice.java
```

---

## Topics Covered

### Collections Framework

- ArrayList
- LinkedList
- HashSet
- LinkedHashSet
- HashMap
- LinkedHashMap
- TreeSet
- TreeMap
- PriorityQueue
- ArrayDeque

### Exception Handling

- Try-Catch
- Multiple Catch Blocks
- Custom Exceptions
- Validation Problems
- ATM & Banking Simulations

### Lambda Expressions

- Functional Interfaces
- Predicates
- Consumers
- Functions
- Comparators
- Sorting Using Lambdas

### Stream API

- Filtering
- Mapping
- Sorting
- Counting
- Collecting
- Student-based Problems

---

## Design

All practice modules implement a common interface:

```java
public interface PracticeModule {
    void run();
}
```

Main launcher:

```java
List<PracticeModule> modules = List.of(
        new CollectionPractice(),
        new ExceptionPractice(),
        new LambdaPractice(),
        new StreamPractice()
);

modules.forEach(PracticeModule::run);
```

---

## Goals

- Strengthen Core Java
- Master Collections Framework
- Learn Functional Programming
- Prepare for Interviews
- Build strong Java fundamentals before Spring Boot

---

## Future Topics

### Core Java

- [ ] Generics
- [ ] File Handling (java.io, java.nio)
- [ ] JDBC
- [ ] Annotations
- [ ] Reflection API
- [ ] Networking (Socket Programming)

### Modern Java

- [ ] Optional Class
- [ ] Java Date & Time API (java.time)

### Concurrency

- [ ] Multithreading
- [ ] Synchronization
- [ ] ExecutorService
- [ ] Callable & Future
- [ ] CompletableFuture

### Software Design

- [ ] SOLID Principles
- [ ] Design Patterns

### Projects

- [ ] Student Management System
- [ ] Library Management System
- [ ] Banking Management System

---

## Author

**Ronit Khupase**

M.Sc. Computer Application  
MIT Arts, Commerce & Science College, Alandi
