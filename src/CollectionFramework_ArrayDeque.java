import java.util.ArrayDeque;

public class CollectionFramework_ArrayDeque {
    public static void main(String[] args) {
        // Same as ArrayList , and LinkedList but more methods are now here to perform extra function with this
        // Array-Deque means double ended queue , means the insertion and deletion can be performed from both the ends
        // Initial by default capacity is 16 , after that it resizes its length or capacity, based on the elements added
        // However , I can provide any initial capacity as well to it
        // link to it's Methods: https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/ArrayDeque.html#constructor-summary
        // Defining the ArrayDeque
        ArrayDeque <Integer> arrdq = new ArrayDeque<>();
        arrdq.add(1);
        arrdq.add(2);
        arrdq.add(3);
        arrdq.add(4);
        arrdq.add(5);
        arrdq.add(6);
        arrdq.add(7);
        arrdq.add(8);
        arrdq.add(9);
        arrdq.add(10);
        arrdq.add(11);
        arrdq.add(12);
        arrdq.add(13);

        System.out.println(arrdq.getFirst());
        System.out.println(arrdq.getLast());
        arrdq.addFirst(0); // will add the value in deque but becomes about to throw an Exception if the deque is full to its limit, but due to its property to resize according to the value input , if the initial capacity exceeds,
        // similar case for the offer() method below !
        arrdq.addLast(6);
        System.out.println(arrdq.getFirst());
        System.out.println(arrdq.getLast());
        arrdq.offerFirst(990); // will add the value in deque but will through False if the deque is full to its limit unlike the addFirst() method , which throws error ! instead of throwing error , it becomes about to show False , instead of exception but will not becaouse of resizing property of array deque

        System.out.println(arrdq.getFirst());
        System.out.println(arrdq);

        System.out.println("Setting up the initial capacity to other deque !");

        ArrayDeque <Integer> ad = new ArrayDeque <> (1);
        ad.add(1);
        ad.add(2);
        ad.add(3);
        ad.add(4);

        System.out.println(ad);

    }
}
