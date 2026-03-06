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

Example: condition is false in while loop

```java
//condition is false in while loop
public class Example5_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while(i>5){
            System.out.println(i);
        }
    }
}
```

## Output

```
-> No output as 0>5 is not true
```

Example: counter variable

```java
public class Example6_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            System.out.println("Value of i: "+ i);
            i++;
        }
    }
}
```

##Output

```
Value of i: 0
Value of i: 1
Value of i: 2
Value of i: 3
Value of i: 4
Value of i: 5
```

Example: another example of counter variable

```java
public class Example6_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            i++;
            System.out.println("Value of i: "+ i);
        }
    }
}
```

## Output

```
Value of i: 1
Value of i: 2
Value of i: 3
Value of i: 4
Value of i: 5
Value of i: 6
```

Example: while loop with 'break'

```java
public class Example7_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            System.out.println(i);
            break;
        }
    }
}
```

## Output

```
0
```
Example: 'break' before any other code

```java
public class Example7_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=5) {
            break;
            System.out.println(i);
        }
    }
}
```

## Output

```
Example7_whileloop.java:6: error: unreachable statement
            System.out.println(i);
            ^
1 error
```

Example: Keep in mind that code below the while loop executes when the while loop ends

```java
public class Example8_whileloop {
    public static void main(String[] args) {
        int i = 5;
        while (i>=0) {
            System.out.println(i);
            i--;
        }
        System.out.println("Hey");
    }
}
```

## Output

```
5
4
3
2
1
0
Hey
```

Example: decremented loop

```java
public class Example8_whileloop {
    public static void main(String[] args) {
        int i = 5;
        while (i>=0) {
            System.out.println(i);
            i--;
        }
    }
}
```

## Output

```
5
4
3
2
1
0
```

Example: Print numbers from 1 to n

```java
// Print from 1 to n
public class Example9_whileloop {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while (i<=n) {
            System.out.println(i);
            i++;
        }
        System.out.println("Now i: "+ i);
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
Now i: 6    
```

Example: Print Even Numbers from 1 to 10

```java
// Print Even Numbers from 1 to 10
public class Example10_whileloop {
    public static void main(String[] args) {
        int i = 2;
        while (i<=10) {
            System.out.println(i);
            i = i+2; // or i+=2
        }
    }
}
```

## Output

```
2
4
6
8
10
```

Example: Print Odd Numbers from 1 to 10

```java
public class Example10_whileloop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i = i+2; // or i+=2
        }
    }
}
```

## Output

```
1
3
5
7
9
```

Example: Print Table of a Number

```java
public class Example11_whileloop {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
```

## Output

```
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

Example: Sum of Numbers from 1 to 10

```java
public class Example12_whileloop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=10){
            sum = sum + i;
            i++;
        }
        System.out.println("i is: "+ i);
        System.out.println("Sum: "+ sum);

    }
}
```

## Output

```
i is: 11
Sum: 55
```

Example: Count Numbers from 1 to N

```java
public class Example13_whileloop {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        while (i<=n) {
            System.out.println(i);
            i++;
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
```

Example: Print Squares of Numbers

```java
public class Example14_whileloop {
    public static void main(String[] args) {
        int i = 1;
        while (i<=5) {
            System.out.println("Square of " + i + " is "+ (i*i));
            i++;
        }
    }
}
```

## Output

```
Square of 1 is 1
Square of 2 is 4
Square of 3 is 9
Square of 4 is 16
Square of 5 is 25
```

Example: Print Characters Multiple Times

```java
public class Example15_whileloop {
    public static void main(String[] args) {
        int i = 0;
        while(i<=3){
            System.out.println("Aditya");
            i++;
        }
    }
}
```

## Output

```
Aditya
Aditya
Aditya
Aditya
```

Example: Count Digits Using While Loop

```java
public class Example16_whileloop {
    public static void main(String[] args) {
        int num = 1000;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Digits = " + count);
    }
}
```

## Output

```
Digits = 4
```

Example: Factorial

```java
import java.util.Scanner;

public class Example17_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //logic
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
```
## Output

```
Enter a number: 
3
Factorial of 3 is: 6
```

Example: Reverse number

```java
import java.util.Scanner;

public class Example18_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;        // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;              // remove last digit
        }
        System.out.println("Reversed number: " + reverse);
    }
}
```

## Output

```
Enter a number: 
123
Reversed number: 321
```

Example: Palindrome number

```java
import java.util.Scanner;

public class Example19_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is not a Palindrome.");
        }
    }
}
```

## Output

```
Enter a number: 34543
The number is a Palindrome.
```
Example: Sum of digits

```java
import java.util.Scanner;

public class Example20_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //logic
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;   // get last digit
            sum = sum + digit;     // add digit to sum
            num = num / 10;        // remove last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}
```

## Output

```
Enter a number: 123
Sum of digits: 6
```
Example: Count digits

```java
import java.util.Scanner;

public class Example21_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        while (num != 0) {
            num = num / 10;   // remove last digit
            count++;          // increase count
        }
        System.out.println("Number of digits: " + count);
    }
}
```

## Output

```
Enter a number: 1234
Number of digits: 4
```
Example: Fibonacci series

```java
import java.util.Scanner;

public class Example22_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        //logic
        int first = 0, second = 1;
        int count = 0;
        while (count < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}
```

## Output

```
Enter number of terms: 5
0 1 1 2 3 
```
7️⃣ Armstrong number
8️⃣ Largest digit in a number
9️⃣ Product of digits
🔟 Power of a number