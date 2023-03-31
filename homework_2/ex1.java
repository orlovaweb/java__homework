package java_homework.homework_2;

public class ex1 {
  // Посчитайте сколько драгоценных камней в куче обычных камней
  // Пример:
  // jewels = “aB”, stones = “aaaAbbbB”
  // Результат в консоль ”a3B1”
  public static String findJewelsInStones(String jewels, String stones) {
    char[] jewelsArr = jewels.toCharArray();
    char[] stonesArr = stones.toCharArray();
    String result = "";
    for (char jewel : jewelsArr) {
      int count = 0;
      for (char stone : stonesArr) {
        if (jewel == stone)
          count++;
      }
      result = result + jewel + count;

    }
    return result;
  }

  public static void main(String[] args) {
    String jewels = "aB";
    String stones = "aaaAbbbB";
    String result = findJewelsInStones(jewels, stones);
    System.out.println(result);
  }

}
