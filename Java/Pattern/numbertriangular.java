package Java.Pattern;

import java.util.Scanner;

public class numbertriangular {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of rows:");
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      for (int j = 0; j <= num - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i; k++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

}
