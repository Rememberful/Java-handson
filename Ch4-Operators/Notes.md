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







