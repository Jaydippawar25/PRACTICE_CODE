package Java;

import java.util.Scanner;
//Sum of Even and Odd in Array

public class sumofeven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number of elements:");
    int num = sc.nextInt();
    int arr[] = new int[num];
    int even_sum = 0;
    int odd_sum = 0;
    for (int i = 0; i < num; i++) {
      System.out.println("Enter a Elements:");
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < num; i++) {
      if (arr[i] % 2 == 0) {
        even_sum = even_sum + arr[i];

      } else {
        odd_sum = odd_sum + arr[i];
      }

    }
    System.out.println("Even Sum:" + even_sum);
    System.out.println("Odd Sum" + odd_sum);

  }

}
