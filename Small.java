class Small{
 
  public static void main(String args[]) {
 
    String str = "hi hello welcome to bitLabs kjshfkjhhsk";
 
      String words[]=str.split(" ");
      int wordLength=0,max=0;
       String longestWord=null;
    for(int i=0;i<words.length;i++){
    
          wordLength=words[i].length();  // hi-5
              if(max<=wordLength){       // 2<5
                max=wordLength;          // max=5
                 longestWord=words[i];     //hello    
              }
        
    }
    System.out.println("Longest word: "+longestWord);
 
  }
}