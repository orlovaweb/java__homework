package java_homework.homework_1;

// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, 
// на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10
import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Количество элементов в массиве: ");
    int n = iScanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = iScanner.nextInt();
    }
    System.out.printf("На что надо умножить: ");
    int x = iScanner.nextInt();
    for (int i = 0; i < n; i++) {
      arr[i] *= x;
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
