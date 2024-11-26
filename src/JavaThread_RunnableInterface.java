import java.util.Scanner;

class threadinterface0 implements Runnable {
    Scanner sc = new Scanner(System.in);
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("I am Thread1 not the Threat ! ");
         //   int lelo  = sc.nextInt();
            i++;
        }
    }
}
class threadinterface1  implements Runnable {
    public void run(){
        int i = 0;
        while (i <= 10){
            System.out.println("I am Thread2 not the Threat ! ");
        i++;}

    }
}



public class JavaThread_RunnableInterface {
    public static void main(String[] args) {

        threadinterface0 ti0 = new threadinterface0();
        threadinterface1 ti1 = new threadinterface1();
        //Runnable r = new threadinterface1(); // see we have given the interface reference here! will work same as line 32

        Thread t0 = new Thread(ti0);
        Thread t1 = new Thread(ti1);
       // Thread t2 = new Thread(r); // Runnable

        t0.start();
        t1.start();
        //t2.start(); // Runnable
    }
}

