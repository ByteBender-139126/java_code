import java.util.*;

public class table {
  public static void main(String args[]){
    int n,i;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the value to print table");
      n=sc.nextInt();
    }
    for(i=1;i<=10;i++){
      System.out.println(+n+"X"+i+"="+n*i);
    }
  }
}