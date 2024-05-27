import java.util.*;

public class for_each {
    public static void main(String[] args) {

        //for hashmap key,value hsahmap
        Map<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "Manohar");
        hmap.put(1, "Padmavathi");
        hmap.put(3, "Ramesh");
        hmap.put(4, "kishorekanna");

        // hmap.forEach((key, value) -> System.out.println(key + " " + value));

        // hmap.forEach((key, value) -> {
        //     if ("Padmavathi".equals(value)) {
        //         System.out.println("key value of padmavathi is " + key);
        //     }
        // });

        //foreach for list using the lambda expression
        List<String> ls = new ArrayList<>();
        ls.add("Merle");
        ls.add("Maggie");
        ls.add("Michonne");
        ls.add("Davisri kishorekanna");

        // ls.forEach(f->System.out.println(f));

        //using the method reference.
        // ls.forEach(System.out::println);

        //using the streams

        // ls.stream().filter(f->f.startsWith("D")).parallel().forEach(e-> System.out.println(e));


        //using the foreachordered it will return the elements in ordered wise
        System.out.println("Print using the foreach order");
        ls.stream().filter(f->f.startsWith("M"))
        .parallel()
        .forEachOrdered(e-> System.out.println(e));

    }
}
