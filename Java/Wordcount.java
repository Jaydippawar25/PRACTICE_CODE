package Java;

import java.util.Scanner;
// words count split

public class Wordcount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String nm = sc.nextLine();

    String[] words = nm.split("\\s+");

    System.out.println("Number of words:" + words.length);
  }

}
