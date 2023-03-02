public class Constructor{
   
    public void m1() {
        System.out.println("this is instance method");
    }
    
    public static void m2() {
        System.out.println("this is static method");
    }
    
    public Constructor() {
        System.out.println("This is constructor");
    }
    
    public static void main(String[] args) {
    
        Constructor obj=new Constructor();
        //obj.m1();
        //obj.m2();
    }
               
}