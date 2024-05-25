import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class lambda {
    public static void main(String[] args) {
        //without using lambda expression
        // Frame frame = new Frame("Action listener before java8");

        // Button b = new Button("click here");

        // b.setBounds(50,100,80,50); 
        // b.addActionListener(e->System.out.println("Hello world"));

        // frame.add(b);   
        // frame.setSize(300,300);
        // frame.setLayout(null);
        // frame.setVisible(true);


        //lambda expression with no parameter
        // Myfunctionalinterface mfi = ()->{
        //     return "Hello kishore";
        // };

        // System.out.println(mfi.SayHello());
        

        // lambda with parameter
        Myfunctionalinterface msi = (num)-> num +7;
        System.out.println(msi.addition(10));

        //iterating the collections
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("kishore");
        ls.add("kanna");

        ls.forEach((names)->System.out.println(names));


    }
    
}

interface Myfunctionalinterface{
    // public String SayHello();
    public int addition(int i );
}