import java.util.*;
public class bubble_sort 
{
  public static void main(String args[])
  {
    try (Scanner bs = new Scanner(System.in)) {
      int i,j,n,temp;
      System.out.println("Enter the size of array");
      n=bs.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the element of array");
      for(i=0;i<n;i++){
        arr[i]=bs.nextInt();
      }

      int k;
      System.out.println("Enter 1 to print array");
      System.out.println("Enter 2 to  not print array");
      k=bs.nextInt();
      
      switch(k){
        case 1:for(i=0;i<n;i++){
          System.out.println(arr[i]);
        }
          break;

          case 2:System.out.println("(^///^)");
          break;

          default:System.out.println("input correct value");
      }
      for(i=0;i<n;i++){
        for(j=0;j<n-i-1;j++){
          if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }
      }
      System.out.println("Sorted array:");
      for(i=0;i<n;i++){
        System.out.println(arr[i]);
      }
    }
  }
}
