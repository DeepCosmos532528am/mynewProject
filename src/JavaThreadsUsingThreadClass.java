

    class SeeThread1 extends Thread{  // Thread is by default class form java in its Library

        public void run() {
            int i = 0;
            while(i<10){
                System.out.println("Cooking");

                i++;
            }

        }
        public void run(int i ){
            while(i<5){
                System.out.println("I am not running");
                i++;
            }
        }

    }
    class SeeThread2 extends Thread{
        public void run(){
            int i = 0;
            while(i<10){
                System.out.println("Chatting with her");

                i++;
            }
        }

    }


    public class JavaThreadsUsingThreadClass {
        public static void main(String [] args) {
            SeeThread1 st = new SeeThread1();
            SeeThread2 ST = new SeeThread2();
            st.run(3);
            st.start();
            ST.start();


        }

    }

