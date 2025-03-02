package RJITDataStructure;

import java.util.Scanner;

public class CorejavaStar3_0 {
    public static void main(String[] args) {
        String statement = "My name is Sachin Sharma and my age is 20 now and today the date is 06-12-2024, 03:27 AM";
      String lowered_statement =  statement.toLowerCase();
      String checkThis = "mY age";
      String lowered_checkThis = checkThis.toLowerCase();
        boolean kucchCheckKarnaH = lowered_statement.contains(lowered_checkThis);  //StringName.contains("") is a method to check whether the given sequence of character or word is present in string or not !

        System.out.println(kucchCheckKarnaH);

        Scanner sc = new Scanner (System.in);
                int i = sc.nextInt();
        System.out.println("lo bhai" + i);
        int j = sc.nextInt();
        System.out.println(j);
        int jj = sc.nextInt( );
        System.out.println(" here is an output"+ jj);
        int jk = sc.nextInt();
        System.out.println(jk);

    }
}
/*
String.contains("")
ternary operator in if else
sc.next() to print only first one word
sc.nextLine() for completing complete sentence , aur itna samjh lo ki , jab hum pehle wale input buffer me input deke enter press kart e h toh nextLine enter mark "/n" ko apna input samajh leta h , aur kucch bhi print nahi karta kyu ki enter me toh koi aese numeric ya characte ya string jesi value nahi hoti na , baaki chatgot pe jaake dsa wale folder ko dekho
remember to do sc.hasnext();
in switch cases, fall down ho jata h , jab hum sabhi cases se break hata lete h , jime ek condition ke baad neeche ke saari cases print hone lagte h , despite of what is condition
, switch case me continue nahi use kiya ja sakta h , wese continue ko sirf loops me hi use kar sakte h
char ka input aur dekhlo
if else me agr hum ek hi statement dena chahe toh curl brace ki zaroorat nahi hoti
*/




/*In Java, operators are special symbols used to perform operations on variables and values. Here’s a comprehensive list of Java operators:

Arithmetic Operators:
+ : Addition

- : Subtraction

* : Multiplication

/ : Division

% : Modulus

Unary Operators:
+ : Unary plus (not necessary, as numbers are positive without it)

- : Unary minus (negates an expression)

++ : Increment operator (increases a value by 1)

-- : Decrement operator (decreases a value by 1)

! : Logical complement operator (inverts the value of a boolean)

Assignment Operators:
= : Simple assignment operator

+= : Add and assign

-= : Subtract and assign

*= : Multiply and assign

/= : Divide and assign

%= : Modulus and assign

&= : Bitwise AND and assign

|= : Bitwise OR and assign

^= : Bitwise XOR and assign

<<= : Left shift and assign

>>= : Right shift and assign

>>>= : Unsigned right shift and assign

Relational Operators:
== : Equal to

!= : Not equal to

> : Greater than

< : Less than

>= : Greater than or equal to

<= : Less than or equal to

Logical Operators:
&& : Logical AND

|| : Logical OR

! : Logical NOT

Bitwise Operators:
& : Bitwise AND

| : Bitwise OR

^ : Bitwise XOR

~ : Bitwise complement

<< : Left shift

>> : Right shift

>>> : Unsigned right shift

Conditional (Ternary) Operator:
? : : Conditional operator (ternary)

instanceof Operator:
instanceof : Used to test whether an object is an instance of a specific class or subclass.

This comprehensive list of operators covers most of the operations you’ll encounter in Java programming. If you need examples or further explanation of any specific operators, feel free to ask!

*/
