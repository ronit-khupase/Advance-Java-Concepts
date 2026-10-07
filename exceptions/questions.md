# Exception Handling Questions


## Questions

### 1. Safe Calculator

Requirements:

- Accept two numbers.
- Perform division.
- Handle ArithmeticException (division by zero).
- Display a meaningful error message.
- Program should continue execution.

---

### 2. Array Access Validator

Requirements:

- Create an array of elements.
- Ask user for an index.
- Print the element at that index.
- Handle ArrayIndexOutOfBoundsException.

---

### 3. Student Marks Validation

Create:

```java
validateMarks(int marks)
```

Requirements:

- Marks must be between 0 and 100.
- Throw exception for invalid marks.
- Display appropriate message.

---

### 4. Age Verification System

Create:

```java
checkAge(int age)
```

Requirements:

- User must be at least 18 years old.
- Throw exception if age < 18.
- Catch and display proper message.

---

### 5. Bank Withdrawal System

Create:

```java
class BankAccount
```

Requirements:

- Store account balance.
- Implement withdraw().
- Prevent withdrawal beyond available balance.
- Throw exception for insufficient balance.

---

### 6. ATM Simulation

Requirements:

- Validate PIN.
- Validate withdrawal amount.
- Validate account balance.

Handle:

- Invalid PIN
- Invalid Amount
- Insufficient Balance

Use multiple catch blocks.

---

### 7. Login Authentication System

Requirements:

- Store valid username and password.
- Compare with user input.
- Throw exception for invalid credentials.
- Display login success/failure message.

---

### 8. Custom InvalidAgeException

Create:

```java
class InvalidAgeException extends Exception
```

Requirements:

- Use in voting eligibility system.
- Throw when age < 18.
- Catch and display custom message.

---

### 9. Employee Salary Validation

Create:

```java
setSalary(double salary);
```

Requirements:

- Salary must be greater than 0.
- Throw exception otherwise.
- Handle exception gracefully.

---

### 10. Student Result Processing System

Requirements:

- Store marks of multiple students.
- Process marks one by one.
- Marks must be between 0 and 100.
- Invalid marks should throw exception.
- Continue processing remaining students.

---

## Concepts Practiced

- try-catch
- Multiple catch blocks
- throw keyword
- throws keyword
- Custom Exception
- Input Validation
- Exception Propagation
- Runtime Exceptions
- Checked Exceptions

## Topics Covered

- ArithmeticException
- ArrayIndexOutOfBoundsException
- Custom Exceptions
- User Input Validation
- Bank Withdrawal Validation
- ATM Simulation
- Login Authentication
- Salary Validation
- Student Marks Validation
- Exception Propagation

---

# Next Topic

**Lambda Expressions**