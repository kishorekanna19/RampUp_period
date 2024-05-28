package file;

import java.io.*;
import java.text.SimpleDateFormat;

public class copyfile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
     

        try{

           File  infile  = new File("D:/FHLB_Ramp_ups/RampUp_period/java_notes.txt");
           File outfile = new File("D:/FHLB_Ramp_ups/RampUp_period/newfile.txt");

           fis = new FileInputStream(infile);
           fos = new FileOutputStream(outfile);

           byte[] bytes = new byte[1024];

           int length;

           while((length = fis.read(bytes))>0){
                fos.write(bytes,0,length);
           }

           fis.close();
           fos.close();

           System.out.println("File copyed successfully");

        }catch(Exception e){
            e.printStackTrace();
        }


        File nfile = new File("D:/FHLB_Ramp_ups/RampUp_period/newfile.txt");
        SimpleDateFormat sf = new SimpleDateFormat(" MM/dd/yyyy HH:mm:ss");
        System.out.println("Last Modified date :"+sf.format(nfile.lastModified()));

    }
}
