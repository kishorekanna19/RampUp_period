package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        File f = new File("D:/Ramp_up/RampUp_period/newfile.txt");

        FileInputStream fis = null;
        BufferedInputStream bis = null;


        try{
            fis = new FileInputStream(f);
            bis = new BufferedInputStream(fis);

            while (bis.available() > 0 ) {
                System.out.print((char)bis.read());
            }
            
        }catch(Exception e){
            System.out.println("Exception occured on File Reading "+e.getMessage());
        }

        finally{
            try{
                if(bis != null && fis != null){
                    bis.close();
                    fis.close();
                } 
            }catch(IOException e){
                System.out.println("Error occured on file closing: "+e);
            }
        }
    }
}
