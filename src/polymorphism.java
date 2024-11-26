
// Run time polymorphism or dynamic polymorphism

interface MyCamera2{
    void takeSnap();
    void recordVideo();
   private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}



interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}


class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
       public void record4KVideo(){
      System.out.println("Taking snap and recoding in 4k");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}


public class polymorphism {
    // Compile-time polymorphism or static polymorphism ,can only be achieved through method overloading !
    // 1st Concept in it ---> Implicit  type conversion or type promotion

    /* static int hello(int x){
        System.out.println("I am method hello!");
        return x;  // this return stmt. here is just the curosity here to know what will be the return back value
         //if we give int value on char parameter , same with the hell(char x) method below !
         //Actually , my curiosity is apart then the concept about which this progrm is made!
    }

    static char hell(char x){
        System.out.println("I am method hello!");
        return x;
    }

    static void hii(String y){
        System.out.println("I am method hii!");
    }*/

    public static void main(String[] args) {
       /*1st concept--->  polymorphism.hello('e'); // I have given the char argument here in the method expecting to get int value !
        // but on passing the char value also the hello method got executed , this is because of the concept known as
        // implicit type conversion or type promotion, I can go to the browser to get the full hierarchy map of this.
        // Remember this is not only applicable for the case between int and char, same goes with other datatypes
        // also, as I said there is complete hierarchy of this !
          polymorphism.hell( '5');
        System.out.println(polymorphism.hello(8));
        System.out.println(polymorphism.hell('9'));*/


        // Que ---> can the main() can be overloaded ?
         // Yes! it can be, See Below !
        // Achha Confuse mat hona ki isme humne object kyu nahi banaya class ka , method calling ke liye!
        //Kyuki bilkul instance banake hi karte h har baar isliye iss baar kucch alag dhang se kiya bhai! humne already , method ko static kar rakha h so I can do this ! )

        //polymorphism.main(args); // it will cause the infinite loop! so commented out


        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        // cam1.getNetworks(); --> Not allowed
        // cam1.sampleMeth(); --> Not allowed

        cam1.record4KVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.record4KVideo();
        s.getNetworks();
        s.callNumber(7979);
        s.pickCall();
        s.connectToNetwork("h");

    }

    public static void main(String [] dsd,String [] sksk) {
        System.out.println("Aese karlo ya ");

    }
    public static void main(){
     System.out.println("So maante ho ki main() overloading is possible bro...!");

  }




}
