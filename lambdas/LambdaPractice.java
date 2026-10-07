package lambdas;

import core.PracticeModule;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice implements PracticeModule {

    private final Scanner sc = new Scanner(System.in);

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
        q11();
        q12();
        q13();
        q14();
        q15();
        q16();
        q17();
        q18();
        q19();
        q20();
    }

    private void q1() {
        Greeting greeting = () -> System.out.println("Hello World");
        greeting.sayHello();
    }

    private void q2() {
        Printer printer = name -> System.out.println("Welcome " + name);
        printer.print("Ronit");
    }

    private void q3() {
        Square square = n -> n * n;
        System.out.println(square.findSquare(5));
    }

    private void q4() {
        Addition addition = (a, b) -> a + b;
        System.out.println(addition.add(10, 20));
    }

    private void q5() {

        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9);

        nums.sort((x, y) -> x - y);

        System.out.println(nums);
    }

    private void q6() {

        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9);

        nums.sort((x, y) -> y - x);

        System.out.println(nums);
    }

    private void q7() {

        List<LambdaStudent> students = new ArrayList<>();

        students.add(new LambdaStudent("Ronit", 9.78));
        students.add(new LambdaStudent("Shubham", 8.91));
        students.add(new LambdaStudent("Kartik", 9.58));
        students.add(new LambdaStudent("Abhi", 8.60));
        students.add(new LambdaStudent("Jenson", 8.30));

        students.sort((s1, s2) ->
                Double.compare(s2.cgpa, s1.cgpa));

        System.out.println(students);
    }

    private void q8() {

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));
        System.out.println(isEven.test(18));
    }

    private void q9() {

        List<String> names =
                Arrays.asList("Ronit", "Amit", "Priya", "Rahul");

        Consumer<String> print = System.out::println;

        names.forEach(print);
    }

    private void q10() {

        Function<String, Integer> length = String::length;

        System.out.println(length.apply("Java"));
    }

    private void q11() {

        List<LambdaEmployee> employees = getEmployees();

        employees.sort(
                (e1, e2) ->
                        Double.compare(e1.salary, e2.salary));

        System.out.println(employees);
    }

    private void q12() {

        getEmployees().forEach(employee -> {
            if (employee.salary > 50000) {
                System.out.println(employee);
            }
        });
    }

    private void q13() {

        List<LambdaEmployee> employees = getEmployees();

        employees.sort(
                (e1, e2) ->
                        Double.compare(e2.salary, e1.salary));

        System.out.println(employees.getFirst());
    }

    private void q14() {

        List<LambdaBook> books = getBooks();

        books.sort(
                (b1, b2) ->
                        Double.compare(b1.price, b2.price));

        System.out.println("Cheapest : " + books.getFirst());
        System.out.println("Costliest : " + books.getLast());
    }

    private void q15() {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println(add.calculate(10, 5));
        System.out.println(sub.calculate(10, 5));
        System.out.println(mul.calculate(10, 5));
        System.out.println(div.calculate(10, 5));
    }

    private void q16() {

        StringOperation upper =
                str -> str.toUpperCase();

        StringOperation lower =
                str -> str.toLowerCase();

        StringOperation reverse =
                str -> new StringBuilder(str)
                        .reverse()
                        .toString();

        StringOperation removeSpaces =
                str -> str.replaceAll("\\s+", "");

        String text = "Hello Java";

        System.out.println(upper.perform(text));
        System.out.println(lower.perform(text));
        System.out.println(reverse.perform(text));
        System.out.println(removeSpaces.perform(text));
    }

    private void q17() {
        System.out.println("Implement Student Result Processing");
    }

    private void q18() {

        List<LambdaBook> books = getBooks();

        books.sort((b1, b2) ->
                b1.title.compareTo(b2.title));

        books.sort((b1, b2) ->
                Double.compare(b1.price, b2.price));

        System.out.println(books.getLast());
    }

    private void q19() {
        System.out.println("Implement Movie Rating System");
    }

    private void q20() {
        System.out.println("Implement Interview Challenge");
    }

    private List<LambdaEmployee> getEmployees() {

        return new ArrayList<>(List.of(
                new LambdaEmployee("Ronit", 50000),
                new LambdaEmployee("Shubham", 70000),
                new LambdaEmployee("Abhi", 90000),
                new LambdaEmployee("Kartik", 45000),
                new LambdaEmployee("Jenson", 40000)
        ));
    }

    private List<LambdaBook> getBooks() {

        return new ArrayList<>(List.of(
                new LambdaBook("Java Programming", 599),
                new LambdaBook("Data Structures", 450),
                new LambdaBook("Spring Boot Guide", 799),
                new LambdaBook("Database Systems", 650),
                new LambdaBook("Operating Systems", 550)
        ));
    }
}

interface Greeting {
    void sayHello();
}

interface Printer {
    void print(String name);
}

interface Square {
    int findSquare(int n);
}

interface Addition {
    int add(int a, int b);
}

interface Calculator {
    double calculate(double a, double b);
}

interface StringOperation {
    String perform(String str);
}

class LambdaStudent {

    String name;
    double cgpa;

    LambdaStudent(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return name + " - " + cgpa;
    }
}

class LambdaEmployee {

    String name;
    double salary;

    LambdaEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

class LambdaBook {

    String title;
    double price;

    LambdaBook(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " - ₹" + price;
    }
}