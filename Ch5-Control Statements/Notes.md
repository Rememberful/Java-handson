<h2><u>Introduction:</u></h2>

1. Control statements manage the flow of execution in a program.

2. Java control statements are divided into three categories:
<ol type = "i">
<li>Selection Statements</li>
<li>Iteration Statements</li>
<li>Jump Statements</li>
</ol>

<h2><u>Selection Statements:</u></h2>

1. Selection statements are also called branching / conditional / decision-making statements. They control the flow of execution based on conditions at runtime.

2. Java supports two main selection statements: `if` and `switch`.

3. if Statement: Used to execute a block only if condition is true.

Syntax:
```java
if(condition){ // with braces
    statement;
}

// or
if(condition) // without braces Only one statement runs after if unless {} block is used.
    statement;
```
Condition must return a boolean value. else is optional.

Example: basic example of if statement.

```java
public class Example_If {
    public static void main(String[] args) {
        int a = 10;
        if(a>5){
            System.out.println("a is greater than 5");
        }
    }
}
```

## Output

```
a is greater than 5
```

Example: if statement without braces

```java
public class Example2_if {
    public static void main(String[] args) {
        int a = 10;
        if(a>5)
            System.out.println("a is greater than 5");
    }
}
```

## Output

```
a is greater than 5
```

Example: another example of if statement without braces

```java
public class Example2_if {
    public static void main(String[] args) {
        int a = 2;
        if(a>5)
            System.out.println("a is greater than 5"); // considered in if statement
            System.out.println("Aditya"); // not considered in if statement 
    }
}
```

## Output

```
Aditya
```

4. if-else statement: else statement runs a block if condition is false.

Syntax:

```java
if (condition) {
    //statement1;
} else {
    //statement2;
}
```

Example: a basic example of if-else

```java
public class Example_ifelse {
    public static void main(String[] args) {
        int a = 10;
        if(a<5){
            System.out.println("a is less than 5.");
        } else{
            System.out.println("a is more than 5.");
        }
    }
}
```

## Output

```
a is more than 5.
```

Example: another example of if-else, without braces

```java
public class Example2_ifelse {
    public static void main(String[] args) {
        int a = 10;
        if(a>5)
            System.out.println("hey");
        else 
            System.out.println("why");
            System.out.println("tes");
        System.out.println("Yeyey");
    }
}
```

## Output

```
hey
tes
Yeyey
```

5. if-else if statement: The if-else if statement is used for decision making when you need to check multiple conditions.

Syntax:

```java
if(condition1){
    // code block if condition 1 is true
} else if(condition2){
    // code block if condition 2 is true
} else if(condition3){
    // code block if condition 3 is true
} else {
    // this block can be optional
}
```

Example: a basic example of if-else if.

```java
public class Example_ifelseif {
    public static void main(String[] args) {
        int a = 10;
        if(a>10){
            System.out.println("a > 10");
        } else if (a<10) {
            System.out.println("a < 10");
        } else{
            System.out.println("a = 10");
        }
    }
}
```

## Output

```
a = 10
```

Example: if-else if without braces

```java
public class Example2_ifelseif {

    public static void main(String[] args) {
        int a = 10;
        if (a > 10) 
            System.out.println("a > 10");
        else if (a < 10) 
            System.out.println("a < 10");
        else 
            System.out.println("a = 10");   
    }
}
```

## Output

```
a = 10
```

Example: else block is optional

```java
public class Example3_ifelseif {
    public static void main(String[] args) {
        int a = 10;
        if (a > 10) {
            System.out.println("Bye");
        } else if (a <10) {
            System.out.println("Hey");
        }
        System.out.println("Yes");
    }   
}
```

## Output

```
Yes
```

6. Nested ifs: 'if' inside another 'if'.

Syntax:

```java
if(condition 1){
    if(condition 2){
        //code 
    }
}
```

Example: a basic example of nested ifs.

```java
public class Example_nestedifs {
    public static void main(String[] args) {
        int a = 10;
        if (a>=10) {
            System.out.println("Bye");
            if(a==100){
                System.out.println("Hey");
            }
        }
    }
}
```

## Output

```
Bye
```

Example: another example of nested ifs

```java
public class Example_nestedifs {
    public static void main(String[] args) {
        int a = 10;
        if (a>=10) {
            System.out.println("Bye");
            if(a==10){
                System.out.println("Hey");
            }
        }
    }
}
```

## Output

```
Bye
Hey
```

