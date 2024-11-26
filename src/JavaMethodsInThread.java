class Jmeth1 extends Thread {


 /*  public Jmeth1 (String name){
   super(name);
   }
                                             // remove comment-out this part only when I use priority example from line 48 to 64.
    public void run() {                      //Also comment out the other part like other run method form this class to avoid redundancy and error , becuase 2 run method ho jayenge!
int u = 0;
     while(u < 40){
         System.out.printf("The Thread name is %s and Priority is %d \n" , Thread.currentThread().getName(), Thread.currentThread().getPriority() );
         try {
             Thread.sleep(15);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         u++;
     }



    }
*/

   /* public void run(){
        try {                         [UN-COMMENT OUT this run() WHEN checking the interrupted method ]
            sleep(5000);
            System.out.println("nahi ho paya :( isliye hi yha tak execute ho gya bina interruption ke");
        } catch (InterruptedException e) {
            System.out.println(e + " yes, :) ho gya isliye hi error aa rha h ye   ");

        }
    }*/

    public void run(){
int i = 1;
     while(isDaemon()){
         System.out.printf( getName() + " Is this daemon? Yes %s is Daemon \n" , Thread.currentThread().getName()  );
    i++; }
        for(int loop = 1; loop <= 100; loop++)
        {System.out.println("Here is Only non-Daemon thread" + Thread.currentThread().getName());}
    }





}

public class JavaMethodsInThread {
    public static void main(String[] args) throws InterruptedException {
        Jmeth1 jm1 = new Jmeth1();   // <-- when to try priority example from line 48 to 64 put  "jm1"  in the argument to this constructor as to assign for setting the name .

        /* System.out.println("Method 1 : start() method call ho gya ?");
        jm1.start(); */



        /* System.out.println("Method 2 : sleep() method call ho gya ?");
        Thread.currentThread().setName("Sachin ji");

        Thread.sleep(5000) ;

        System.out.println(" 5 sec sleep ke baad ,Current Thread ka name h: " + Thread.currentThread().getName()); */


     /*   System.out.println("Method 3 : join() method call ho gya ?");
        Thread.currentThread().setName("Sachin ji");
        jm1.start();

        Thread.currentThread().sleep(10000);
        jm1.join();



        System.out.println(" 5 sec sleep ke baad ,Current Thread ka name h: " + Thread.currentThread().getName());*/


   /*    System.out.println("Method 4 : setPriority() method call ho gya ?");
        Jmeth1 jm2 = new Jmeth1( "jm2");
        Jmeth1 jm3 = new Jmeth1( "jm3");


         jm1.setPriority(Thread.MIN_PRIORITY);
         jm2.setPriority(Thread.NORM_PRIORITY);
         jm3.setPriority(Thread.MAX_PRIORITY);



        jm1.start();
        jm2.start();
        jm3.start();
 Thread.currentThread().sleep(3000);
        System.out.println("Ha ho gya ;)");

*/
       /*
         System.out.println("Method 5 : interrupt() method call ho gya ?");

        jm1.start();
        jm1.interrupt();

        Thread.sleep(5000);
        System.out.println("Successfully Interrupted ;-)");
        */




      /*   System.out.println("Method 5 : setDaemon() method call ho gya ?");
        System.out.println("This is main Thread");
         Jmeth1 jmeth4 = new Jmeth1();
         Jmeth1 jmeth5 = new Jmeth1();

        jm1.setDaemon(true);
        jm1.start();
        jmeth4.start();
        jmeth5.start();
*/



        /*


        */



     //   System.out.println("Right Now JVM is in main method");






    }
}




        /*


[Note: for now don't get stuck by seeing the exceptions keyword in code , as you don't reach on this topic.]
[Note: Yhaa pe Threads ke case me, har ek obj reference, Thread hi hota h means har ek object apne aap me ek separate thread h , like jm1, jm2, jm3, Jmeth4 , Jmeth5 etc, they all are Separate threads, in themselves  ]

 1. objReferenceName.start() : To start execution of the function.


 2. run(): Is used as overriden method by extending the thread class or implementing runnable interface to write code in it ,
 and for executing the run method if run() is used to call to run method then it will be executed as a regular methods and if start() is used
 to call it then it will be executed as a separate Thread  , involving in concurrent execution of threads with CPU-time sharing!


3. objReferenceName.sleep() : Is used to sleep or pause the execution for given time for e.g. 5000 ms, 10000 ms etc... at the step where this method is used or to pause the execution of the reference used for given time .


4. objReference.join() : This method is used to allow one thread to execute completely before moving further to next step in the current thread. like in the e.g. above jm1 is the reference targeting to the run method(Thread) in the Jmeth1 class
now see there  on line 30 , a sleep() method is defined there , which will first let the targeted thread to be executed completely once withought involving in CPU time sharing before moving to line 31,

[Note : if any thread is taking time then the JVM will not stop for it , It will move to other , let's say in the same example.
If sleep method will not be there on line 5 for 3 seconds, then the JVM would be executing in the regular sequence , (means first come first execute ) but here the time is taken because of sleep(). so JVM first execute the line 37 then line 9 because as on line
 5, sleep(3000) is there for 3 seconds , so it is taking time , JVM thought why to wait move the CPU time to further line 37..., after executing it , It will execute the line 9] .In short it will first execute the thread which is available earlier , means which becomes able for running soon first!


 5. objReference.setPriority() : to Prioritize which thread will be executed more frequently.

 6. objReference.interrupt() : The interrupt method in Java is used to signal a thread to stop its current work.
  When you call interrupt on a thread, it sets the thread's interrupt status to true.
  This status can be checked by the thread using isInterrupted. If the thread is in a blocking operation like sleep, wait, or join, an InterruptedException is thrown.
   Handling this exception allows the thread to clean up resources and exit gracefully.
  This approach helps in managing threads effectively, ensuring they can be stopped in a controlled and orderly manner.

 7. objReference or (Thread) .yield() : The Thread.yield() method in Java hints to the thread scheduler that the current thread is willing to pause and let other threads execute.
  However, it doesn’t guarantee the current thread will yield, as this depends on the underlying JVM and operating system.
   Modern Java rarely uses yield() due to its unpredictability and the availability of better concurrency tools in the java.util.concurrent package.
    High-level constructs like sleep(), wait(), and thread pools offer more reliable control over thread execution. Consequently, yield() is mostly
    reserved for debugging or educational purposes.

  8. objReference or (Thread) .Deamon() :Deamon threads wo thread hote h jo user Thread background me run karte h , ye non-deamon(user Threads)  ko service provide karte h .
  Daemon threads are background threads that provide services to main or non-daemon threads. They run independently but assist other active threads by
   offering essential background support.

   Purpose and Usage of Daemon Threads

These threads primarily help in providing support tasks, such as memory management, by assisting main threads in Java applications. They do not prevent a program from terminating when the main thread completes.
Examples of Daemon Threads

Key examples include the garbage collector and the spell checker in word processors. The garbage collector runs in the background, cleaning up memory by removing unused objects, whereas a spell checker runs continuously to underline errors as a user types.
Garbage Collector as a Daemon Thread

The garbage collector monitors memory usage, freeing up space when necessary, and preventing memory overflow issues. This allows the main thread to run smoothly without memory interruptions.
Spell Checker as a Daemon Thread

As another example, the spell checker in word-processing software continuously checks for spelling errors in the background. When it detects a mistake, it underlines the error to assist the user.
Service-Oriented Nature of Daemon Threads

Daemon threads are service-oriented, providing assistance only when needed. They operate in the background, ensuring that main threads can execute without disruption.
Daemon Thread Behavior on Program Termination

Since daemon threads are background processes, they terminate automatically when the main program or non-daemon threads finish execution, indicating their dependency on the lifecycle of the main application.
These points summarize the key information about daemon threads and their utility in Java multithreading, focusing on examples and core definitions that are crucial for understanding their purpose in Java applications.







 */
