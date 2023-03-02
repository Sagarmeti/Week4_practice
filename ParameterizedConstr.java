public class ParameterizedConstr {
   
    public void m1() {
        System.out.println("this is instance method");
    }
    
    public static void m2() {
        System.out.println("this is static method");
    }
    
    
    
    public ParameterizedConstr(int a,int b,int c) {
        System.out.println("parametarized constructor");
    }
    public static void main(String[] args) {
    
    ParameterizedConstr obj=new ParameterizedConstr(10,20,30);
        
        
        
    }
               
}
 