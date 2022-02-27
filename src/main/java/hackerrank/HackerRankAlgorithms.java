package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HackerRankAlgorithms {
  static public ArrayList<Integer> fizzBuzz(int n) {
    ArrayList<Integer> result = new ArrayList<>();
    int a = 0;
    int b = 0;

    result.add(a);
    result.add(b);

    return result;
  }

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

    result.add(positiveAcum/size);
    result.add(negativeAcum/size);
    result.add(zeroAcum/size);

    return result;
  }
}
