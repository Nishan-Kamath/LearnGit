public class LinearSearch{
  
  public static int ls(int arr[] ,int key){
    int n = arr.length;
    int i;
    for(i=0;i<n:i++){
      if(arr[i] == key)
        return i+1;
    }
    return -1;
  }
  public static void main(String [] args){
    int arr[] = {12 ,8 ,6 ,1 ,7 ,3 ,2 ,4};
    int key = 2;
    int rr = ls(arr ,key);
    if(rr != -1)
      System.out.println("Element " + key + "found at position " + rr);
    else
      System.out.println("Element " + key + " not found"):
  }
}
