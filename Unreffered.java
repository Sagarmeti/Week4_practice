public class Unreffered{
   
    public void m1() {
        System.out.println("this is instance method");
    }
    
    public static void m2() {
        System.out.println("this is static method");
    }
    
    public Unreffered() {
        System.out.println("This is constructor");
    }
    
    public static void main(String[] args) {
    
        new Unreffered().m1();
        
        
        
    }
               
}