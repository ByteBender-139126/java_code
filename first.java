import java.util.*;

class first{
  public static void main(String args[]){
    try (Scanner f = new Scanner(System.in)) {
      int a,b,c;
      System.out.println("Enter two number to add");
      a=f.nextInt();
      b=f.nextInt();
      c=a+b;
    }
    System.out.println("Sum:"+c);
  }
}