public class oops {

     String name;
  
    public oops(){
       this.name = " This is from default constructor";
    }

    public oops(String name){
       this.name = name;
    }


    //copy Constructor
    public oops(oops ob){
        name = ob.name;
    }

    public  String getname(){
        return name;
    }
    public static void main(String[] args) {
        
        oops obj = new oops();
        oops obj1 = new oops("This is from parameterized constructor");
        oops obb = new oops(obj1);

        System.out.println(obj.getname()+"\n "+obj1.getname()+"\n"+ obb.getname() );

        // B ob = new B();
    }
}

//Constructor Chaining - always Super() is called in the child class

class A{
    A(){
        System.out.println("This is parent class and called by super executes first");
    }
}

class B extends A{
    B(){
        System.out.println("This is child class and executes second ");
    }
}


