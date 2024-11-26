class thrd extends Thread {
    public thrd(String name){
        super(name);

    }
public thrd(){
    System.out.println("Non-Argumented Function");
}
/*public thrd(int x){
    System.out.println("The argumented Constructor!");
}*/

  public void he(){
        System.out.println("Kya baaa");
    }

}

class asa extends thrd {
  public void run(){

  }
    public void he(){
        System.out.println("Kya baaa");
    }

    public asa(){
     /*   super(8);*/
        System.out.println("The Sec Constructor!");
    }
    public asa(int x){
        System.out.println("The argumented sec Constructor!");

    }
    public asa (int x, int y, int z, String name){
        super(name);

    }
  public void a(){
      System.out.println("the sec function");

    }

}



public class constructorsInThread {
    public static void main(String[] args) {
        asa t = new asa();
        asa th =  new asa(2);
        asa thh = new asa(1,2,9,"Sachin is the name of the Thread");
        System.out.println( thh.getName() + " And " + thh.getId());
    }
}
