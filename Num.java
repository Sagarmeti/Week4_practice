class Num{
  public static void main(String args[]){
    
    int  upcount=0,lowcount=0;
    String str = "Hi Hello, welcome to bitLabs";
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
      upcount++;
  }
      else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
        lowcount++;
      }
    }
    System.out.println("Upper case letters are:"+upcount);
    System.out.println("Lower case letters are:"+lowcount);
}
}