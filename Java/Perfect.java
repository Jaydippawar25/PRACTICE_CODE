package Java;

import java.util.Scanner;
//Perfect

public class Perfect {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    if (sum == num) {
      System.out.println("Perfact number");
    } else {
      System.out.println("Not Perfact");
    }
  }

}
