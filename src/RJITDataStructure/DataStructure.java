package RJITDataStructure;
 // in java programming lab - the programs are : 1. type casting

interface Sparrow{
 int a= 2;
}
abstract class kingfisher{
    abstract void fan();
    int r = 44;
}
 class crow extends kingfisher implements Sparrow{

   void fan(){
       System.out.println(r);
       r= 34;
       System.out.println(r);
   }
   static void hen(){
        int uu = 2;
        if(a==uu) {
            System.out.println("Yes this is Equal !");
        }

        System.out.println(a);
     }
}


public class DataStructure {
    public static void main(String[] args) {
        crow c = new crow();
        crow.hen(); // ye dekhlo yaar mene hen method ko static declare kar diya tha . isliye ye direct class name se hi call ho gya
        System.out.println("This is our fan method !");
     c.r =132; /* dekho bro..! you can see the diffrence between the abstract and the interfaces
        line 34 me mene crow class ka reference leke abstract class ke variable 'r' ki value change kardi
         kyuki abstarct class extend karti h crow pe. aesa lekin tab nahi ho skata jab hum same cheez interface ke
         kisi variable ki value change karna chahte ho see below in line 38*/
        //c.a= 34; // Throwing Error


    }
}

