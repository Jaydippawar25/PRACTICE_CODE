package Java;

import java.util.Scanner;
//Binary number

public class Binary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Search number:");
    String num = sc.next();
    char ch = 0;
    for (int i = 0; i < num.length(); i++) {
      ch = num.charAt(i);
    }
    if (ch == '0' || ch == '1') {
      System.out.println(" Binary num");

    } else {
      System.out.println("Not Binary num");

    }

  }

}
