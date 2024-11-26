package OOPM;

public class myOOPMmethdo {
    public static void printMessage(String str) {
        System.out.println("String method called");
    }
    public  void printMessage(Object obj) {
        System.out.println("Object method called");
    }

    public static void main(String ...arg) {
        myOOPMmethdo.printMessage(null);
        // can ALSO BE CALLED BY ONLY printMessage(null);


    }
}






















/* This is recursion Question, for 2 ka table , isko bhi karo jald se jald
package OOPM;

public class myOOPMmethdo {
        public static void main (String[]args){
        myOOPMmethdo mi = new myOOPMmethdo();
            int j = mi.sachin(0);
            System.out.println(j);
        }

    public int sachin(int u) {
        System.out.println(u);
        int i = 10;
        if (i > 0) {
            int a = sachin(2 * i);
            i--;

            return a;
        }
        return i;
    }


}
*/
