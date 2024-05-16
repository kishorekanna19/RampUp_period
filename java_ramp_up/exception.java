public class exception {
    void getDetails(String str)throws userException{
        if(str.length() <=10){
            throw new userException("The given string is small");
        }else{
            System.out.println("the string length is more than 10");
        }
    }


    public static void main(String[] args) {
        exception obj = new exception();

        try{
            obj.getDetails("kishorekannnaaaaa");
        }catch(Exception e){
            System.out.println("The exception is got catched");
            System.out.println(e.getMessage());
        }
    }
}


class userException extends Exception{
    public userException(String s){
        super(s);
    }
}