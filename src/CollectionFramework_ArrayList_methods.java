import java.util.ArrayList;

public class CollectionFramework_ArrayList_methods {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(2);
        li.add(5);
        li.add(8);
        li.add(0,7);// have same index
        li.add(3,1);// have same index , but this one will be shown first at index 0 in the same index case

        System.out.println("print1" + li);
        // when I need to add all the elements of the other ArrayList into the one ,
        // First Generate an ArrayList
        ArrayList<Integer> lj = new ArrayList<>() ;
        // putting some elements in the lj ArrayList
        lj.add(12);
        lj.add(14);
        lj.add(11);
        lj.add(27);
        //Using addALL to add li ArrayList in lj ArrayList
        lj.addAll(li );
        // Printing the final ArrqyList
        System.out.println("print2" +lj);
        //Doing vice-versa , adding li ArrayList in lj ArrayList
        li.addAll(lj);
        System.out.println("print3" +lj);
        ArrayList <String> lk = new ArrayList <>();
        lk.add("s");
        lk.add("a");
        lk.add("c");
        lk.add("h");
        lk.add("i");
        lk.add("n");
        System.out.println(lk);
        System.out.println(lk.addAll(lk));
        System.out.println(lk.size());
        System.out.println(lk.contains("s"));
        System.out.println(lk.toArray());
        System.out.println(li.equals(8));

      // for character -->
        ArrayList < Character> c = new ArrayList<Character>();
      // for character -->
        ArrayList < Byte> b = new ArrayList<Byte>();
      // for character -->
        ArrayList < Short> s = new ArrayList<Short>();
      // for character -->
        ArrayList < Long> l = new ArrayList<Long>();
      // for character -->
        ArrayList < Float> f = new ArrayList<Float>();

    }
}
