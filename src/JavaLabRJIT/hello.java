package JavaLabRJIT;
 class Animal {
     void  dog(){
         System.out.println("I am Dog!");
         System.out.println(" I have long mouth!");
     }
     void lion(){
         System.out.println("I am Lion!");
         System.out.println("I am the king of Jungle!");
     }
 }

 class Vegetables extends Animal {
     void potato(){
         System.out.println("I am Potato!");
         System.out.println("I am used everywhere");
     }
     void chilly(){
         System.out.println("I am chilly!");
         System.out.println("I am avery Spicy!");
     }
 }




public class hello {
    public static void main(String[] args) {
        Animal a = new Animal();
        Vegetables v = new Vegetables();

        v.dog();
    }
}
