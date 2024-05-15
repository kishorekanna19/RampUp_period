public class oops  {

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
        
        // oops obj = new oops();
        // oops obj1 = new oops("This is from parameterized constructor");
        // oops obb = new oops(obj1);

        // System.out.println(obj.getname()+"\n "+obj1.getname()+"\n"+ obb.getname() );

        C ob = new C();
        ob.methodA();
        ob.methodB();
        ob.methodC();

    }
}

//Constructor Chaining - always Super() is called in the child class

// Inheritance

//Single Inheritance
class A{
    void methodA(){
        System.out.println("\nThis is parent class and called by super executes first\n");
    }
}

class B extends A{
    void methodB(){
        System.out.println("This is child class and executes second \n");
    }
}


//Multiple Inheritance is not supported by java. it is acheived using the interface

//multi-level inheritance

class C extends B{
        void methodC(){
        System.out.println("This is for multi-level inheritance\n");
    }
}




