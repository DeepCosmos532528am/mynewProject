interface Tyre{
void color(String color);
void air( int bar);
void size( int size);

        }
interface carBody{
    int price = 100000;
    void repair();
    void bodycolour( String bc);
    default void GadiBadluYaNa(){
     System.out.println("Nahi ! ");
 }
}
class oldcar{
    protected int price = 50000;
    void price(){
        System.out.printf("%d rupya lega \n" ,this.price);
    }

    void engine(){
        System.out.println("kamzor h \n");
    }
    void Starring(){
        System.out.println("Acchi h \n");
    }
    void InfotenmentSyst(){
        System.out.println("Non-Smart \n");
    }
    void Speed(){
        System.out.println("150 KM/Hrs \n");
    }
}
class myNewCar extends oldcar implements Tyre,carBody{
  void engine(){
      System.out.println(" iska toh damdaar h bhai ! Engine");
  }
   public void color(String tyrecolor){
       System.out.printf(" ha bhai colour %s ho gya \n ", tyrecolor);

    };
   public void air( int barpressure){
       System.out.println("25 bar pe kardo\n");

    };
   public  void size( int tyresize){
       System.out.printf(" Tyre ka size %d kardo \n", tyresize);
    };

   public void repair(){
       System.out.println("Jaldi hi hone wala h\n ");

   }
    public void bodycolour(String bodyColour){
        System.out.printf("Okay bhaiya! %s color hi kar diya h aapke liye ;) \n" , bodyColour);
    };
    public void price( int MaiDega){
        System.out.printf("%d , bas! nahi-nahi gareeb ka pet na kato , isme aap mujhe %d aur badha do jo " +
                "ho jayega aapka %d \n" ,MaiDega, super.price-MaiDega, super.price  );
    }
   };


public class Polymorphism2 {
    public static void main(String[] args) {
        carBody cb = new myNewCar();
        Tyre t = new myNewCar();
        myNewCar mc = new myNewCar();
        oldcar oc = new myNewCar();
        cb.bodycolour("red");
        oc.InfotenmentSyst();
        mc.price();
       /* cb.repair();
        mc.color("black");
        t.size(15);
        t.color(" FUll Dark Black");
        t.air(25);
        oc.Speed();
        oc.engine();
        oc.Starring();*/




    }
}
