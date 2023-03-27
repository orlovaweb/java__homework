// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
//  Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331
package java_homework.homework_1;

import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    int[] arr = new int[1000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    int[] arr3 = new int[1000];
    for (int i = 0; i < arr.length; i++) {
      arr3[i] = (int) Math.pow(arr[i], 3);
    }
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Первое число: ");
    int x = iScanner.nextInt();
    System.out.printf("Второе число: ");
    int y = iScanner.nextInt();

    System.out.println(arr3[x - 1]);
    System.out.println(arr3[y - 1]);

  }
}
