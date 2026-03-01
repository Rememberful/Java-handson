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
<li>Type checking happens at compile time.</li></ul>

5. 09  and 08 causes a compile-time error because numbers with a leading zero are treated as octal in Java, and octal numbers only allow digits from 0 to 7. It means, 
these are NOT allowed in Java:
```java
int x = 09;   // Compile-time error -> so not allowed
int y = 08;   // Compile-time error -> so not allowed
```
<h2><u>Floating-Point Literals:</u></h2>

1. Represent numbers with a fractional (decimal) part. Examples: 0.2, 2.0, 3.4566

2. Floating-point literals default to double. double = 64-bit and float = 32-bit.

3. Compiler ignores underscores in floating point literals.
```java
double num = 9_423_497_862.0;
double num = 9_423_497.1_0_9;
```

4. Both are correct:
```java
float x = 3.14F; //as 3.14 is double by default
float y = (float) 3.14;
```

<h2><u>Boolean Literals:</u></h2>

1. Boolean literals represent logical values. Only two possible values: true, false.

2. Java does not automatically convert boolean to numeric types. true is NOT equal to 1 and false is NOT equal to 0.

3. boolean is a primitive data type, and its size is JVM dependent.

<b>Note:</b> 
In Java, whole-number literals default to int, and floating-point literals (numbers with a decimal point or exponent) default to double.

<h2><u>Character Literals:</u></h2>

1. Represent a single character. Written inside single quotes: 'a', 'z', 'e'.

2. Escape Sequences (Very Important). Used for characters that cannot be typed directly.

<center>

| Escape | Meaning         |
|--------|-----------------|
| `\'`   | Single quote    |
| `\"`   | Double quote    |
| `\\`   | Backslash       |
| `\n`   | New line        |
| `\t`   | Tab             |
| `\r`   | Carriage return |
| `\b`   | Backspace       |
| `\f`   | Form feed       |

</center>
<h2><u>String Literals:</u></h2>

1. String Literals: A sequence of characters enclosed in double quotes " ".

2.  String literals cannot break across lines. 
Example:
```java
"Hello
World" //not allowed
```

3. In Java, strings are not character arrays. They are objects of the class - String.

4. String is a reference type. It is not a primitive like int, char, or boolean.

5. String Pool. When we write:
```java
String s1 = "Hello";
String s2 = "Hello";
```
<ul>
<li>Only one object is created.

<li>Stored in the String Constant Pool.

<li>s1 and s2 reference the same object.
</ul>
6. Strings in Java are immutable.

<h2><u>Variables:</u></h2>

1. A variable is the basic unit of storage in a Java program. It is used to store data that can be changed during program execution.

2. A Java variable consists of:
<ul>
<li>Identifier (name)</li>
<li>Type (kind of data)</li>
<li>Optional initializer (starting value)</li>
</ul>

<h2><u>Declaring a Variable in Java:</u></h2>

1. In Java, all variables must be declared before they are used.

2. Declaration tells the compiler:
<ul>
<li>The type of data the variable will store</li>
<li>The name (identifier) of the variable</li>
</ul>

3. Syntax:
```java
type identifier [= value] [, identifier [= value] …];
```
4. Examples of Variable Declarations:
<ol type="a"><li>Single Variable (Without Initialization)

```java
int age;
double salary;
```
</li>
<li> Single Variable (With Initialization)

```java
int age = 25;
double salary = 50000.50;
```
</li>

<li>Multiple Variables of Same Type

```java
int x, y, z;
int a = 5, b = 10, c = 15;
```
</li>
</ol>
<h2><u>Dynamic Initialization:</u></h2>

1. This means a variable can be initialized using any valid expression at the time it is declared. The initializer does not have to be a constant value.

2. Dynamic initialization happens at runtime.

3. Dynamic initialization means assigning a value to a variable using an expression that is evaluated at runtime, rather than using a fixed constant.

4. Dynamic Initialization:

```java
int a = 5;
int b = 10;
int sum = a + b;   // Dynamic initialization
```

<h2><u>The Scope and Lifetime of Variables:</u></h2>

1. A scope defines where a variable is visible (accessible) in a program. A scope is created by a block.

2. A block begins with { and ends with }. Every time you create a new block, you create a new scope.

3. Types of Scope in Java:

<ol type="a"><li> Class scope → variables declared inside a class </li>
<li> Method scope → variables declared inside a method </li>
</ol>

4. A method’s scope:Begins at its opening { and Ends at its closing }

5. Local variables: A variable declared inside a block is called a local variable. They are only accessible inside the block where they are declared. Cannot be accessed outside that block.
Example:
```java
public static void main(String[] args) {
    int x = 10;

    if (x > 5) {
        int y = 20;
        System.out.println(x); // OK
        System.out.println(y); // OK
    }

    // System.out.println(y); // ERROR: y not visible here
}
```

Example showing basic of local variable:
```java
public class Main {
    public static void main(String[] args) {
        int n = 10; // n is local variable
        System.out.println(n);
    }
}
```

Example showing concept "They are only accessible inside the block where they are declared.":

```java
public class Main2 {
    public static void main(String[] args) {
        if(true){
            int n = 10;
            System.out.println(n);
        }
        System.out.println(n); // n is not accessible here
    }
}
```
6. Scopes can be nested (a block inside another block).
<ul><li>
Outer scope → encloses inner scope</li>
<li>Inner scope → inside outer scope</li>
</ul>

Rule:
<ul><li>
Inner scope can access variables from outer scope.
</li><li>
Outer scope cannot access variables declared in inner scope.
</li>
</ul>

7. You cannot use a variable before declaring it.
```java
count = 100; // ERROR
int count;
```
8. The lifetime of a variable: Begins when its scope is entered, Ends when its scope is exited.

9. cannot declare a variable in an inner block with the same name as a variable in an outer block. 

```java
int x = 10;

if (x > 5) {
    int x = 20; // ERROR: duplicate variable name
}
```

Although, it can be done for method scope.

10. Example for rule: Inner scope can access variables from outer scope.

```java
public class Main3 {
    public static void main(String[] args) {
        int outerVar = 10; // outer scope

        if (outerVar > 5) {  // inner scope
            System.out.println(outerVar); // Accessible
        }
    }
}
```

11. Example for rule: Outer scope cannot access variables declared in inner scope.

```java
public class Main4 {
    public static void main(String[] args) {
        if (true) {  // inner scope
            int innerVar = 20;
            System.out.println(innerVar); // Accessible here
        }
        // System.out.println(innerVar); // ERROR! Not accessible
    }
}
```

<h2><u>Type Conversion and Casting:</u></h2>

1. Type Conversion (Implicit / Automatic Conversion): Type conversion is the automatic conversion of one data type into another when the types are compatible.

<ol type="a">
<li>Also called Widening Conversion
<li>Done automatically by Java
<li>No data loss
<li>Smaller data type → Larger data type
</ol>

<b>Order of Widening:</b> <i>byte → short → int → long → float → double</i>

Example:
```java
int num = 100;
long bigNum = num;   // int automatically converted to long
float f = 10;  // int automatically converted to float
```

2. Type Casting (Explicit Conversion): Type casting is the manual conversion of one data type into another when the types are not compatible.

<ol type="a">
<li>Also called Narrowing Conversion
<li>Must be done explicitly by programmer
<li>May cause data loss
<li>Larger data type → Smaller data type
</ol>

Syntax:
```java
dataType variable = (dataType) value;
```

Example:
```java
double d = 10.75;
int i = (int) d;   // Explicit casting
```

Note: <br>
byte → short → int → long → float → double
char → int → long → float → double

<h2><u>Automatic Type Promotion in Expressions:</u></h2>

1. byte, short, char → promoted to int in arithmetic expressions

2. int → long if combined with long; smaller → larger type promotion applies

3. Mixed types follow widening rules: smaller → larger

4. Always cast back if storing in smaller type: (byte)(expression)

<h2><u>Arrays:</u></h2>

1. An array  is a  group of variables of the same type accessed using a common name.

2. Arrays can be of any data type and can be of one or more dimensions.

3. Individual elements are accessed using an index.

<h2><u>One-Dimensional Arrays:</u></h2>

1. A one-dimensional array is essentially a list of like-typed variables. Each element in the array is of the same type (element type or base type).

2. Declaration of Arrays:
General Form:

```java
type arrayName[];
```

Example:
```java
int month_days[];
```

Declares month_days as an array of integers, but does not create actual storage yet.

3. Dynamic Allocation Using new:Arrays in Java must be dynamically allocated after declaration. General form:
```java
arrayVar = new type[size];
```

Example:
```java
month_days = new int[12];
```
Allocates memory for 12 integers and links them to month_days.

4. Two-step process to create an array:
<ol type="a"><li>
Declare the array variable.</li>
<li>Allocate memory with new and link it to the variable.</li>
</ol>

5. Arrays can also be declared and allocated in one step:
```java
int month_days[] = new int[12];
```

6. Accessing Array Elements-> Use indexing to access elements:
```java
arrayVar[index]
```
Example:
```java
month_days[1] = 28;      // assigns 28 to second element
System.out.println(month_days[3]); // prints 4th element
```

7. Arrays can be initialized at declaration using curly braces {}:
Example:
```java
int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
```
8. Attempting to access elements outside valid range causes a runtime error.

9. Default initialization depends on element type (numeric → 0, boolean → false, reference → null).

10. 1D Array Creation – Methods

<ol type="a">
<li>Two-Step Declaration and Allocation

Step 1 – Declare the array variable:
```java
int numbers[];  // Declare array of integers
```
Step 2 – Allocate memory using new:
```java
numbers = new int[5];  // Allocate array with 5 elements
```
</li>

<li>Declaration and Allocation in a Single Step

```java
int numbers[] = new int[5];  // Declare and allocate together
```
</li>

<li>Declaration with Initialization (Array Initializer)

```java
int numbers[] = {10, 20, 30, 40, 50};
```
</li>

<li> Using new with Initialization

```java
int numbers[] = new int[] {10, 20, 30, 40, 50};
```
</li>

<li>
Declaring Array Without Specifying Size (Later Allocation)

```java
int numbers[];
// Memory allocation done later
numbers = new int[10];
```
</li>
</ol>

11. Default values: Default values apply only when memory is allocated using new.

<ol type="i">
<li>Numeric Types

| Data Type | Default Value |
|-----------|---------------|
| byte      | 0             |
| short     | 0             |
| int       | 0             |
| long      | 0L            |
| float     | 0.0f          |
| double    | 0.0           |
| char      | `\u0000` (null character) |

**Example:**
```java
int numbers[] = new int[3];
System.out.println(numbers[0]); // Output: 0
```
</li>

<li>
 Boolean Type

| Data Type | Default Value |
|-----------|---------------|
| boolean   | false         |

**Example:**
```java
boolean flags[] = new boolean[2];
System.out.println(flags[1]); // Output: false
```

<li>
Reference Types (Objects)

| Data Type      | Default Value |
|----------------|---------------|
| Any class type | null          |

**Example:**
```java
String names[] = new String[3];
System.out.println(names[0]); // Output: null
```

</li>
</ol>
11. Example 1 for arrays:

```java
public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 88;
        arr[1] = 89;
        arr[2] = 90;
        arr[3] = 91;
        arr[4] = 94;
        System.out.println(arr);
    }
}
```

12. Example 2 for arrays: printing the elements of array.
```java
public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 88;
        arr[1] = 89;
        arr[2] = 90;
        arr[3] = 91;
        arr[4] = 94;
        System.out.println(arr[3]);
    }
}
```

## Output

```
91
```

13. Example 3 for arrays: accesing index which is not in range
```java
public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 88;
        arr[1] = 89;
        arr[2] = 90;
        arr[3] = 91;
        arr[4] = 94;
        System.out.println(arr[5]);
    }
}
```
## Output

```
Index 5 out of bounds for length 5
```

14. Example: using the elements of array in code.
```java
public class Main6 {
    public static void main(String[] args) {
        int[] arr = {55,66,77,88,99};
        System.out.println("The element at 3rd index is: " + arr[3]);
    }
}
```
## Output

```
The element at 3rd index is: 88
```

15. Example: average of the elements of the array.
```java
// Average of the elements of the array
public class Main7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = 0;
        for(int i = 0; i<arr.length;i++){
            result += arr[i]; // or, result = result + arr[i]
        }
        System.out.println("Average is: " + result/arr.length);
    }
}
```
## Output

```
Average is: 3
```
16. In Java:
<ul>
<li>Arrays are stored in heap memory</li>
<li>arr is a reference variable</li>
<li>The actual array object is stored in the heap</li>
</ul>

17. How Index Access Works? When we write: arr[3] <br>
Java internally calculates:  <i>Base Address + (index × size_of_type)</i>

It directly jumps to that memory location. That’s why array access time is: O(1) — Constant Time

<h2><u>Multidimensional Arrays:</u></h2>

1. It's an array that contains other arrays.
```java
int[][] arr = {{1,2,3},{4,5,6}};
```

2. Internally, arr -> [reference for row0, reference for row1]

3. Syntax:
```java
data_type[][] = new data_type[rows][columns];
```
Example:
```java
int[][] arr = new int[3][5]; // 3 rows and 5 columns
```

4. Accessing elements: To access elements, array_name[row][column]
Example:
```java
System.out.println(arr[1][2]); //2nd row, 3rd column
```

5. Length of rows and columns: 
```java
System.out.println(arr.length); //length of rows
System.out.println(arr[0].lenght); //column in row 0
```

6. Java 2D arrays are NOT true matrices. They are arrays of arrays.
This means:
<ul>
<li>Rows can have different lengths</li>
<li>This is called a Jagged (Irregular) Array</li>
</ul>

7. 


