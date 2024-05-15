public class agg_ass {
    public static void main(String[] args) {

        MusicPlayer ms = new MusicPlayer("Sony", 25000.00, "Sterio Speaker");
        car obj = new car("Maserati", "MC20",ms);

        // System.out.println(obj.name+" and the model is "+ obj.model +" and have the music player is "+ obj.msp.brandName + " and the price is "+ obj.msp.price+" and have a special function "+obj.msp.spclfunction);
        
        phone ph = new phone("Smart Phone", 1, "Samsung", "S23 ultra", 2023);
        System.out.println(ph.name +" "+ph.bname+" "+ph.modelname+" "+ph.year+" "+ph.id);
    }

}

class car{
    String name;
    String model;
    MusicPlayer msp;

    car(String name,String model,MusicPlayer mspob){
        this.name = name;
        this.model = model;
        this.msp = mspob;

    }

}

class MusicPlayer{
    String brandName;
    double price;
    String spclfunction;
    public MusicPlayer(String brandName, double price, String spclfunction) {
        this.brandName = brandName;
        this.price = price;
        this.spclfunction = spclfunction;
    }
    
}


class brand {
    String bname;
    int year;
    String modelname;
    brand(String bname, String modelname,int year){
        this.bname = bname;
        this.year = year;
        this.modelname = modelname;
    }
}


class phone extends brand{
    String name;
    int id;
    phone(String name, int id,String bname,String modelname,int year){
        super(bname,modelname,year);
        this.name = name;
        this.id = id;  
    }

}