package Java;

import java.util.Scanner;
//String Palindrome

public class Stringpalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your name");
    String name = sc.nextLine();
    String rev = "";

    for (int i = name.length() - 1; i >= 0; i--) {
      rev = rev + name.charAt(i);
    }
    if (name.equals(rev)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }

}
