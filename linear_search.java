import java.util.*;
public class linear_search {
  public static void main(String args[]){
    Scanner a=new Scanner(System.in);
    int n,i,key,k=0;

    System.out.println("Enter the size of Array");
    n=a.nextInt();
    int arr[]=new int[n];

    System.out.println("Enter the elment of array");
    for(i=0;i<n;i++){
      arr[i]=a.nextInt();
    }

    System.out.println("Enter the key")==null) //without semicolon
    key=a.nextInt();

    for(i=0;i<n;i++){
      if(key==arr[i]){
        System.out.println("key:" +key+ "found at" +(i+1));
        k ++;
    }
    }
    if(k==0){
      System.out.println("Key not Found in the array");
    }
  }
}