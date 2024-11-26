interface King {
    int a = 34;
    void queen(int decrement);
}
// NOTE : Imp Concept-- in the case of interfaces if the interface containing the variables and the methods too then , this is compulsory needed to have the implementing
// class to override the method too in the class with public declaration , But the variable dont say ki m agar interface me hu toh method ki tarah mujhe bhi
//class me jagah do , wo kehta h ki agar chahiye toh override karlo , nahi toh rehne do m interface me hi hu , zaroorat pade toh override , warna apan toh h interface me hi hided!
class C1 implements King{
    public void queen(int decrement){ // Remember that the public keyword is always necessary to declare here in the interface method , as done in this !
        System.out.println(decrement);// This is not necessary in interfaces to have the same paramemnter namee as  initialized in interface method that is overriden  , see the difference in the decrement and the decreasing
        System.out.println(a);  // here in this line a
        int a = 4;  // this is possible becasue here I am overriding the variable again  and overriding toh is possible in this but
        a = 45; // this is not possible here !

        System.out.println(a);  // the variables overriding is also possible here out[put will be 4 but in line 9 the output will still be same that is , a = 34
    }
    void hello(){
        System.out.println("This is the First class !");
    }
}
class C2 extends C1{
    void hii(){
        System.out.println("This is the Second class");
    }
}
class C3 extends C2{
    void hii(){
        System.out.println("This is the Third Class!");
        hii();
    }
}

public class AbstarctVSInterfaces {
    public static void main(String[] args) {
     C1 class1 = new C1();
       class1.queen(1);
     String [] arr  = {};

    }
}
/* Key points:
Interfaces in java are a bit like the class but with a significantly different.
An Interface can only have method signatures field and a default method.
The class implementing an interface needs to declare the methods ( not field )
You can create a reference of an interface but not the object
Interface methods are public by default */