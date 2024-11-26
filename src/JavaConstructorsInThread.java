class Diwali extends Thread {
    String nam = "Sachin Sharma";
    public void run(){
   System.out.println("running");
setName("Sachi" );
        System.out.println( getState());
    }

    public Diwali(int LikhoNaam){
        super("sa");

        System.out.println("lo bhai");

    }

}


public class JavaConstructorsInThread {
    public static void main(String[] args) {
 Diwali jayMaa = new Diwali(212);
        System.out.println(jayMaa.getState());
        System.out.println(jayMaa.getState());
        jayMaa.start();
        System.out.println(jayMaa.getState());

        //jayMaa.getState();
        System.out.println("The Id of this thread is :" + jayMaa.getId());
        jayMaa.setName("kya h ");
        System.out.println(jayMaa.getState());

        System.out.println(jayMaa.getName());
        /*as like setting the name through giving argument in the constructor, other fields like name can also be set directly through the run method and/or with the help of reference in main method
         using the setter (for e.g. refName.setName(); ) , and in constructor not by setter but by the super keyword by constructor chaining and in run method with the help of setter method of Thread itself like Only( setName(); )*/




    }
}
