interface i1 {
    void a1();

}
interface i2 extends i1{
    void a2();
}
interface i3 extends i2{
    void a3();
        default void b3(){
            System.out.println("This is the default method ");
        }
}
interface i4 extends i3 {
    void a4();
        }
// this is called the interface inheritance! the interfaces inheritance can only be done with the extends keyword as like the class inheritance, not by implements keyword
//this keyword is only valid in the case of inteeface to class not in interface to interface

        class Ourclass implements i3{
            @Override
            public void a1() {

            }

            @Override
            public void a2() {

            }
           public void a3(){

            }
        }


public class InheritanceInInterfaces {
    public static void main(String[] args) {

    }
}
