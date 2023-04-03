package java_homework.homework_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием и выборкой.
public class ex1 {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 4, 7, 1, 3, 2, 6));
    List<Integer> sortedArray = mergeSort(arr);
    for (int i = 0; i < sortedArray.size(); i++) {
      System.out.print(sortedArray.get(i) + " ");
    }
    System.out.println("");
    selectionSort(arr);
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + " ");
    }
  }

  // Сортировка слиянием
  public static List<Integer> mergeSort(List<Integer> arr) {
    if (arr.size() <= 1) {
      return arr;
    }
    int mid = arr.size() / 2;
    List<Integer> left = new ArrayList<>(arr.subList(0, mid));
    List<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));
    left = mergeSort(left);
    right = mergeSort(right);
    return merge(left, right);
  }

  public static List<Integer> merge(List<Integer> left, List<Integer> right) {
    List<Integer> result = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < left.size() && j < right.size()) {
      if (left.get(i) <= right.get(j)) {
        result.add(left.get(i));
        i++;
      } else {
        result.add(right.get(j));
        j++;
      }
    }
    while (i < left.size()) {
      result.add(left.get(i));
      i++;
    }
    while (j < right.size()) {
      result.add(right.get(j));
      j++;
    }
    return result;
  }

  // Сортировка выбором
  public static void selectionSort(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j) < list.get(minIndex)) {
          minIndex = j;
        }
      }
      int temp = list.get(i);
      list.set(i, list.get(minIndex));
      list.set(minIndex, temp);
    }
  }
}
