import java.util.*;

public class queue {
    public static void main(String[] args) {

        Queue<String> qu = new LinkedList<String>();

        qu.add("kishorekanna");
        qu.add("Ramesh");
        qu.add("Gowtham");
        qu.add("amar");
        qu.add("subbu");
        System.out.println(qu);

        // remove- it remove the last inserted
        System.out.println("Remove method: " + qu.remove());

        // element() - it will returns the head element
        System.out.println("Element method(): " + qu.element());

        // poll() - will return and remove the head of the queue
        System.out.println("Poll method:" + qu.poll());

        // peek() - same as element but if queue is empty it will return null value
        System.out.println(qu);

        System.out.println("Peek Method(): " + qu.peek());

    }

}
