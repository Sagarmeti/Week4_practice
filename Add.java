import java.util.Scanner;
class Add{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={10,20,15,35,5,40,50,70};
    System.out.println("Enter the number:");
    int num=s.nextInt();
    int value=0,count=0,Iindex=-1,Jindex=-1;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==num){
          Iindex=i;
          Jindex=j;
          count++;
        }
      }
      if(count==1){
        System.out.println(Iindex+" "+Jindex);
        System.out.println();
      }
      else{
        System.out.println("There is no index values that can add the entered number");
        break;
      }
      count=0;
    }
    
  }
}