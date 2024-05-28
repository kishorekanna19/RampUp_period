package file;

import java.io.File;

public class delete {
    public static void main(String[] args) {
        File file ;

        try{
            file = new File("D:/FHLB_Ramp_ups/RampUp_period/newfile.txt");

            if(file.delete()){
                System.out.println("File deleted successfully "+file.getName());
            }else{
                System.out.println("File not deleted !!!!!! Failed");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
