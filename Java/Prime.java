package Java;

import java.util.Scanner;
//Prime

public class Prime {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = sc.nextInt();
    if (num <= 0) {
      System.out.println("Not Prime");

    } else {
      for (int i = 2; i <= num;) {
        if (num % i == 0) {
          System.out.println("Not prime");
          break;
        } else {
          System.out.println("Prime");
          break;
        }
      }

    }
  }

}
