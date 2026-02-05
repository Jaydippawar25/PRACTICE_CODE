package Java.Pattern;

import java.util.Scanner;

public class Starnum3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of Rows:");
    int num = sc.nextInt();
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

}
