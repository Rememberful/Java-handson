<h2><u>Introduction:</u></h2>

1. Java elements are interrelated (they work together).

<h2><u>Object-Oriented Programming</u></h2>

Object-Oriented Programming (OOP) is a programming concept where programs are built using objects that represent real-world things.

An object contains:

    a. Data (variables / properties)

    b. Methods (functions / behaviors)

<h2><u>Two Programming Paradigms:</u></h2>

1. Process-Oriented Model: Program organized around code (procedures/functions). Code acts on data.

2. Object-Oriented Model: Program organized around data (objects).Data controls access to code.

<h2><u>Abstraction:</u></h2>

1. It means hiding complex details and showing only essential features.

Example: A car is treated as one object without thinking about its internal parts.

2. Helps manage complexity in real-world systems and programs.

<h2><u>Four Pillars of OOPs:</u></h2>

    1. Encapsulation
    2. Abstraction
    3. Inheritance 
    4. Polymorphism

<h2><u>Polymorphism, Encapsulation, and	Inheritance	Work Together: </u></h2>

1. When combined, they create robust, scalable, reusable, and maintainable programs.
2. Inheritance enables code reuse and supports hierarchical classification.
3. Encapsulation protects data by exposing only the necessary interface
4. Polymorphism allows objects to respond differently to the same method call.

<h2><u>A First Simple Program: </u></h2>

1. In Java, a source file is officially called a compilation unit.

2. Java is case-sensitive.

3. A basic program:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
**Output:**

```
Hello, World!
```

4. Java is case-sensitive. It means Example ≠ example and main ≠ Main.

5. To	compile	the	Example	program, execute the	compiler,	javac,	specifying	the name of	the	source	file on	the	command	line and to	actually run	the	program, we	must use the Java application launcher called java:

![Description](images/image.png)

6. When	Java source	code is	compiled, each individual class	is put	into its own output	file named after the class and using the .class	extension.	

7. In above example 'Main' is an identifier that is the name of the class.

8. Java programs begin execution by calling main() method. If main() is missing, code will compile successfully but will not run.

<h2><u>A Second Short Program: </u></h2>

```java
public class Main2 {
    public static void main(String[] args) {
        int num; // this is declaration
        num = 20; // this is definition
        System.out.println(num);
        System.out.println(num*2); // * is used for multiplication
    }
}
```

**Output:**

```
20
40
```

1. Here Main2 is the class name. 

2. 'num' is the variable whose data type is 'int' and which is storing '20'.
