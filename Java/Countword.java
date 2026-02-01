package Java;

import java.util.Scanner;
//count Words

public class Countword {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String nm = sc.nextLine();
    int count = 0;
    for (int i = 0; i < nm.length(); i++) {
      if (nm.charAt(i) != ' ' && (i == 0 || nm.charAt(i - 1) == ' ')) {
        count++;
      }
    }
    System.out.println("Number of word" + count);
  }

}
