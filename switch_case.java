import java.util.*;
public class switch_case{
  public static void main(String args[]){
    int month=7;
    String month_name="";

    switch(month){
      case 1:month_name="JANUARY";
      break;

      case 2:month_name="FEBUARY";
      break;

      case 3:month_name="MARCH";
      break;

      case 4:month_name="APRIL";
      break;

      case 5:month_name="MAY";
      break;

      case 6:month_name="JUNE";
      break;

      case 7:month_name="JULY";
      break;

      case 8:month_name="AUGUST";
      break;

      case 9:month_name="SEPTEMBER";
      break;

      case 10:month_name="OCTOBER";
      break;

      case 11:month_name="NOVNEMBER";
      break;

      case 12:month_name="DECEMBER";
      break;

      default:System.out.println("no valid input");
    }
    System.out.println(month_name);
  }
}