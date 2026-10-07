package exceptions;

import core.PracticeModule;

import java.util.Scanner;

public class ExceptionPractice implements PracticeModule {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        solutions();
    }

    public void solutions() {

        safeCalculator();
        arrayAccessValidator();
        studentMarksValidation();
        ageVerificationSystem();
        bankWithdrawalSystem();
        atmMachineSimulation();
        loginAuthenticationSystem();
        customInvalidAgeException();
        employeeSalaryValidation();
        studentResultProcessingSystem();
    }

    private void safeCalculator() {

        System.out.println("\n1. Safe Calculator");

        try {

            System.out.print("Enter First Number : ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number : ");
            int b = sc.nextInt();

            System.out.println("Division : " + (a / b));

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }
    }

    private void arrayAccessValidator() {

        System.out.println("\n2. Array Access Validator");

        int[] arr = {1, 2, 3, 4};

        try {

            System.out.print("Enter Index : ");
            int idx = sc.nextInt();

            System.out.println(arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Index");

        }
    }

    private void studentMarksValidation() {

        System.out.println("\n3. Student Marks Validation");

        try {

            System.out.print("Enter Marks : ");
            int marks = sc.nextInt();

            validateMarks(marks);

            System.out.println("Valid Marks");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void ageVerificationSystem() {

        System.out.println("\n4. Age Verification System");

        try {

            System.out.print("Enter Age : ");
            int age = sc.nextInt();

            checkAge(age);

            System.out.println("Eligible");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void bankWithdrawalSystem() {

        System.out.println("\n5. Bank Withdrawal System");

        BankAccount account = new BankAccount(5000);

        try {

            System.out.print("Enter Amount To Withdraw : ");
            int amount = sc.nextInt();

            account.withdraw(amount);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void atmMachineSimulation() {

        System.out.println("\n6. ATM Machine Simulation");

        try {

            ATM atm = new ATM(1234, 50000);

            System.out.print("Enter PIN : ");
            int pin = sc.nextInt();

            atm.validatePin(pin);

            System.out.print("Enter Amount : ");
            int amount = sc.nextInt();

            atm.withdraw(amount);

            System.out.println("Transaction Successful!");

        } catch (ArithmeticException | IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void loginAuthenticationSystem() {

        System.out.println("\n7. Login Authentication System");

        try {

            String validUser = "ronit";
            String validPass = "1234567890";

            sc.nextLine();

            System.out.print("Username : ");
            String user = sc.nextLine();

            System.out.print("Password : ");
            String pass = sc.nextLine();

            if (!validUser.equals(user) || !validPass.equals(pass)) {
                throw new Exception("Invalid Credentials!");
            }

            System.out.println("Login Successful!");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void customInvalidAgeException() {

        System.out.println("\n8. Custom InvalidAgeException");

        try {

            System.out.print("Enter Age : ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("Invalid Voter");
            }

            System.out.println("Valid Voter");

        } catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }
    }

    private void employeeSalaryValidation() {

        System.out.println("\n9. Employee Salary Validation");

        try {

            System.out.print("Enter New Salary : ");
            double salary = sc.nextDouble();

            setSalary(salary);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private void studentResultProcessingSystem() {

        System.out.println("\n10. Student Result Processing System");

        System.out.print("Enter Number Of Students : ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            try {

                System.out.print("Enter Marks : ");
                students[i] = new Student(sc.nextInt());

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
        }
    }

    private void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age Must Be Greater Than 18");
        }
    }

    private void validateMarks(int marks) throws Exception {

        if (marks < 0 || marks > 100) {
            throw new Exception("Marks Must Be Between 0 And 100");
        }
    }

    private void setSalary(double salary) throws Exception {

        if (salary <= 0) {
            throw new Exception("Salary Must Be Greater Than 0");
        }

        System.out.println("Salary Updated Successfully!");
        System.out.println("Salary : " + salary);
    }
}

class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
        System.out.println("Current Balance : " + balance);
    }

    public void withdraw(int amount) throws Exception {

        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }

        balance -= amount;

        System.out.println("Withdrawn : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }
}

class ATM {

    private final int pin;
    private int balance;

    public ATM(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void validatePin(int enteredPin) throws Exception {

        if (enteredPin != pin) {
            throw new Exception("Incorrect PIN");
        }
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid Amount");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient Balance");
        }

        balance -= amount;

        System.out.println("Withdrawn : " + amount);
        System.out.println("Remaining Balance : " + balance);
    }
}

class Student {

    private final int marks;

    public Student(int marks) throws Exception {

        if (marks < 0) {
            throw new Exception("Marks Cannot Be Negative");
        }

        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}