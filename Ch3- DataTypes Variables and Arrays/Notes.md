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
