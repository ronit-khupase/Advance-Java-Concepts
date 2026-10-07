# JAVA LAMBDA EXPRESSIONS PRACTICE SHEET

**Level:** Beginner → Intermediate → Advanced

## Instructions

1. Solve questions in order.
2. Use Lambda Expressions wherever possible.
3. Avoid Anonymous Classes unless required for comparison.
4. Focus on understanding syntax and Functional Interfaces.

---

# LEVEL 1 : BASIC LAMBDA SYNTAX

## Q1. First Lambda

Create the following Functional Interface:

```java
interface Greeting {
    void sayHello();
}
```

Implement it using a Lambda Expression.

### Output

```text
Hello World
```

---

## Q2. Lambda With One Parameter

Create:

```java
interface Printer {
    void print(String name);
}
```

Implement using Lambda.

### Input

```text
Ronit
```

### Output

```text
Welcome Ronit
```

---

## Q3. Lambda Returning Value

Create:

```java
interface Square {
    int findSquare(int n);
}
```

Implement using Lambda.

### Input

```text
5
```

### Output

```text
25
```

---

## Q4. Lambda With Two Parameters

Create:

```java
interface Addition {
    int add(int a, int b);
}
```

Implement using Lambda.

### Input

```text
10, 20
```

### Output

```text
30
```

---

# LEVEL 2 : COMPARATOR & COLLECTIONS

## Q5. Sort Integer List

Given:

```java
List<Integer> nums =
Arrays.asList(5,2,8,1,9);
```

Sort the list in ascending order using Lambda.

### Expected Output

```text
[1, 2, 5, 8, 9]
```

---

## Q6. Sort Integer List Descending

Given:

```java
List<Integer> nums =
Arrays.asList(5,2,8,1,9);
```

Sort the list in descending order using Lambda.

### Expected Output

```text
[9, 8, 5, 2, 1]
```

---

## Q7. Sort Students By CGPA

Create:

```java
class Student {
    String name;
    double cgpa;
}
```

Store at least 5 students in a List.

Sort students by CGPA using Lambda.

### Expected

Highest CGPA student should appear first.

---

# LEVEL 3 : BUILT-IN FUNCTIONAL INTERFACES

## Q8. Predicate Example

Create:

```java
Predicate<Integer>
```

that checks whether a number is even.

### Test Cases

```text
10 -> true
7 -> false
18 -> true
```

---

## Q9. Consumer Example

Given:

```java
List<String> names =
Arrays.asList(
    "Ronit",
    "Amit",
    "Priya",
    "Rahul"
);
```

Use `Consumer<String>` to print every name.

---

## Q10. Function Example

Create:

```java
Function<String,Integer>
```

that returns length of a string.

### Test Cases

```text
"Java" -> 4
"SpringBoot" -> 10
"Programming" -> 11
```

---

# LEVEL 4 : REAL WORLD SCENARIOS

## Q11. Employee Salary Sort

Create:

```java
class Employee {
    String name;
    double salary;
}
```

Store 5 employees.

Sort employees by salary in ascending order.

---

## Q12. Employee Salary Filter

Using Lambda:

Print employees whose salary is greater than `50000`.

---

## Q13. Find Highest Salary Employee

Using Lambda and Collections methods:

Find employee with highest salary.

---

## Q14. Product Price Comparison

Create:

```java
class Product {
    String name;
    double price;
}
```

Store 5 products.

Sort products by price.

### Print

- Cheapest product
- Costliest product

---

# LEVEL 5 : ADVANCED LAMBDA PRACTICE

## Q15. Calculator Application

Create Functional Interface:

```java
interface Calculator {
    double calculate(double a, double b);
}
```

Implement Lambdas for:

1. Addition
2. Subtraction
3. Multiplication
4. Division

Test each operation.

---

## Q16. String Operations

Create Functional Interface:

```java
interface StringOperation {
    String perform(String str);
}
```

Implement Lambdas for:

1. Convert to Uppercase
2. Convert to Lowercase
3. Reverse String
4. Remove Spaces

---

## Q17. Student Result Processing

Create Student class:

```java
class Student {
    String name;
    int marks;
}
```

Store 10 students.

Using Lambdas:

1. Sort by marks
2. Print students with marks > 75
3. Print topper

---

## Q18. Book Management

Create:

```java
class Book {
    String title;
    double price;
}
```

Store 5 books.

Using Lambdas:

1. Sort by title
2. Sort by price
3. Find most expensive book

---

## Q19. Movie Rating System

Create:

```java
class Movie {
    String name;
    double rating;
}
```

Store 5 movies.

Using Lambdas:

1. Sort by rating descending
2. Print movies with rating > 8
3. Find highest rated movie

---

## Q20. Interview-Level Challenge

Create:

```java
class Employee {
    String name;
    String department;
    double salary;
}
```

Store at least 10 employees.

Using Lambdas:

1. Sort by salary
2. Sort by department
3. Print employees whose salary > 50000
4. Find highest paid employee
5. Find lowest paid employee

> Do NOT use Streams yet.  
> Use Collections + Lambdas only.

---

# END OF LAMBDA PRACTICE SHEET

## Topics Covered

- Functional Interfaces
- Lambda Syntax
- Parameters
- Return Values
- Comparator
- Predicate
- Consumer
- Function
- Collections Sorting
- Real World Objects

---

## Next Topic

**STREAM API**