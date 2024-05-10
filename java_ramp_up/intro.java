import java.util.Arrays;

public class intro {


    public static String company = "CEI AMERICA";

    public static void main(String[] args) {

        //1. local variable
        System.out.println("====================Local Variable Output=======================");
        add();
        // //2. Instance Variable
        System.out.println("====================Instance Variable Output=====================");
        student std = new student();
        System.out.println("Name of the Student: "+std.name);
        System.out.println("Roll no of the Student: "+std.rollno);
        System.out.println("School of the student: \n"+std.schlname);
        // //3. Static variable    
        System.out.println("====================Static Variable Output=======================");
        System.out.println("The static variable Output: "+intro.company);


        // //4. DataTypes
        System.out.println("====================DATA Types Size Output=====================");
        datatypesize();
        System.out.println("====================DATA Types Range Output=====================");
        datatyperange();


        //5. Operators
        System.out.println("====================Arithmatic Operators Output=====================");
        calc();
        System.out.println("====================Assignment Operators Output=====================");
        assign();
        System.out.println("====================Unary Operators Output=====================");
        una();
        System.out.println("====================Relational Operators Output=====================");
        rela();
        System.out.println("====================Logical Operators Output=====================");
        log();
        System.out.println("====================Ternary Operators Output=====================");
        maximum();
        System.out.println("====================If-else conditional statement output=====================");
        int ans = condi();
        System.out.println(ans);
        System.out.println("====================switch  statement output=====================");
        swi();
        System.out.println("====================For  statement output=====================");
        loop();
        System.out.println("====================While  statement output=====================");
        whiloop();
        System.out.println("====================Do-While  statement output=====================");
        dowhile();
        System.out.println("====================Continues statement output=====================");
        continue_stat();
        System.out.println("====================Break statement output=====================");
        break_stat();

        
    }


    //1. Local Variable
    public static void add(){

        //n1,n2,m are the local variables
            int n1 = 10;
            int n2 = 30;
            int m = n1+n2;
            System.out.println(m);

            
            if(m >20){
                String res = "m is greater than 20";//res local variable
                System.out.println(res+"\n");
            }
    }


    public static void datatypesize(){

        //1  byte = 8 bits. The purpose of getting all in byte we divide it by 8
        System.out.println("Byte size is : " + Byte.SIZE/8+" byte");
        System.out.println("Byte size is : " + Character.SIZE/8+" byte");
        System.out.println("Byte size is : " + Short.SIZE/8+" byte");
        System.out.println("Byte size is : " + Integer.SIZE/8+" byte");
        System.out.println("Byte size is : " + Float.SIZE/8+" byte");
        System.out.println("Byte size is : " + Long.SIZE/8+" byte");      
        System.out.println("Byte size is : " + Double.SIZE/8+" byte");
    }

    public static void datatyperange(){
        System.out.println("Byte: "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
        System.out.println("character: "+(int)Character.MIN_VALUE+" to "+(int)Character.MAX_VALUE);
        System.out.println("short: "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
        System.out.println("Integer: "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        System.out.println("Long: "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
        System.out.println("Float: "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
        System.out.println("Double: "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);
        
    }

    //Operators:
    //1. Arithmatic Operator
    public static void calc(){
        int n1 =5;
        int n2 =10;
        System.out.println("Addition: "+(n1+n2));
        System.out.println("Subraction: "+(n1+n2));
        System.out.println("Multiplication: "+(n1+n2));
        System.out.println("Division: "+(n1/n2));
        System.out.println("Modulus: "+(n1%n2));

    }
    //2. Assignment Operator
    public static void assign(){
        //it more likely arithmatic but uses the Equal(=) symbole to assign a value to any variables
        int n1 =10;
        n1 += 5;
        System.out.println(n1);
        n1 -= 10;
        System.out.println(n1);
        n1 *= n1;
        System.out.println(n1);
        n1 %= 10;
        System.out.println(n1);

        
    }
    //3. Unary Operator
    public static void una(){
        int n1 =10;
        boolean ans = true;
        System.out.println(n1++);//10
        System.out.println(++n1);//12
        System.out.println(--n1);
        System.out.println(n1--);
        System.out.println(!ans);
    }
    //4. Relational Operator
    public static void rela(){
        int a =10;
        int b = 14;
        int c = 5;
        System.out.println("a == b : "+(a==b));
        System.out.println("a!=b: "+(a!=c));
        System.out.println("a<b : "+(a<b));
        System.out.println("a>c : "+(a>c));
        System.out.println("a<=c : "+(a<=c));
        System.out.println("a>=b : "+(a>=b));
    }

    //5. Logical Operator

    public static void log(){
        boolean s = false;
        boolean p = true;

        System.out.println(s&&p);
        System.out.println(s||p);
        System.out.println(!p);
    }
    //6. Ternary Operator 

    public static void maximum(){
        int a = 20;
        int b = 40;
        int c = 10;

        int ans = ((a>b) ? (a>c) ? a : c :(b>c)?b:c);
        System.out.println("Maximum of three: "+ans);

    }

    // if -else statement

    public static int condi(){
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println("a is greater than b:");
           return a;
        }else{
            System.out.println("b is greater than a:");
            return b;
        }
    }
    
    public static void swi(){
        int n = 1;
        switch (n) {
            case 1:
                System.out.println("First Day of Week. ohh ! it's Monday.");
                break;
            case 2:
                System.out.println("Second day of week. ohh ! it's tuesday");
                break;
            default:
                System.out.println("It's weekend time");
                break;
        }
    }

    public static void loop(){
        int[] arr = new int[5];
        for(int i=1; i<5; i++){
            arr[i]=i;
        }
        System.out.println( Arrays.toString(arr));
    }

    public static void whiloop(){
        int i =1 ;
        while(i<5){
            System.out.println("Hii kishore kanna. Congrats for FHLB account");
            i++;
        }
    }

    public static void dowhile(){
        int i=1;
        do{
            System.out.println("The do loop is executed atleast ones");
            i++;
        }while(i<0);
    }

    public static void continue_stat(){
        for(int i =0;i<10;i++){
            if(i == 2 || i== 3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("It will skip the 2 and 3 value");
    }


    public static void break_stat(){
        for(int i =0;i<5;i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("The loop is ended when it meets the break statement");
    }

}

// 2.  Instance Variable
class student{
   String name;
   int rollno;
   String schlname;

   public student(){
    this.name = "kishore";
    this.schlname ="MSP";
   }


}
