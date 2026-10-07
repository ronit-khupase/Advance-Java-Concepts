# Java Stream API Practice Sheet

## Instructions

- Solve questions in order.
- Use Stream API wherever possible.
- Focus on understanding `filter()`, `map()`, `sorted()`, `distinct()`, `count()`, `limit()`, `max()`, `min()`, and `collect()`.
- Avoid using loops unless specifically required.

---

# Level 1: Basic Streams

Given:

```java
List<Integer> nums =
Arrays.asList(1,2,3,4,5,6,7,8,9,10);
```

## Q1. Print all numbers using Stream.

Expected Output:

```
1
2
3
4
...
10
```

---

## Q2. Print only even numbers.

Expected Output:

```
2
4
6
8
10
```

---

## Q3. Print only odd numbers.

Expected Output:

```
1
3
5
7
9
```

---

## Q4. Count total even numbers.

Expected Output:

```
5
```

---

## Q5. Print first 5 numbers using Stream.

Expected Output:

```
1
2
3
4
5
```

---

# Level 2: map()

Given:

```java
List<Integer> nums =
Arrays.asList(1,2,3,4,5);
```

## Q6. Print square of every number.

Expected Output:

```
1
4
9
16
25
```

---

## Q7. Print cube of every number.

Expected Output:

```
1
8
27
64
125
```

---

## Q8. Create a new List containing squares of all numbers.

Expected Output:

```java
[1, 4, 9, 16, 25]
```

---

# Level 3: Strings

Given:

```java
List<String> names =
Arrays.asList(
    "Ronit",
    "Amit",
    "Priya",
    "Rahul",
    "Ronit"
);
```

## Q9. Print all names in uppercase.

Expected Output:

```
RONIT
AMIT
PRIYA
RAHUL
RONIT
```

---

## Q10. Remove duplicate names.

Expected Output:

```
Ronit
Amit
Priya
Rahul
```

---

## Q11. Print names having length greater than or equal 5.

Expected Output:

```
Ronit
Priya
Rahul
```

---

## Q12. Count names whose length is greater than or equal 5.

Expected Output:

```
3
```

---

## Q13. Print names starting with 'R'.

Expected Output:

```
Ronit
Rahul
Ronit
```

---

# Level 4: Sorting

Given:

```java
List<Integer> nums =
Arrays.asList(5,2,8,1,9,3);
```

## Q14. Sort numbers in ascending order.

Expected Output:

```
1 2 3 5 8 9
```

---

## Q15. Sort numbers in descending order.

Expected Output:

```
9 8 5 3 2 1
```

---

# Level 5: Min & Max

Given:

```java
List<Integer> nums =
Arrays.asList(5,2,8,1,9,3);
```

## Q16. Find maximum element.

Expected Output:

```
9
```

---

## Q17. Find minimum element.

Expected Output:

```
1
```

---

# Level 6: Objects

Create:

```java
class Student {
    String name;
    double cgpa;
}
```

Store:

```text
Ronit 9.81
Amit 8.50
Priya 9.20
Rahul 7.80
```

---

## Q18. Print students having CGPA greater than 9.

Expected Output:

```text
Ronit
Priya
```

---

## Q19. Print only student names.

Expected Output:

```text
Ronit
Amit
Priya
Rahul
```

---

## Q20. Find student with highest CGPA.

Expected Output:

```text
Ronit
```

---

# Bonus Questions (Spring Boot Oriented)

## Q21. Count students having CGPA greater than 8.

---

## Q22. Convert all student names to uppercase.

Expected Output:

```text
RONIT
AMIT
PRIYA
RAHUL
```

---

## Q23. Sort students by CGPA in descending order.

Expected Output:

```text
Ronit 9.81
Priya 9.20
Amit 8.50
Rahul 7.80
```

---

## Q24. Get first 2 students after sorting by CGPA descending.

Expected Output:

```text
Ronit
Priya
```

---

## Q25. Collect names of students having CGPA greater than 8 into a List.

Expected Output:

```java
[Ronit, Amit, Priya]
```

---

# Topics Covered

- stream()
- forEach()
- filter()
- map()
- sorted()
- distinct()
- count()
- limit()
- max()
- min()
- collect()

---

# Next Topic

**JDBC (CRUD Operations using PostgreSQL)**