import java.util.*;



public class list {
  
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
       
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        list.addFirst(0);
        list.addLast(7);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        
    }    
}
