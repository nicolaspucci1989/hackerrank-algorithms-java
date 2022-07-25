package hackerrank;

import java.util.*;

public class HackerRankAlgorithms {
  static public int diagonalDifference(List<List<Integer>> arr) {
    int acumulator = 0;
    int size = arr.size();

    for (int i = 0; i < size; i++) {
      List<Integer> subArray = arr.get(i);
      acumulator += subArray.get(i) - subArray.get(subArray.size() - i - 1);
    }

    return Math.abs(acumulator);
  }

  static public List<Float> plusMinus(List<Integer> arr) {
    /* Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
    Print the decimal value of each fraction on a new line with  places after the decimal. */
    List<Float> result = new ArrayList<>();
    int size = arr.size();
    float positiveAcum = 0;
    float negativeAcum = 0;
    float zeroAcum = 0;

    for (Integer integer : arr) {
      if (integer > 0) {
        positiveAcum++;
      } else if (integer < 0) {
        negativeAcum++;
      } else {
        zeroAcum++;
      }
    }

    result.add(positiveAcum / size);
    result.add(negativeAcum / size);
    result.add(zeroAcum / size);

    return result;
  }

  static public void staircase(int num) {
    String symbolA = " ";
    String symbolB = "#";

    for (int i = 0; i < num; i++) {
      String str = "";

      for (int j = i; j < num - 1; j++) {
        str = str.concat(symbolA);
      }

      for (int y = 0; y < i + 1; y++) {
        str = str.concat(symbolB);
      }

      System.out.println(str);
    }
  }

  static public List<Long> minMaxSum(List<Integer> arr) {
    long max = 0;
    long min = 0;
    int limit = arr.size() - 1;

    arr.sort(Collections.reverseOrder());
    for (int i = 0; i < limit; i++) {
      max += arr.get(i);
    }

    arr.sort(null);
    for (int i = 0; i < limit; i++) {
      min += arr.get(i);
    }

    return Arrays.asList(min, max);
  }

  static public boolean abc(String word, List<String> blocks) {
    if (word.isEmpty()) {
      return true;
    }

    char c = word.charAt(0); // grab the first character in the word
    for (int i = 0; i < blocks.size(); i++) { // for each block in the blocks list
      String b = blocks.get(i); // grab the first block

      if (b.charAt(0) != c && b.charAt(1) != c) // if no characters in the block coincide, continue
        continue;

      Collections.swap(blocks, 0, i); // put found block at position 0
      if (abc(word.substring(1), blocks.subList(1, blocks.size()))) // call abc without the found character and without the used block
        return true;

      Collections.swap(blocks, 0, i);
    }

    return false;
  }

  static public int factorial(int number) {
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }

  static public boolean isPalindrome(String word) {
    int start = 0;
    int end = word.length() - 1;

    while (start < end) {
      if (word.charAt(start) != word.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }

    return true;
  }

  static public boolean isPalindrome(int number) {
    int copy = number;
    int reversed = 0;
    int remainder;

    while (number != 0) {
      remainder = number % 10;
      reversed = reversed * 10 + remainder;
      number /= 10;
    }
    return copy == reversed;
  }

  static public String toCamelCase(String s) {
    StringBuilder result = new StringBuilder();

    char c = s.charAt(0);
    result.append(Character.toLowerCase(c));

    for (int i = 1; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isUpperCase(ch)) {
        result.append("_");
        result.append(Character.toLowerCase(ch));
      } else {
        result.append(ch);
      }
    }

    return result.toString().toLowerCase(Locale.ROOT);
  }

  static public void phoneBookMap() {
    Map<String, Integer> phoneBook = new HashMap<>();
    List<String> names = new ArrayList<>();

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      phoneBook.put(name, phone);
    }
    while(in.hasNext()){
      String s = in.next();
      names.add(s);
    }
    in.close();

    names.forEach(name -> {
      Integer phone = phoneBook.get(name);
      if (phone != null) {
        System.out.printf("%s=%d\n", name, phoneBook.get(name));
      } else {
        System.out.println("Not found");
      }
    });
  }

  static public int recursiveFactorial(int n) {
      if(n > 1) {
        return n * recursiveFactorial(n - 1);
      }
      // Base Case n = 1
      else {
        return n;
      }
  }
}
