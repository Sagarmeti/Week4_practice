class Long {
 
  public static void main(String args[]) {
 
    String str = "hi hello welcome to bitLabs kjshfkjhhsk";
 
      String words[]=str.split(" ");
      int wordLength=0,max=0;
       String longestWord=null;
    for(int i=0;i<words.length;i++){
    
          wordLength=words[i].length();  
              if(max<=wordLength){      
                max=wordLength;          
                 longestWord=words[i];         
              }
        
    }
    System.out.println("Longest word: "+longestWord);
 
  }
}