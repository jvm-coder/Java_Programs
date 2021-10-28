import java.util.Scanner;
public class Searching {
  public static int search(int arr[], int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arr[] = {
      10,
      20,
      30,
      40,
      50,
      60,
      70,
      80,
      90,
      100
    };
    System.out.print("Enter the number: ");
    int x = input.nextInt();
    System.out.println();

    int result = search(arr, x);
    if (result == -1) {
      System.out.println("Sorry, data not found");
    } else {
      System.out.println("Number " + x + " in index " + search(arr, x) + "");
    }
  }

}
