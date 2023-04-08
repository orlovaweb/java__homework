package java_homework.homework_4;

import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.Arrays;

public class ex3 {

  // Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']',
  // определите,
  // является ли входная строка логически правильной.
  // Входная строка логически правильная, если:
  // 1) Открытые скобки должны быть закрыты скобками того же типа.
  // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая
  // закрывающая скобка имеет соответствующую
  // открытую скобку того же типа.
  // ()[] = true
  // () = true
  // {[()]} = true
  // ()() = true
  // )()( = false

  public static boolean validate(Deque<String> deque) {
    Deque<String> storage = new ArrayDeque<>();
    while (deque.size() > 0) {
      String firstDeque = deque.pollFirst();
      String lastStorage = storage.peekLast();
      if ((firstDeque == "(" || firstDeque == "[" || firstDeque == "{")) {
        storage.addLast(firstDeque);
      } else if ((firstDeque == ")" && lastStorage == "(") || (firstDeque == "}" && lastStorage == "{")
          || (firstDeque == "]" && lastStorage == "[")) {
        storage.removeLast();
      } else {
        storage.addLast(firstDeque);
      }
    }
    if (storage.size() > 0) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Deque<String> d1 = new ArrayDeque<>(Arrays.asList("(", "{", "[", "]", "}", ")", "(", ")"));
    if (validate(d1)) {
      System.out.println("Правильная");
    } else {
      System.out.println("Неправильная");
    }
  }

}