interface b{
    int i = 92;
    void goat(int i);
    default void rabbit(  ){
        int uou = 23;
        System.out.println("I am default method...!" + i);  // In default method
        // I had to learn this only , that in interfaces we can create the default methods
        //to make this possible to make some method to not to override in the subclass in any condition
        //otherwise throws an error!

        // This can be done by the default method!
        //Default methods, also have body.

        System.out.println(uou);
    };
}

interface a{
    void dog();
}
class namsakar implements a,b{
    @Override
    public void rabbit() { // This is how default methods are called.
        b.super.rabbit();
    }

    public void dog() {
        int u = 32;
        u = 45;
        System.out.println(i);
        int i = 78;
        System.out.println(i);
    }

    public void goat(int x) {

        System.out.println(i);
    }
}


public class defaultMethod {
    public static void main(String[] args) {
namsakar n = new namsakar();
n.dog();
n.goat(7);
n.rabbit();
    }
}
