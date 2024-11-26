
import java.util.Scanner;

class Proxima{
    // Constructor
   Proxima(){
        System.out.println("Proxima class and 1st Constructor");
    }
    Proxima(int i ){
        System.out.println("Proxima class and 1st Constructor with the value : " + i);
    }
 void check(){   // Testing Overriding among three Classes through Inheritance!
     System.out.println("In group of three");
 }
}class Cerus extends Proxima{
    // Constructor

    Cerus() {
        System.out.println("Cerus class and 1st Constructor");
    }

    Cerus( int i , int x ){

        super(i);
        int sum2 = i+x;
        System.out.println("Cerus class and 2nd Constructor : " + sum2 );
    }


}

class Pluto extends Cerus {
    Pluto(){
        System.out.println("Pluto class and 1st Constructor");
    }Pluto(int i , int j){
        super(i,j);
        int sum3 = i+j;

        System.out.println("Pluto class and 2nd Constructor : " +sum3);
    }Pluto(int i , int j, int k ){   // Overriding is done throuhg the Instance of this constructor , SEE BELOW!!, plto.check() calling .
       // super(8,3);
        int sum3 = i+j+k;
        System.out.println("Pluto class and 2nd Constructor : " + sum3 );
    }
}


public class Constructors_in_inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pluto plto = new Pluto(sc.nextInt(), sc.nextInt());
       plto.check(); // Testing Overriding among three Classes through Inheritance!

    }
}
