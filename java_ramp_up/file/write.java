package file;

import java.io.*;

public class write {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        String msg = "Hii this is kishore writting words into file by converting it into a byte array";

        try{

            file = new File("D:/FHLB_Ramp_ups/RampUp_period/newfile.txt");

            fos = new FileOutputStream(file);

            if(!file.exists()){
                file.createNewFile();
            }


            byte[] bytes = msg.getBytes();


            fos.write(bytes);
            fos.flush();

            System.out.println("Written into a file is successfully completed");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        finally{
            try{
                if(fos != null){
                    fos.close();
                }
            }catch(IOException ioe){
                ioe.printStackTrace();
            }
           
        }
    }
}
