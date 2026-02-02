package Java;

import java.util.Scanner;
//Palindrome

class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entar a number: ");
    int num = sc.nextInt();

    int rev = 0;
    int temp = num;

    while (num > 0) {
      int sum = num % 10;
      rev = rev * 10 + sum;
      num = num / 10;

    }
    if (temp == rev) {
      System.out.println("Palindrome");

    } else {
      System.out.println("Not Palindrome");
    }
  }

}