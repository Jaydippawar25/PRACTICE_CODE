package Java;

class Missingnumber {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 5 };
    int num = 5;
    int sum = num * (num + 1) / 2;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += arr[i];
    }
    int missnum = sum - count;
    System.out.println(missnum);
  }

}