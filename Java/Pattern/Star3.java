package Java.Pattern;

import java.util.Scanner;

public class Star3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a no of Rows:");
    int num = sc.nextInt();
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

  }

}
// 1234
// 1234
// 1234
// 1234
