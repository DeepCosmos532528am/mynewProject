/*class sync extends Thread {
    int salary = 1000000000;
    int currentSalary;
    int u = 0;
    int withdrawl;

    sync() {
    }

    sync(int withdraw) {
        withdrawl = withdraw;
    }
    public void run() {

        while (u < 11) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentSalary = (salary - withdrawl);
            u++;
        }
    }




}


class sync2 extends sync{
    sync2(int withdraw1) {

      withdrawl= withdraw1;
    }


    public void run() {

        while (u < 11) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentSalary = (salary - withdrawl);
            u++;
        }
    }


    public int getSalary() throws InterruptedException {
        Thread.sleep(2000);

        System.out.println("Current Salary " + currentSalary);

        return currentSalary;
    }
}




public class SynchronizatioInThreads {
    public static void main(String[] args) throws InterruptedException {
        sync s = new sync(100);
          sync2 s2 = new sync2(200);
        s.start();
        s2.start();




    }
}*/

class sync extends Thread{

    int u = 1;

  //  int num = 0  ;
    int numer = 0;


void sharmaji(){
    System.out.println(u);
}

    public synchronized  void  runn( int num ) {

        // see the difference , while loop is using the shred variable u for both the Threads. For second Thread , the u's variable value left by first thread execution is used , so that's why no execution for second Thread.(As the limits are now overed) condition is now false for loop.
        while (u <= 100) {

            System.out.printf("\n%d * %d = %d ", num, u, num * u);
            System.out.println(currentThread().getName());
            u++;

        }
        System.out.println(u);

        // for loop is using the local variable uu for both the Threads.For second Thread , the uu's variable value will be again 1 as it dont have shared variable, so no shared value left by first thread execution , so that's why there is the execution for second Thread.(As the value of uu is reset again) so condition is now true for loop.
        System.out.println("for loop from here");
            int endLimit = 100;
            for (int uu = 1; uu <= endLimit; uu++) {

                System.out.printf("\n%d * %d = %d ", num, uu, num * uu);
                System.out.println(currentThread().getName());
                if(uu==endLimit){
                    System.out.println(uu);
                }


        }
    }

}

/* class sync2 extends Thread {

    int u = 1;
    int num =0;

    sync2() {
    }

    sync2(int num) {
       this.num = num;
    }
    public void run() {

        while (u < 11) {

            System.out.printf("%d * %d = %d \n", num , u, num*u);
            u++;
        }

}

*/


public class SynchronizatioInThreads {
    public static void main(String[] args) throws InterruptedException {
        sync s = new sync();

       // sync s2 = new sync(2);
  Thread t = new Thread(() -> s.runn(2),"Thread_1");
  Thread t1  = new Thread(() -> s.runn(3),"Thread_2");


        t.start();
        t1.start();




    }
}
