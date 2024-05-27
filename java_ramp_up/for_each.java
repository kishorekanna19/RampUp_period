import java.util.*;

public class for_each {
    public static void main(String[] args) {

        //for hashmap key,value hsahmap
        Map<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "Manohar");
        hmap.put(1, "Padmavathi");
        hmap.put(3, "Ramesh");
        hmap.put(4, "kishorekanna");

        hmap.forEach((key, value) -> System.out.println(key + " " + value));

        hmap.forEach((key, value) -> {
            if ("Padmavathi".equals(value)) {
                System.out.println("key value of padmavathi is " + key);
            }
        });

        //foreach for list using the lambda expression
        List<String> ls = new ArrayList<>();
        ls.add("kanna");
        ls.add("kishore");
        ls.add("Devisri");
        ls.add("Devisri kishorekanna");

        // ls.forEach(f->System.out.println(f));

        //using the method reference.
        ls.forEach(System.out::println);


    }
}
