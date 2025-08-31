package jswitchsrc;
class A{
    A(){
        System.out.println("Inside A Default Constructor   ");
    }
    A(int A){
        this();
        System.out.println("Inside A Parameterized constructor.");
    }

}
class B extends A{
    B(){
        // i have not mentioned it explicitly but there is a super method called here whcih do nothing but call the default 
        // constructor of the super class and if there is any parameterised constructor in the super calss which need to be called here with the help of the supter mehtod then simply pass the parameter in the super methhod by writing it explicity and it will work.
        super(5);
        System.out.println("Inside B Default Constructor");
    }

    B(int n){
        //super();//this is there by defualt but it is not visible but can be also called explicitly and if called with the parameter then it will first execute the parameterised constructor of the super class then the further code execution of the block in whic the super method is called.
        this(); //now instead of the constructor or the parameterised constructor of the super class if firstly want to call the default constructor of ths class then this method will work it will first call the default constructor of the same calass then it will begin with the reaming code of block where it is mentioned.
        System.out.println("Inside B Parameterised constructor ");
    }
}

public class Jtbv51 {
    public static void main(String []args){
        /*
         * Now the below code will intialized the object and as usual call the contructor of the class.
         * but here the default consturctor of class a will be called first an then the b one 
         * reason is supter method.
         * 
        */
        B b  = new B(); //this will first call the default constructor of b and there the file line will call the default constructor of a and there after it will resume with the code mentiont in the default constructor of the class b
        System.out.println("---- SEPARATOR TEXT ----");
        B b1 = new B(5); //this will first call the parameterised constructor of b and there the first line will call the default constructor for the claa a and thereafter it will resume with the execution of the remaing code of the parameterised consturctor of class b;

    }
}
