// The methods in LinkedList are similar as ArrayList , only the internal working is different
// because LinkedList implements Queue, and it contains the value as the independent objects , in which each object contains
// three entities those are self value , previous object reference and next object reference...!

import java.util.Arrays;
import java.util.LinkedList;

// Although around all the methods are same in both but , some methods are indeed there which are extra and different in LinkedList ,
// Syntax too is same , but I cannot set the initial capacity in LinkedList unlike ArrayList
// In linked list the order cannot be broken of the index , means to put value we cannot directly, put value to the index 1 first 0 need to be initialized then 1 , similarly cannot do this
//And when any value is added again at same index , then it will not replace the existing value instead it will shift the existing value to the next index and will acquire that index!
// to put index directly by jumping even at least one index , index initialization must be in order! otherwise out of bound exception will occur!
//  link to see all the supported methods in LinkedList for Java23 : https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/LinkedList.html


public class CollectionFramework_LinkedList {
    public static void main(String[] args) {
        System.out.println("one way to insert multiple elements to LinkedList -  by first storing the elements to an Array or list ,\n" +
                "and then convert it into list if it is Array , but if already a list , then that is Okay !");

        LinkedList<Integer> ll = new LinkedList<>(); // cannot set initial capacity !
        Integer[] arr = {1, 3, 2, 5, 4, 6, 5, 7, 6, 8, 7, 9, 8, 9, 6, 5, 6, 4, 2, 5};
        ll.addAll(Arrays.asList(arr));
        System.out.println(ll);
        System.out.println(ll.size());

        System.out.println(" Other way to do so - using loop");
        ll.removeAll(ll); // it removes all the elements in Linkedlist
        for ( int a = 0 ;  a < 20 ; a++ ){
           ll.add(arr[a]);
       }
        System.out.println(ll);

    }

}
