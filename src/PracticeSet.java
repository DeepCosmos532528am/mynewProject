

abstract class Pen {     //1st and 2nd combined Answer
    abstract  void Write();
    abstract void Refill();
    void DocSave(){
        System.out.println("Saving the Docs..!"); // This is concrete method I created!
    } // Acting as a default method , these methods are declared when
      // any task is to be done definitely , like saving the task which we have done on
      // system , but print is optional , so it should be
      // here like this function, but save should be like this, as saving
      // is by default necessary , Understood Sachin!
}

  class classA extends Pen{   //1st and 2nd combined Answer
  void DocSave(){
         System.out.println("Not Saving the Docs..!");
     } // Overriding the concrete method!
    void Write(){
        System.out.println("Yess Bro Writing here..!");
    }
    void Refill(){
        System.out.println("Refilling the pen bro..!");
    }
    void changeNib(){
        System.out.println("Changing the Nib!");
    }
}

class basicAnimal{
    public void eat(){
        System.out.println(" I can eat ");
    }
    public void sleep(){
        System.out.println("  I will Sleep !");
    }


}

interface monkey{
    void jump();
    void bite();
}

class Human extends basicAnimal implements  monkey{

  public void jump(){
      System.out.println(" Now I am human, additional features added and now I can jump also!");
  }
    public void bite(){
        System.out.println("additional feature added as now I can bite also! ");
    }


}
public class PracticeSet {

    public static void main(String[] args) {
        /*1st and 2nd combined Answer*/ Pen p = new classA(); // I tried to call the method through two different ways , this is 1st
        /*1st and 2nd combined Answer*/ classA cA = new classA(); // I tried to call the method through two different ways , this is 2nd

     // Same rule ,like interface and the Super-classes ! they can only be
     //used at the reference side noyt at the objetc side , object side is only for the derived or child classes
     // the reference should be that only which is inherited in the specific class then the calling can be done woth the
     // Super-class or interface or abstrct class at reference side and the inheriting classes or interface at the  reference side and the child
     // classes of these three should be at the object side at the R.H.S...
        //p.changeNib();---> will through because p is the reference to the Pen class while the chnageNib() method is in classA
        cA.changeNib(); //----> smoothly work! cause the reference is associated to the method call
     cA.DocSave(); // Accessing the concrete method !
     p.DocSave();  // Accessing the concrete method !


        System.out.println("2nd Answer");

        System.out.println(" let's see what is now been changed , from monkey to Human!");

        basicAnimal bA = new Human(); // calls only the basic animals class's functions
        Human H = new Human(); // calls only the Human class functions !

        bA.sleep();
        bA.eat();
        H.jump(); // This function is from the interface
        H.bite();  // This functions is also from the interface itself! so instance cannot be created
        H.sleep();
        H.eat();
    }
}
