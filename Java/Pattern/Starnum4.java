package Java.Pattern;

import java.util.Scanner;

public class Starnum4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of rows:");
    int num = sc.nextInt();
    for (int i = num; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
  // 1234
  // 123
  // 12
  // 1

}
