public class wrapper {
    public static void main(String[] args) {

        // convert primitive into Wrapper class
        int num = 100;
        Integer in = Integer.valueOf(num);
        System.out.println(in);

        // convert wrapper into primitive type
        Integer ob = new Integer(100);
        int n1 = ob.intValue();
        System.out.println(n1);

        
    }
}
