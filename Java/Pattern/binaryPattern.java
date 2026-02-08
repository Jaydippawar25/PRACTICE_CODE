package Java.Pattern;

import java.util.Scanner;

public class binaryPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of Rows:");
    int num = sc.nextInt();

    char ch = 0;
    for (int i = 0; i <= num; i++) {
      for (int j = 0; j < i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("0");
        } else {
          System.out.print("1");
        }

      }
      System.out.println();
    }
  }
}
