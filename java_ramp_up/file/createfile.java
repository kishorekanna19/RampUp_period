package file;

import java.io.File;

public class createfile {
    public static void main(String[] args) {

        try{
            File f = new File("D:/Ramp_Up/newfile.txt");
            boolean fva = f.createNewFile();

            if(fva){
                System.out.println("File is Created");
            }else{
                System.out.println("File is not Created");
            }



        }catch(Exception e){
            System.out.println("Exception occured");
            e.printStackTrace();
        }
      

    }
}
