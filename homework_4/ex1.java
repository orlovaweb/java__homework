package java_homework.homework_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ex1 {

  // Дан Deque состоящий из последовательности цифр.
  // Необходимо проверить, что последовательность цифр является палиндромом
  public static boolean checkOn(Deque<Integer> deque) {
    Boolean flag = true;
    int len = deque.size() / 2;
    for (int i = 0; i < len; i++) {
      if (deque.pollFirst() != deque.pollLast())
        flag = false;

    }
    if (flag)
      System.out.println("Yes");
    else
      System.out.println("No");
    return false;
  }

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 1, 4, 3, 2, 1));
    checkOn(deque);
  }

}