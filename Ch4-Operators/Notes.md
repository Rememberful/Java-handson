<h2><u>Introduction:</u></h2>

1. Operators in Java are special symbols that perform operations on one, two, or three operands and return a result.

<h2><u>Types of Operators in Java:</u></h2>

Java operators are broadly categorized into:
<ol type="a">
<li>Arithmetic Operators</li>
<li>Unary Operators</li>
<li>Assignment Operators</li>
<li>Relational Operators</li>
<li>Logical Operators</li>
<li>Ternary Operator</li>
<li>Bitwise & Shift Operators</li>
<li>instanceof Operator</li>
</ol>

They can also be classified by operands:
<Center>

| Type    | Operates On |
| ------- | ----------- |
| Unary   | 1 operand   |
| Binary  | 2 operands  |
| Ternary | 3 operands  |

</center>

<h2><u>Arithmetic Operators:</u></h2>

Used for mathematical calculations.
<Center>

| Operator | Meaning             |
| -------- | ------------------- |
| `+`      | Addition            |
| `-`      | Subtraction         |
| `*`      | Multiplication      |
| `/`      | Division            |
| `%`      | Modulus (remainder) |

</center>
Important Notes:
<ul>
<li>Works only on numeric types.</li>
<li>char can be used (treated as integer).</li>
<li>Integer division removes decimal part.</li>
<li>% works with both integers and floating-point numbers.</li></ul>

Example: The basic arithemetic operators

```java
public class BasicArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
```
## Output

```
a + b = 15
a - b = 5
a * b = 50
a / b = 2
a % b = 0
```

Example: The modulus operator, %, returns the remainder of a division operation.
```java
public class ModulusOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = a % b;
        System.out.println("a % b: " + c);

        float f1 = 24.09f;
        float f2 = 3f;
        float f3 = f1%f2;
        System.out.println("f1 % f2: " + f3);
    }
}
```
## Output

```
a % b: 0
f1 % f2: 0.09000015
```

Example: Arithmetic	Compound Assignment Operators

```java
public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        a = a+2; //valid
        System.out.println(a);
        a += 1; // same as a = a + 1;
        System.out.println(a);
        int b = 10;
        b *= 10;
        System.out.println(b);
    }
}
```
## Output

```
12
13
100
```

Increment & Decrement:  Prefix vs Postfix

| Type  | Behavior                        |
| ----- | ------------------------------- |
| `++x` | Increment first, then use value |
| `x++` | Use value first, then increment |

Example: pre-increment
```java
public class PreIncrement {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Value of a at start: "+ a);
        int b = ++a; 
        System.out.println("Value after using ++a (or b): " + b);
    }
}
```

## Output

```
Value of a at start: 0
Value after using ++a: 1
```

Example: Post-increment operator

```java
public class PostIncrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("value of a at start: " + a);
        int b = a++;
        System.out.println("Value of a after doing a++: "+ b);   
        System.out.println("The moment we used a, as it is storing the value now of a++: "+ a);   
    }
}
```

## Output

```
value of a at start: 10
Value of a after doing a++: 10
The moment we used a, as it is storing the value now of a++: 11
```

Example: Pre-decrement operator

```java
public class PreDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a: " + a);
        --a;
        System.out.println("Value of a, after doing --a: " + a);
    }
}
```
## Output

```
Value of a: 10
Value of a, after doing --a: 9
```

Example: Post-decremenet operator

```java
public class PosrDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Value of a original: " + a);
        int b = a--;
        System.out.println("Value of b: " + b); // b = a, as we didn't called b
        System.out.println("Value of a now is: " + a);
    }
}
```

## Output

```
Value of a original: 10
Value of b: 10
Value of a now is: 9
```

<h2><u>Unary Operators:</u></h2>

Operate on a single operand.

<Center>

| Operator | Meaning     |
| -------- | ----------- |
| `++`     | Increment   |
| `--`     | Decrement   |
| `+`      | Unary plus  |
| `-`      | Unary minus |
| `!`      | Logical NOT |
| `~`      | Bitwise NOT |

</center>

<h2><u>Assignment Operators:</u></h2>

Used to assign values.

Basic Assignment
```java
x = 1;
```
Compound Assignment

<center>

| Operator | Equivalent To              |                  |
| -------- | -------------------------- | ---------------- |
| `+=`     | x = x + value              |                  |
| `-=`     | x = x - value              |                  |
| `*=`     | x = x * value              |                  |
| `/=`     | x = x / value              |                  |
| `%=`     | x = x % value              |                  |
| `&=` `   | =` `^=` `<<=` `>>=` `>>>=` | Bitwise compound |
</center>

Chain Assignment:

```java
int x, y, z;
x = y = z = 100;
```
Assignment evaluates right to left.

<h2><u>Relational Operators:</u></h2>

Used for comparisons.

<center>

| Operator | Meaning               |
| -------- | --------------------- |
| `>`      | Greater than          |
| `<`      | Less than             |
| `>=`     | Greater than or equal |
| `<=`     | Less than or equal    |
| `==`     | Equal                 |
| `!=`     | Not equal             |

</center>

Key Points: 
<ul>
<li>Result is always boolean.</li>
<li>Used in if, while, loops.</li>
<li>== checks equality.</li>
<li>= is assignment.</li>
</ul>

<h2><u>Logical Operators:</u></h2>

Used with boolean values.

<center>

| Operator | Meaning               |
| -------- | --------------------- |
| && | Logical AND (short-circuit) |
| ! | Logical NOT  | 
| & | Boolean AND |
| ^ | Boolean XOR |

</center>

Best Practice

<ul>
<li>Use && and || for logical conditions.</li>
<li>Use & and | mainly for bitwise operations.</li>
</ul>

<h2><u>Ternary Operator ( ?: )</u></h2>

Shorthand for if-else.

Syntax: 

```java
condition ? expression1 : expression2;
```

Example:

```java
int max = (a > b) ? a : b;
```

Example: Nested 

```java
result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
```

<h2><u>Logical Operators:</u></h2>

Operate at the bit level.

Basic Bitwise Operators:

<center>

| Operator | Meaning               |
| -------- | --------------------- |
| & |AND |
| ^ | XOR |
| ~ | NOT(complement) |

</center>

Shift Operators:

<center>

| Operator | Meaning                      |
| -------- | ---------------------------- |
| `<<`     | Left shift                   |
| `>>`     | Right shift (sign preserved) |
| `>>>`    | Unsigned right shift         |

</center>

<h2><u>instanceof Operator</u></h2>

Used for type checking.

Syntax:
```java
object instanceof ClassName
```

Example
```
String str = "Hello";
str instanceof String  → true
```

Checks:
<ul>
<li>Class</li>

<li>Subclass</li>

<li>Interface</li>
</ul>

<h2><u>Operator Precedence in Java:</u></h2>

Operator precedence determines which operator is evaluated first when multiple operators appear in the same expression. 

-> Higher precedence operators are evaluated before lower precedence ones.

-> If two operators have the same precedence, then associativity decides the order of evaluation.

Java Operator Precedence (Highest → Lowest):

| Level | Operators                          | Associativity   |              |              |
| ----- | ---------------------------------- | --------------- | ------------ | ------------ |
| 1     | Postfix `expr++`, `expr--`         | Left → Right    |              |              |
| 2     | Unary `++ -- + - ~ !`              | Right → Left    |              |              |
| 3     | Multiplicative `* / %`             | Left → Right    |              |              |
| 4     | Additive `+ -`                     | Left → Right    |              |              |
| 5     | Shift `<< >> >>>`                  | Left → Right    |              |              |
| 6     | Relational `< > <= >= instanceof`  | Left → Right    |              |              |
| 7     | Equality `== !=`                   | Left → Right    |              |              |
| 8     | Bitwise AND `&`                    | Left → Right    |              |              |
| 9     | Bitwise XOR `^`                    | Left → Right    |              |              |
| 10    | Bitwise OR `                       | `               | Left → Right |              |
| 11    | Logical AND `&&`                   | Left → Right    |              |              |
| 12    | Logical OR `                       |                 | `            | Left → Right |
| 13    | Ternary `?:`                       | Right → Left    |              |              |
| 14    | Assignment `= += -= *= /= %= &= ^= | = <<= >>= >>>=` | Right → Left |              |


Associativity:

Left-to-Right (Most Operators)
```java
int result = 20 / 5 * 2;
```
Right-to-Left (Assignment & Unary)
```java
int a, b, c;
a = b = c = 10;
```

Parentheses Override Precedence: Parentheses () increase precedence.

```java
int result = (10 + 5) * 2;
```
