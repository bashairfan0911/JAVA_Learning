# 📘 Methods and Functions in Java

<details>
<summary>📑 Table of Contents</summary>

- [1️⃣ Definition](#1️⃣-definition)
- [2️⃣ Syntax](#2️⃣-syntax)
- [3️⃣ Returning Values and Parameters](#3️⃣-returning-values-and-parameters)
  - [a) Returning a Value](#a-returning-a-value)
  - [b) Returning a String](#b-returning-a-string)
  - [c) Parameters (Integer Function)](#c-parameters-integer-function)
  - [d) Parameters (String Function)](#d-parameters-string-function)
  - [e) Pass by Value](#e-pass-by-value)
- [4️⃣ Scope](#4️⃣-scope)
- [5️⃣ Types of Scope](#5️⃣-types-of-scope)
  - [🔹 Method Scope](#-method-scope)
  - [🔹 Block Scope](#-block-scope)
  - [🔹 Loop Scope](#-loop-scope)
- [6️⃣ Shadowing](#6️⃣-shadowing)
- [7️⃣ Variable Arguments (Varargs)](#7️⃣-variable-arguments-varargs)
- [8️⃣ Method Overloading](#8️⃣-method-overloading)
- [✅ Key Points](#-key-points)

</details>

---

## 1️⃣ Definition
- **Method/Function**: A block of code that performs a specific task, can be called multiple times, and improves code reusability.  
- In Java, **all functions are called methods** since they are defined inside classes.

---

## 2️⃣ Syntax
```java
returnType methodName(parameters) {
    // method body
    return value; // optional
}
```

**Example:**
```java
int add(int a, int b) {
    return a + b;
}
```

---

## 3️⃣ Returning Values and Parameters

### a) Returning a Value
```java
int square(int n) {
    return n * n;
}
```

### b) Returning a String
```java
String greet() {
    return "Hello, World!";
}
```

### c) Parameters (Integer Function)
```java
int multiply(int a, int b) {
    return a * b;
}
```

### d) Parameters (String Function)
```java
String welcome(String name) {
    return "Welcome, " + name;
}
```

### e) Pass by Value
- In Java, **arguments are always passed by value** (copy of the variable is passed).  

```java
void changeValue(int x) {
    x = 100;  // affects only local copy
}
```

---

## 4️⃣ Scope
- **Scope**: The region of code where a variable is accessible.

---

## 5️⃣ Types of Scope

### 🔹 Method Scope
- Variable declared inside a method → accessible only within that method.

### 🔹 Block Scope
- Variable declared inside `{ }` (like if/else) → exists only inside that block.

### 🔹 Loop Scope
- Variable declared inside a loop → accessible only inside the loop.

**Example:**
```java
void testScope() {
    int x = 10; // method scope
    if (x > 5) {
        int y = 20; // block scope
        System.out.println(y);
    }
    for (int i = 0; i < 5; i++) {
        System.out.println(i); // loop scope
    }
}
```

---

## 6️⃣ Shadowing
- When a local variable **has the same name** as a class/outer scope variable.

```java
int x = 50; // class variable

void show() {
    int x = 10; // shadows class variable
    System.out.println(x); // prints 10 (local)
}
```

---

## 7️⃣ Variable Arguments (Varargs)
- Allows passing a **variable number of arguments** to a method.

```java
int sum(int... numbers) {
    int total = 0;
    for (int n : numbers) {
        total += n;
    }
    return total;
}

// Usage
sum(1, 2, 3);        // returns 6
sum(5, 10, 15, 20);  // returns 50
```

---

## 8️⃣ Method Overloading
- Defining **multiple methods with the same name** but different parameter lists.

```java
int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}

String add(String a, String b) {
    return a + b;
}
```

---

## ✅ Key Points
- Methods increase **code reusability** and **readability**.  
- Java methods support **parameters, return values, varargs, overloading, and scoping rules**.  
- Always remember: **Java is pass-by-value**, not pass-by-reference.  

---
