class sync extends Thread {
    int salary = 1000000000;
    int currentSalary;
    int u = 0;
    int withdrawl;
    sync(int withdraw) {
          withdrawl = withdraw;
    }
   public void  run() {

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

           public void setWithdraw(int x){


           }
    public int getSalary () throws InterruptedException {
        Thread.sleep(2000);

        System.out.println("Current Salary " + currentSalary);

        return currentSalary;
    }
}

public class SynchronizatioInThreads {
    public static void main(String[] args) throws InterruptedException {
        sync s  = new sync(100);
      //  sync s2 = new sync();
        s.start();

        int gino =0;
        while ( gino < 11) {
           s.setWithdraw(1000);
        gino++;
        }

    }
}
