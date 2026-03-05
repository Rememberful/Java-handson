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
Example: nested ifs with else.

```java
public class Example2_nestedifs {
    public static void main(String[] args) {
        int marks = 85;
        if (marks >= 50) {
            if (marks >= 75) {
                System.out.println("Distinction");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("Fail");
        }
    }
}
```

## Output

```
Distinction
```

7. switch statement: it executes a block of code based on the value of an expression.

Syntax:

```java
switch(expression){ 
    case value1:
        //statements
        break; //optional, but recommended
    case value2:
        //statements
        break;
    default: //optional
        //default statements
}
```

Example: basic example of switch statement.

```java
public class Example_statement {
    public static void main(String[] args) {
        int a = 10;
        switch(a){
            case 2:
                System.out.println("2");
                break;
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Default");
        }
    }
}
```

## Output

```
10
```

Example: switch without break (Fall-through)

```java
public class Example2_switch {
    public static void main(String[] args) {
        int a = 10;
        switch(a){
            case 2:
                System.out.println("2");
            case 5:
                System.out.println("5");
            case 10:
                System.out.println("10");
            default:
                System.out.println("Default");
        }
    }
}
```

## Output

```
10
Default
```

Example: switch with few breaks

```java
public class Example3_switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("10");
            case 11:
                System.out.println("11");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
```

## Output

```
10
11
```

Example: default can be at any place.

```java
public class Example3_switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("10");
            default:
                System.out.println("Default");
                break;
            case 11:
                System.out.println("11");
                break;   
        }
    }
}
```

## Output

```
10
Default
```

Example: duplicate cases are not allowed.

```java
public class Example4_switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
```

## Output

```
Example4_switch.java:8: error: duplicate case label
            case 10:
            ^
1 error
```

Example: nested switch

```java
public class Example5_switch {
    public static void main(String[] args) {
        int year = 2;
        String branch = "CSE";

        switch (year) {
            case 2:
                switch (branch) {
                    case "CSE":
                        System.out.println("Machine Learning");
                        break;
                    case "ECE":
                        System.out.println("Antenna Engineering");
                        break;
                }
        }
    }
}
```

## Output

```
Machine Learning
```

Example: char in switch

```java
public class Example5_switch {
    public static void main(String[] args) {
        char branch = 'a';

        switch (branch) {
            case 'a':
                System.out.println("Machine Learning");
                break;
            case 'b':
                System.out.println("Antenna Engineering");
                break;
        }
    }
}
```

## Output

```
Machine Learning
```

Example: new switch expression

```java
public class Example6_switch {
    public static void main(String[] args) {
        int day = 2;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid";
        };
        System.out.println(result);
    }
}
```

## Output

```
Tuesday
```

Example: another 

```java
public class Example7_switch {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 2 -> System.out.println("HEY");
        }
    }
}
```

## Output

```
HEY
```

Example: Multiple Cases in One Line

```java
public class Example8_switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 9:
                System.out.println("Yes");
            case 10, 11:
                System.out.println("Hey");
                break;
            default:
                System.out.println("Bye");
                break;
        }
    }
}
```

## Output

```
Hey
```

<h2><u>Iteration Statements:</u></h2>

1. Loops are used to execute a block of code repeatedly until a specified condition becomes false.

2. Java provides three main loop statements:

<ol type="i">
<li>while loop</li>
<li>for loop</li>
<li>do-while loop</li>
</ol>
These are called iteration statements because they repeat a set of instructions.

<h2><u>while loop:</u></h2>

1. It repeatedly executes a block of code as long as a specified condition remains true.

Syntax:
```java
while (condition) {
    // code block
}
```

How it work:
<ol type="a">
  <li>The condition is evaluated first.</li>
  <li>If the condition is true, the loop body executes.</li>
  <li>After execution, the condition is checked again.</li>
  <li>The loop continues until the condition becomes false.</li>
  <li>When false, control moves to the next statement after the loop.</li>
</ol>

Example: a basic example of while loop

```java
// Printing from 0 to 5
public class Example_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            System.out.println(i);
            i++;
        }
    }
}
```

## Output

```
0
1
2
3
4
5
```

Example: Another example of while loop, but this time with bit change

```java
// Printing from 1 to 6, where i is started as 0.
public class Example2_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            i++; //first do i++ then print in below line
            System.out.println(i);
        }
    }
}
```

## Output

```
1
2
3
4
5
6
```

Example: infinite loop

```java
public class Example3_whileloop {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hey");
        }
    }
}
```

## Output

```
Hey
Hey
Hey
.
.
.
(infinite)
```

Example: using < instead of <= in while loop

```java
public class Example4_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        }
    }
}
```

## Output

```
0
1
2
3
4
```

Example: 
