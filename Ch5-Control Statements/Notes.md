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



