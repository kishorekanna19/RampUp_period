import java.util.Optional;

import javax.swing.text.html.Option;

public class optional {
    public static void main(String[] args) {


        String[] str = new String[10];
        // String str2 = str[6].substring(2,4);
        // System.out.println(str2);

        // using the optional class

        Optional<String> op = Optional.ofNullable(str[6]);


        if(op.isPresent()){
            String str1 = str[6].substring(2,4);
            System.out.println(str1);
        }else{
            System.out.println("There is no string in the string array of 6");
        }

        str[6] ="kishorekanna";
        Optional<String> op1 = Optional.ofNullable(str[6]);

        if(op1.isPresent()){
            String strr = str[6].substring(2,4);
            System.out.println(strr);
        }else{
            System.out.println("There is no String in the str 6");
        }

    }
}
