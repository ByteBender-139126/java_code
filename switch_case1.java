import java.util.*;

public class switch_case1 {
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      int a,b,c,e;
      System.out.println("Enter 1 for Addition.\nEnter 2 for multiplication.\nEnter 3 for divison.\nEnter 4 for substraction.");
      e=sc.nextInt();
      switch(e){
        case 1:
        System.out.println("addition");
        System.out.println("input the value");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println(+a+"+"+b+"="+c);
        break;

        case 2:
        System.out.println("multiplication");
        System.out.println("input the value");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b;
        System.out.println(+a+"*"+b+"=" +c);
        break;

        case 3:
        System.out.println("divison");
        System.out.println("input the value");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a/b;
        System.out.println(+a+"/"+b+"="+c);
        break;

        case 4:
        System.out.println("substraction");
        System.out.println("input the value");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a-b;
        System.out.println(+a+"-"+b+"="+c);
        break;

        default:System.out.println("Enter the default value");
      }
    }
  }
}