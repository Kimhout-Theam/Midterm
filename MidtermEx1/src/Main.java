import java.util.Scanner;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the short date (YYYY-MM-DD): ");
        String date = input.nextLine();
        String[] split = date.split("-");
      int month = Integer.parseInt(split[1]);
      Month monthName = Month.of(month);
      System.out.println(monthName +" " + split[2]+", "+split[0]);
        intput.close();
        }
    }
