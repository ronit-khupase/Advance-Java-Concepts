package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingQuestions {

    Scanner sc = new Scanner(System.in);
        public void solutions() {

            System.out.println("1. Safe Calculator");
            /*
             * Requirements:
             * - Accept two numbers.
             * - Perform division.
             * - Handle ArithmeticException (division by zero).
             * - Display a meaningful error message.
             * - Program should continue execution.
             */
            System.out.println("1. Safe Calculator");

            try {

                System.out.print("Enter First Number : ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number : ");
                int b = sc.nextInt();

                System.out.println("Division : " + (a / b));

            } catch (ArithmeticException e) {

                System.out.println("Cannot divide by zero.");

            }


            System.out.println("2. Array Access Validator");
            /*
             * Requirements:
             * - Create an array of 5 elements.
             * - Ask user for an index.
             * - Print the element at that index.
             * - Handle ArrayIndexOutOfBoundsException.
             */
            int[] arr = {1,2,3,4};
            try {
                System.out.println("Enter Index : ");
                int idx = sc.nextInt();
                System.out.println(arr[idx]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Index");
            }


            System.out.println("3. Student Marks Validation");
            /*
             * Create:
             *      validateMarks(int marks)
             *
             * Requirements:
             * - Marks must be between 0 and 100.
             * - Throw exception for invalid marks.
             * - Display appropriate message.
             */
            try {

                System.out.print("Enter Marks : ");
                int marks = sc.nextInt();

                validateMarks(marks);

                System.out.println("Valid Marks");

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }


            System.out.println("4. Age Verification System");
            /*
             * Create:
             *      checkAge(int age)
             *
             * Requirements:
             * - User must be at least 18 years old.
             * - Throw exception if age < 18.
             * - Catch and display proper message.
             */
            try{
                System.out.println("Enter Age: ");
                int age = sc.nextInt();
                checkAge(age);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println("5. Bank Withdrawal System");
            /*
             * Create class:
             *      BankAccount
             *
             * Requirements:
             * - Store account balance.
             * - Implement:
             *      withdraw(double amount)
             * - Prevent withdrawal beyond available balance.
             * - Throw exception for insufficient balance.
             */
            BankAccount ronit = new BankAccount(5000);
            try {
                System.out.println("Enter Amount to Withdraw:");
                int amt = sc.nextInt();
                ronit.withdraw(amt);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println("6. ATM Machine Simulation");
            /*
             * Requirements:
             * - Validate PIN.
             * - Validate withdrawal amount.
             * - Validate account balance.
             *
             * Handle:
             * - Invalid PIN
             * - Invalid Amount
             * - Insufficient Balance
             *
             * Use multiple catch blocks.
             */
            try {
                ATM atm = new ATM(1234,50000);

                System.out.println("Enter PIN");
                int pin = sc.nextInt();
                atm.validatePin(pin);

                System.out.println("Enter Amount : ");
                int amt = sc.nextInt();
                atm.withdraw(amt);

                System.out.println("Transaction Successful!");
            }catch (ArithmeticException | IllegalArgumentException e){
                System.out.println(e.getMessage());

            } catch (Exception e){
                System.out.println(e.getMessage());
            }


            System.out.println("7. Login Authentication System");
            /*
             * Requirements:
             * - Store valid username and password.
             * - Compare with user input.
             * - Throw exception for invalid credentials.
             * - Display login success/failure message.
             */
            try {
                String validUser = "ronit";
                String validPass = "1234567890";

                sc.nextLine();
                String user = sc.nextLine();
                String pass = sc.nextLine();
                if(!validUser.equals(user) || !validPass.equals(pass)){
                    throw new Exception("Invalid Credentials!");
                }

                System.out.println("Login Successful!");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println("8. Custom InvalidAgeException");
            /*
             * Create:
             *      class InvalidAgeException extends Exception
             *
             * Requirements:
             * - Use in voting eligibility system.
             * - Throw when age < 18.
             * - Catch and display custom message.
             */
            try {
                System.out.println("Enter Age : ");
                int age = sc.nextInt();
                if(age < 18){
                    throw new InvalidAgeException("Invalid Voter");
                }
                System.out.println("Valid Voter");
            }catch (InvalidAgeException e){
                System.out.println(e.getMessage());
            }

            System.out.println("9. Employee Salary Validation");
            /*
             * Create:
             *      setSalary(double salary)
             *
             * Requirements:
             * - Salary must be greater than 0.
             * - Throw exception otherwise.
             * - Handle exception gracefully.
             */
            try {
                System.out.println("Enter New Salary : ");
                double sal = sc.nextDouble();
                setSalary(sal);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }


            System.out.println("10. Student Result Processing System");
            /*
             * Requirements:
             * - Store marks of multiple students.
             * - Process marks one by one.
             * - Marks must be between 0 and 100.
             * - Invalid marks should throw exception.
             * - Continue processing remaining students.
             */

                System.out.println("Enter Number of Students : ");
                int n = sc.nextInt();
                Student[] students = new Student[n];
                for(int i = 0; i < n; i++){
                    try {
                    students[i] = new Student(sc.nextInt());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
        }

    private void checkAge(int age) throws Exception{
            if(age < 18){
                throw new Exception("Age Must Be Grater Than 18.");
            }
    }

    private void validateMarks(int marks) throws Exception{
            if(marks < 0 || marks > 100){
                throw new Exception("\"Marks must be between 0 and 100.\"");
            }
    }

    private void setSalary(double sal) throws Exception{
        double salary;
        if(sal <= 0){
            throw new Exception("Salary Must Be Greater Than 0");
        }
        salary = sal;
        System.out.println("Salary Updated Successfully!");
        System.out.println("Salary : "+salary);
    }
}

class BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance = balance;
        System.out.println("Current Balance: "+ balance);
    }

    public void deposit(int amt){
        balance += amt;
        System.out.println("Current Balance : "+balance);
    }

    public void withdraw (int amt) throws Exception{
        if(amt > balance){
            throw new Exception("Insufficient Balance");
        }
        System.out.println("Withdrew Amount : "+amt);
        balance -= amt;
        System.out.println("Available Balance : "+balance);
    }
}

class ATM{
    int PIN;
    int balance;

    ATM(int pin, int amt) throws Exception{
        this.PIN  = pin;
        this.balance = amt;
    }

    public void validatePin(int pin) throws Exception{
        if(PIN != pin){
            throw new Exception("Incorrect Pin");
        }
    }

    public void withdraw(int amt) throws Exception{
        if(amt <= 0){
            throw new IllegalArgumentException("Invalid Amount");
        }
        if(amt > balance){
            throw new ArithmeticException("Insufficient Balance");
        }
        balance -= amt;

        System.out.println("Amount Withdrew : "+amt);
        System.out.println("Balance : "+ balance);
    }
}


class Student{
    int marks;

    Student(int marks) throws Exception{
        if(marks < 0){
            throw new Exception("Marks Cannot Be Negative");
        }
        this.marks = marks;
    }
}

