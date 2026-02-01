package Java;

import java.util.Scanner;
//Smallest & largest no

public class Smallandlarg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter element:");
      arr[i] = sc.nextInt();
    }
    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < n; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("Smallest num is:" + min);
    System.out.println("Largest numis:" + max);
  }

}
