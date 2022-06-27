import java.util.Scanner;
public class ArrayDemo{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int arr[] = new int[25];
    int i,j;
    for(i=0;i<25;i++){
      System.out.println("Enter the " + i+1 +" Element : ");
      arr[i] = scan.nextInt();
    }
    
    for(j=0;j<25;j++){
      System.out.print(arr[j]+" ");
      
    }

  }
}
