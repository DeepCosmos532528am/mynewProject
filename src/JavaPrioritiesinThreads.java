class priority extends Thread {
    int value;
    String Useme;

    public priority(int value , String imp) {
        this.value = value;
        this.Useme = imp;
    }

    public void run() {
        int i = 3;
        while (true) {
            System.out.println("The value is" + this.value + Useme );
            i--;
        }

    }
}


public class JavaPrioritiesinThreads {
    public static void main(String[] args) {
        priority prt = new priority(0, "Maximum priority wala");
        priority prt1 = new priority(1, "g");
       /* priority prt3 = new priority(3);
        priority prt2 = new priority(2);
        priority prt4 = new priority(4);*/

        prt.setPriority(Thread.MIN_PRIORITY);
        prt1.setPriority(Thread.MIN_PRIORITY);
        prt.start();
        prt1.start(); //suppose mujhe iska zada kaam h , toh pririty set kar sakte h , for more no. of executions compare to other 4



    }
}
