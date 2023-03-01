				import java.util.Scanner;  
public class Main  
{  
public static void main(String[] Strings)   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Enter the value of a: ");  
double a = input.nextDouble();  
System.out.print("Enter the value of b: ");  
double b = input.nextDouble();  
System.out.print("Enter the value of c: ");  
double c = input.nextDouble();  
double d= b * b - 4.0 * a * c;  
if (d> 0.0)   
{  
double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
System.out.println("The roots are " + r1 + " and " + r2);  
}   
else if (d == 0.0)   
{  
double r1 = -b / (2.0 * a);  
System.out.println("The root is " + r1);  
}   
else   
{  
System.out.println("Roots are not real.");  
}  
}  
}  




public class ReverseNumberExample1   
{  
public static void main(String[] args)   
{  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  




import java.util.Scanner;  
public class SumOfDigitsExample1   
{  
public static void main(String args[])  
{  
int number, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
{  
//finds the last digit of the given number    
digit = number % 10;  
//adds last digit to the variable sum  
sum = sum + digit;  
//removes the last digit from the number  
number = number / 10;  
}  
//prints the result  
System.out.println("Sum of Digits: "+sum);  
}  
} 







public class SumOfNaturalNumber2  
{  
public static void main(String[] args)   
{  
int num = 100, i = 1, sum = 0;  
//executes until the condition returns true  
while(i <= num)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
//increments the value of i by 1  
i++;  
}  
//prints the sum   
System.out.println("Sum of First 100 Natural Numbers is = " + sum);  
}  
}  



public class CreateObjectExample1   
{    
void show()    
{    
System.out.println("Welcome to javaTpoint");    
}    
public static void main(String[] args)   
{    
//creating an object using new keyword   
CreateObjectExample1 obj = new CreateObjectExample1();   
//invoking method using the object  
obj.show();    
}    
} 



6.	CREATE CLASS VEHICLE AND DERIVE SUBCLASS USING  MULTILEVEL INHERITANCE

PROGRAM:

class vehicle{  
void bus(){System.out.println("Six Weheeler");}  
}  
class car extends vehicle{  
void car(){System.out.println("Four Weheeler");}  
}  
class bike extends car{  
void bike(){System.out.println("Two Weheeler");}  
}  
class Main{  
public static void main(String args[]){  
bike d=new bike();  
d.bus();  
d.car();  
d.bike();  
}}  

OUTPUT:

Six Weheeler
Four Weheeler
Two Weheeler

FIND AREA OF DIFFERENT
SHAPES USING COMPILE TIME POLYMORPHISM

program:

public class Main {
    public static double mult(double s)
    {
        return s * s;
    }
    public static double mult(
        double a, double b)
    {
        return a * b;
    }
    public static double circle(
        double r)
    {
        return 3.14 * r * r;
    }
    public static void main(String args[])
    {
        System.out.println("Area of square:"+mult(2.0));
        System.out.println("Area of rectangle:"+mult(2.0, 3.0));
        System.out.println("Area of circle:"+circle(2.0));

    }
}

output:

Area of square:4.0
Area of rectangle:6.0
Area of circle:12.56


8.	DISPATCH METHOD USING RUNTIME POLYMORPHISM

class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
  
class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
  
// Driver class
class Dispatch
{
    public static void main(String args[])
    {
        // object of type A
        A a = new A();
  
        // object of type B
        B b = new B();
  
        // object of type C
        C c = new C();
  
        // obtain a reference of type A
        A ref;
          
        // ref refers to an A object
        ref = a;
  
        // calling A's version of m1()
        ref.m1();
  
        // now ref refers to a B object
        ref = b;
  
        // calling B's version of m1()
        ref.m1();
  
        // now ref refers to a C object
        ref = c;
  
        // calling C's version of m1()
        ref.m1();
    }
}
Output:

Inside A's m1 method
Inside B's m1 method
Inside C's m1 method

9.SEARCH ELEMENT IN GIVENARRAY USING LINEAR SEARCH

import java.util.Scanner;  
   
class Main  
{  
  public static void main(String args[])  
  {  
    int c, n, search, array[];  
   
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (c = 0; c < n; c++)  
      array[c] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    search = in.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (c + 1) + ".");  
          break;  
      }  
   }  
   if (c == n)  /* Element to search isn't present */  
      System.out.println(search + " isn't present in array.");  
  }  
}  

output:

Enter number of elements
6
Enter those 6 elements
34 62 76 21 40 56
Enter value to find
40
40 is present at location 5.
