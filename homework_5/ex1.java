package java_homework.homework_5;

import java.util.ArrayList;
import java.util.HashMap;

public class ex1 {

  static void add(HashMap<String, ArrayList<String>> book, String name, String phone) {
    if (book.containsKey(name)) {
      ArrayList<String> phones = get(book, name);
      phones.add(phone);
      book.put(name, phones);
    } else {
      ArrayList<String> phones = new ArrayList<>();
      phones.add(phone);
      book.put(name, phones);
    }
  }

  static ArrayList<String> get(HashMap<String, ArrayList<String>> book, String name) {
    return book.get(name);
  }

  static void remove(HashMap<String, ArrayList<String>> book, String name) {
    book.remove(name);
  }

  static void printAll(HashMap<String, ArrayList<String>> book) {
    for (String name : book.keySet()) {
      System.out.println(name + ": " + book.get(name));
    }
  }

  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> book = new HashMap<>();
    // PhoneBook phoneBook = new PhoneBook();
    add(book, "Иванов Иван", "1234567890");
    add(book, "Иванов Иван", "0987654321");
    add(book, "Иванов Семен", "0987654321");
    printAll(book);
  }
}
