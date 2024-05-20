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

        System.out.println(qu.remove());

        // element() - it will returns the head element

        System.out.println(qu.element());

        // poll() - will return and remove the head of the queue

        System.out.println(qu.poll());

    }

}
