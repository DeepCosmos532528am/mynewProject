class Luna {
   int a =9;

    public Luna(int a) {

        System.out.println("from here" + (this.a += a));
    }

    void Star(int iio) {

        System.out.println("Class 1 me Star h ");

    }
}




class Andromeda extends Luna {
   int i =99;
   int a;

    public Andromeda(int v) {
        super(2);
    }

    void Star(int iio){
        int leValue = iio;
       System.out.println("class 2 me star h " + leValue);

   }
  int Galaxy(int a) {

      this.a= 67;

         System.out.println(this.a);
         this.a=a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        return a;
    }
}



public class Inheritance_in_Java {
    public static void main(String[] args) {
        Luna astar = new Luna(10);
      astar.Star(9);
     //   System.out.println(j);
        System.out.println("The three Sets are as follow");

       Luna aglxy = new Andromeda(20);
        //aglxy.Galaxy(6576);
        aglxy.Star(2);
      //  astar.Star(1491);
        System.out.println("Lo bhai");
       // aglxy.Galaxy(astar.a);

    }
}
