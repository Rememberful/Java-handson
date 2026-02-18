<h2><u>Introduction:</u></h2>

1. This chapter discussed about data types, variables and arrays.

<h2><u>Java Is a Strongly Typed Language:</u></h2>

1. Java is a strongly typed language, meaning every variable and expression has a clearly defined type.

2. The compiler strictly checks all assignments and method parameter passing for type compatibility. Java does not allow automatic type coercion between incompatible types.

<h2><u>The Primitive Types:</u></h2>

1. Java defines eight primitive (simple) data types: byte, short, int, long, char, float, double, and boolean.

2. These are grouped into four categories:
<ul>
<li>Integers: byte, short, int, long (whole numbers)
<li>Floating-point numbers: float, double (decimal numbers)
<li>Characters: char (single character symbols)
<li>Boolean: boolean (true/false values)
</ul>

3. Primitive types represent single values, not objects.

4. int is always 32 bits.

<h2><u>Integers:</u></h2>

1. Java	defines	four integer types:	byte, short, int, and long.

2. All four types:
<ul><li>Store positive and negative values </li>
<li>Are signed </li></ul>

3. Java does NOT support unsigned integer types (like C/C++ do).

4. Size (Width) Is Fixed - For Portability:

<center>

| Type    | Size    | Range             |
|---------|---------|-------------------|
| `byte`  | 8 bits  | -128 to 127       |
| `short` | 16 bits | -32,768 to 32,767 |
| `int`   | 32 bits | -2³¹ to 2³¹-1     |
| `long`  | 64 bits | -2⁶³ to 2⁶³-1     |
</center>

5. 1 byte = 8 bits

<h2><u>byte:</u></h2>

1. byte is an 8-bit signed primitive data type in Java used for memory-efficient storage of small integers and raw binary data, but arithmetic operations promote it to int.

2. Default value: 0.

3. 1 bit is used for the sign.

4. Range formula for n bits:

$$
-2^{n-1} \text{ to } 2^{n-1} - 1
$$

For 8 bits → -128 to 127.

5. Syntax:

```java
byte b;
byte b, c;
byte num = 100;
```
6. Arithmetic operations promote byte to int.

7. byte does not throw an error on overflow. It wraps aroud.
```java
byte b = 127;
b++;   // becomes -128
```
Because of two’s complement representation.

<h2><u>short:</u></h2>

1. short is a 16-bit signed primitive data type in Java used for memory-efficient storage of small integers, but arithmetic operations promote it to int.

2. Default value: 0.

3. Range formula for n bits:

$$
-2^{n-1} \text{ to } 2^{n-1} - 1
$$

4. Syntax:
```java
short s;
short t;
short num = 1000;
```

5. Java automatically promotes smaller integer types (byte, short) to int during arithmetic.

6. short does not throw an error on overflow.
```java
short s = 32767;
s++;   // becomes -32768
```
Because of two’s complement representation.

<h2><u>int:</u></h2>

1. Its size is 32-bit and Signed.

2. Default Value: 0 (for instance and static variables)

3. Range formula for n bits:

$$
-2^{n-1} \text{ to } 2^{n-1} - 1
$$

4. int → stays int during arithmetic.

5. Syntax:

```java
int i1;
int i2, i3;
```
<h2><u>long:</u></h2>

1. 64 bit and signed.

2. Default Value: 0L

3. Range formula for n bits:

$$
-2^{n-1} \text{ to } 2^{n-1} - 1
$$

4. Syntax:

```java
long l1;
long population = 8000000000L;
```

<h2><u>Floating-Point Types:</u></h2>

Floating-point types are used when:
<ul>
<li>Decimal values are required
<li>Fractional precision is needed
<li>Mathematical functions like sqrt(), sin(), cos() are used
</ul>

<h2><u>Types of Floating-Point Data in Java</u></h2>

Java provides two floating-point types:

| Type   | Size    | Precision              | Range (Approximate)                  |
|--------|---------|------------------------|--------------------------------------|
| float  | 32 bits | ~6–7 decimal digits    | ±1.4E−45 to ±3.4E38                  |
| double | 64 bits | ~15–16 decimal digits  | ±4.9E−324 to ±1.8E308                |

<h2><u>float:</u></h2>

1. 32-bit single-precision and Follows IEEE 754 format.

2. Example:
```java
float highTemp, lowTemp;
float price = 19.99f; // f is compulsory!
```

3. Default value: 0.0f

<h2><u>double:</u></h2>

1. 64-bit double-precision and default floating-point type in Java.

2. Example:
```java
double radius = 10.0;
double area = Math.PI * radius * radius;
```
3. Decimal literals are double by default:
```java
double x = 5.5;  // Correct
```

3. Default value: 0.0d

<b>Note:</b> <br>

1. In Java:
<ul><li>All decimal numbers are double by default</li>
<li>You must explicitly use f for float, while for double d is optional</li></ul>

2. Floating types can store Infinity, -Infinity, and NaN, but other primitive integers cannot.

<h2><u>Characters:</u></h2>

1.  char is used to store a single character in Java.

2. Java uses unicode to represent characters.

3. Keep in mind:

<ul>
<li> Size: 16 bits (2 bytes)</li>
<li> Range: 0 to 65,535 </li>
<li> No negative values (unsigned type)</li>
</ul>

4. Syntax:

```java
char ch1 = 'Y';
char ch2 = 88; // ACII values of 'X'
```
5. char can participate in arithmetic operations.
Example:
```java
char ch1 = 'X';
ch1++;
```

**Output:**

```
Y
```

6. Default (if char is a class variable): '\u0000' (null character)

<h2><u>Boolean:</u></h2>

1. boolean is a primitive data type in Java.

2. It can store only two values: true and false

3.  boolean values are used in control statements:
<ul>
<li>if </li>
<li>for </li>
<li>while </li>
<li>do-while </li>
</ul>

4. Instance boolean variables <u> default to: false. </u> While local boolean variables must be initialized manually.

5. Syntax:
```java
boolean b = true;
boolean c = false;
```

6. Boolean Cannot Be Converted to int
```java
int x = true; //Error
```

7. Short-Circuit Evaluation

<ul>
<li>&& and || are short-circuit operators. </li>
<li>Java stops evaluating once the result is determined. </li>
</ul>
Example:

```java
if (false && someMethod()) {
    // someMethod() will NOT execute
}
```

<h2><u>A Closer Look at Literals:</u></h2>

1. A literal is a value that you type directly into your program.
Example:
```java
int x = 10;
```
Here: 10 is a literal.

2. Types of Literals in Java

<ol type="a"><li>Integer Literals : int a = 100;</li>
<li>Floating-Point Literals : float f = 3.14f;</li>
<li>Character Literals : char ch = 'A';</li>
<li>String Literals : String name = "John";</li>
<li> Boolean Literals : boolean b = true;</li>
<li> Null Literal : String s = null;</li>
</ol>

<b>Note:</b> null is not 0 — it means no reference

<h2><u>Integer Literals:</u></h2>

1. An integer literal is any whole number value.Examples: 1, 2, 3, 42. By default, integer literals are decimal (base 10).

2. By default, integer literals are of type int

3. Underscores in Integer Literals are used to improve readability. Compiler ignores underscores.
Example:
```java
int x = 123_456_789;
```

4. Java is strongly typed:
<ul><li>Every literal has a type.</li>
<li>Type checking happens at compile time.</li>></ul>

5. 09  and 08 causes a compile-time error because numbers with a leading zero are treated as octal in Java, and octal numbers only allow digits from 0 to 7. It means:
These are NOT allowed in Java:
```java
int x = 09;   // Compile-time error -> so not allowed
int y = 08;   // Compile-time error -> so not allowed
```