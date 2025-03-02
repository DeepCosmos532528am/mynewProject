
// NOTE : I have created the multiple interfaces , just to test its implementations with lambda expressions in multiple ways
// get into the main method to see what I am saying !
interface interf {
    void meth1();
    void meth2();
}
interface interf2 {
    int meth1(int a, int b);

}  interface interf3 {
    void meth1(int x );

}

public class AnonoymsClasses_and_lambdaExpressions {
    int caro;
    public  static  void main(String[] args) {
     interf  a = new interf ()  /*Declaration of anonymous class*/
        {     // Body starts here

            @Override
            public void meth1() {
                System.out.println("method 1 Overridden from the interface in the body of the Anonymous class 'interf' ");

            }
            @Override
            public void meth2() {
                System.out.println("method 2 Overridden from the interface in the body of the Anonymous class 'interf' ");
            }

            // Body ends here
            };


        // Using Lambda expressions for concise and fast work , can be implemented with the Functional interfaces only!, used when creating the anonymous class of the functional interface, instead we can use these lambda expressions!
        interf2  b = (in1,in2) ->   /*Declaration of anonymous class*/
        {
            System.out.printf("The Subtraction is ");
            int subtract = in1-in2;

            return subtract;
            // Body ends here
            };
  b.meth1(1,5);
        System.out.println(b.meth1(2,3));



        interf3 c = (caro) -> {

            System.out.println(caro);
                System.out.println("Interface 3!!");
        };
        c.meth1(2);

    }
}

// N0TE :  this is the anonymous class !,they don't have name , used when want to implement the interface only for one time.
// behaves similarly as the normal class; that have implemented the specific interface in it !
// it is named similar as the name of the interface
