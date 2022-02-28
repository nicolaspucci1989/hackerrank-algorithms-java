package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
}
