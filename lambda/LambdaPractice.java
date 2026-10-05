package lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public void solutions(){

        System.out.println("Q1");
        Greeting greeting = () -> System.out.println("Hello World");
        greeting.sayHello();

        System.out.println("Q2");
        Printer printer = name ->System.out.println("Welcome "+name);
        printer.print("Ronit");

        System.out.println("Q3");
        Square square = n -> n*n;
        int n = 5;
        System.out.println("Square of "+n+" is : "+square.findSquare(n));

        System.out.println("Q4");
        Addition addition = (a,b) -> a+b;
        int a = 5, b = 7;
        System.out.println("Addition of "+a+"and "+b+"is : "+addition.add(a,b));
        {
            System.out.println("Q5");
            List<Integer> nums =
                    Arrays.asList(5, 2, 8, 1, 9);
            Collections.sort(nums, (x, y) -> x - y);
            System.out.println("Sorted List : " + nums);
        }
        {
            System.out.println("Q6");
            List<Integer> nums =
                    Arrays.asList(5, 2, 8, 1, 9);
            Collections.sort(nums, (x, y) -> y - x);
            System.out.println("Sorted List : " + nums);
        }

        System.out.println("Q7");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ronit",9.78));
        students.add(new Student("Shubham",8.91));
        students.add(new Student("Kartik",9.58));
        students.add(new Student("Abhi",8.60));
        students.add(new Student("Jenson",8.30));

        students.sort(( s1, s2) -> Double.compare(s2.cgpa, s1.cgpa));
        System.out.println("Sorted Order : "+students);

        System.out.println("Q8");
        System.out.println("Enter Number to check if its even: ");
        int p = new Scanner(System.in).nextInt();
        Predicate<Integer> isEven = (x) -> x%2 == 0;
        System.out.println(isEven.test(p));


        System.out.println("Q9");
        List<String> names =
                Arrays.asList("Ronit", "Amit", "Priya", "Rahul");
        Consumer<String> print = (m) -> System.out.println(m);
        for(String name : names){
            print.accept(name);
        }

        System.out.println("Q10");
        System.out.println("Enter String to find Length: ");
        String str = new Scanner(System.in).nextLine();
        Function<String, Integer> length = (s) -> s.length();
        System.out.println(length.apply(str));

        System.out.println("Q11");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ronit", 50000));
        employees.add(new Employee("Shubham", 70000));
        employees.add(new Employee("Abhi", 90000));
        employees.add(new Employee("Kartik", 45000));
        employees.add(new Employee("Jenson", 40000));

        employees.sort((e1,e2)-> Double.compare(e1.salary, e2.salary));
        System.out.println(employees);

        System.out.println("Q12");
        employees.forEach(employee -> {
            if(employee.salary > 50000){
                System.out.println(employee);
            }
        });

        System.out.println("Q13");
        employees.sort((e1,e2)-> Double.compare(e2.salary,e1.salary));
        System.out.println("Highest Salary Employee : " + employees.getFirst());


        System.out.println("Q14");
        System.out.println("Same as Employee");

        Scanner sc = new Scanner(System.in);
        System.out.println("Q15");
        System.out.println("Calculator :");
        System.out.println("Enter First Number");
        double num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        double num2 = sc.nextInt();

        Calculator add = (r, s)-> num1+num2;
        Calculator sub = (r, s)-> num1-num2;
        Calculator mul = (r, s)-> num1*num2;
        Calculator div = (r, s) -> num1 / num2;

        System.out.println("Addition : "+add.calculate(num1,num2));
        System.out.println("Subtraction : "+sub.calculate(num1,num2));
        System.out.println("Multiplication : "+mul.calculate(num1,num2));
        System.out.println("Division : " + div.calculate(num1, num2));


        System.out.println("Q16");
        System.out.println("Enter String :");
        String s = sc.nextLine();

        StringOperation upper = (m) -> s.toUpperCase();
        StringOperation lower = (m) -> s.toLowerCase();
        StringOperation reverse = (m) -> new StringBuilder(s).reverse().toString();
        StringOperation remSpaces = (m) -> s.replaceAll("\\s+","");

        System.out.println(upper.perform(s));
        System.out.println(lower.perform(s));
        System.out.println(reverse.perform(s));
        System.out.println(remSpaces.perform(s));

        System.out.println("Q17");
        students.sort((s1,s2)-> Double.compare(s1.cgpa, s2.cgpa));
        System.out.println("Sorted Students : "+students);

        students.forEach(student -> {
            if(student.cgpa > 7.5){
                System.out.println(student);
            }
        });

        System.out.println("Topper : "+ students.getLast());

        System.out.println("Q18");
        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Programming", 599.0));
        books.add(new Book("Data Structures", 450.0));
        books.add(new Book("Spring Boot Guide", 799.0));
        books.add(new Book("Database Systems", 650.0));
        books.add(new Book("Operating Systems", 550.0));

        books.sort((b1,b2)-> b1.title.compareTo(b2.title));
        System.out.println("Books Sorted By Title : "+books);

        books.sort((b1,b2)-> Double.compare(b1.price, b2.price));
        System.out.println("Books Sorted By Price : "+books);

        System.out.println("Most Expensive Book :"+ books.getLast());

        System.out.println("Q19");

        System.out.println("Q20");

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

class Student {
    String name;
    double cgpa;
    Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString(){
        return name +" - "+cgpa;
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return name +" - "+salary;
    }
}

interface Calculator{
    double calculate(double a, double b);
}

interface StringOperation {
    String perform(String str);
}

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " - ₹" + price;
    }
}