import java.util.HashSet;
import java.util.LinkedList;

public class CollecionFramework_Hashing_HashSet {
    public static void main(String[] args) {
        HashSet <Integer> hashset = new HashSet<>();
        LinkedList <Integer> beechmeaaya = new LinkedList<>();
       System.out.println("iska anwer " + beechmeaaya.add(4));
       System.out.println("iska anwer " + beechmeaaya.add(5));
       System.out.println("iska anwer " + beechmeaaya.add(5));
       System.out.println("iska anwer " + beechmeaaya.add(5));
       System.out.println("iska anwer " + beechmeaaya.offer(5));
       System.out.println("iska anwer " + beechmeaaya.offer(7));

        System.out.println(beechmeaaya);

        hashset.add(2);
        hashset.add(3);
        hashset.add(1);

        int a = 0;

        System.out.printf("at Index %d the value is %d \n" ,a,  beechmeaaya.get(a));
        a=1;
        System.out.printf("at Index %d the value is %d \n" ,a,  beechmeaaya.get(a));

        beechmeaaya.add(0, 11);
        System.out.println(beechmeaaya);

        int b = 0;
        System.out.printf("at Index %d the value is %d \n" ,a,  beechmeaaya.get(a));

        System.out.printf("at Index %d the value is %d \n" ,b,  beechmeaaya.get(b));

        hashset.add(11);
        hashset.add(22);
        hashset.add(21);
        hashset.add(4);
        hashset.add(5);
        hashset.add(6);
        hashset.add(7);

        hashset.add(13); // WILL SHOW THE OUTPUT , ONE ELEMENT FOR MULTIPLE SAME
        System.out.println(hashset.isEmpty());
        System.out.println(hashset);
        hashset.clear();
        System.out.println(hashset.isEmpty());
        System.out.println(hashset);
    }
}
