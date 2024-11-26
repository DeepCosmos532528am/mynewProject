/*import java.util.Random;
class TheGame {
    Random rndm = new Random ();
    public int r = 3 ;
    public int i ;
    TheGame( int r) {
        this.r += r;
        System.out.println(r);
        System.out.println(this.r);

    }
}
     class Game2 extends TheGame{   // Why this Error is here ?
    void junior(){

    }
        }
public class GuessTheNumberGame {
    public static void main(String[] args) {
        TheGame game ; // This is the Constructor!
      // This is the random Class
     // int a = rndm.nextInt(0,20);
     // game = new TheGame(a);

    }

}*/

import java.util.Random;
import java.util.Scanner;

class TheGame {
    Scanner sc  = new Scanner(System.in);
    Random rndm = new Random ();
    public int r ;
    public int i ;
    public int c = 1; ;
    TheGame( int r) {
        this.r = r;

    }
     void UserInp(){

        this.i = sc.nextInt();


}
    void isCorrNo(){
while(true) {
    UserInp();

    if (this.r == this.i) {
        System.out.printf("You guessed it correct!, in %d%n chances . Overall well played :)" ,this.c);
   break;
    }
    else if (this.i > this.r) {
        System.out.println("Oops yaar! Push down your choice");
    }
    else if (this.i < this.r) {
        System.out.println("Oh no! Uplift your choice");
    }
    this.c++;
}
    }
        }
public class GuessTheNumberGame {
    public static void main(String[] args) {
        TheGame game ; // This is the Constructor!
     Random rndm = new Random ();   // This is the random Class


        System.out.println(" I have thought of a number , Now check your intutions!");
         int a = rndm.nextInt(0,100);
        game = new TheGame(a); // Initialization of the Constructor is here!

        System.out.println("Input your choice here between 1 to 100 ");
        game.isCorrNo();

    }

}
