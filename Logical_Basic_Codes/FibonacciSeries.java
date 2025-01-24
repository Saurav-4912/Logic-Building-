import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms : ");
    int number = sc.nextInt();

    int first = 0 , second = 1;
    for(int i =1 ; i<= number ; i++){
      System.out.print(first + " ");
      int next = first + second;
      first = second;
      second = next;
    }

    sc.close();
  }
}