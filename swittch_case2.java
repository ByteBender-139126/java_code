import java.util.*;

public class swittch_case2 {
  float a,b,c;
  int A;

  void calc()
  {
    System.out.println("Enter 1 for Addition.\nEnter 2 for multiplication.\nEnter 3 for divison.\nEnter 4 for substraction.");
    try (Scanner sc = new Scanner(System.in)) {
      A=sc.nextInt();
      switch(A){
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

  void table(){
    int n,i;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the value to print table");
      n=sc.nextInt();
    }
    for(i=1;i<=10;i++){
      System.out.println(+n+"X"+i+"="+n*i);
    }
  }

  void linear(){
      Scanner a = new Scanner(System.in);
      int n,i,key,k=0;

      System.out.println("Enter the size of Array");
      n=a.nextInt();
      int arr[]=new int[n];

      System.out.println("Enter the elment of array");
      for(i=0;i<n;i++){
        arr[i]=a.nextInt();
      }

      System.out.println("Enter the key"); //without semicolon
      key=a.nextInt();

      for(i=0;i<n;i++){
        if(key==arr[i]){
          System.out.println("key:" +key+ "found at" +(i+1));
          k ++;
      }
      }
    
    if(k==0)
    {
      System.out.println("Key not Found in the array");
    }
  }
  

  void bubble(){
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

  public static void main(String args[])
  {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter 1 for calculator.\nEnter 2 to print table.\nEnter 3 for bubble sort.\nEnter 4 for linear search.\nExit.");
      int B;
      B=sc.nextInt();
      swittch_case2 sc1=new swittch_case2();
      switch(B)
      {
        case 1:
        sc1.calc();
        break;

        case 2:
        sc1.table();
        break;

        case 3:
        sc1.bubble();
        break;

        case 4:
        sc1.linear();
        break;

        default:System.out.println("Enter a valid input.");
      }
    }
  }
}