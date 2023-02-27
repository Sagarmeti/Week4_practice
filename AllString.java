class AllString{
  public static void main(String args[]){
    String str="Hi Hello 123 ^&&3 welcome 923%$# to bitLabs";
    int upcount=0,lowcount=0,num=0,spcl=0,space=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        upcount++;
      }

      else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
      lowcount++;
        }
      else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        num++;
        
      }
      else if(str.charAt(i)!=' '){
        spcl++;
    }
      else{
        space++;
      }
  }
    System.out.println("Upper case:"+upcount);
    System.out.println("Lower case:"+lowcount);
    System.out.println("Number of digits:"+num);
    System.out.println("Special character:"+spcl);
     System.out.println("Spaces:"+space);
}
}
