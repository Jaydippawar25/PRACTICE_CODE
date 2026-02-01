package Java;

import java.util.Scanner;
//vowels 

public class vowels {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String:");
    String nm = sc.nextLine();

    int count = 0;
    for (int i = 0; i < nm.length(); i++) {
      char ch = nm.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
          || ch == 'O' || ch == 'U') {
        count++;
      }

    }
    System.out.println("Vowels in String is: " + count);
  }
}
