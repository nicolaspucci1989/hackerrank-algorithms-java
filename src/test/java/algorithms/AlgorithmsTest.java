package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static hackerrank.HackerRankAlgorithms.*;

@DisplayName("Algorithms tests")
public class AlgorithmsTest {

  @Test
  @DisplayName("diagonal difference")
  public void diagonalDifferenceTest() {
    List<List<Integer>> squareMatrix = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>();
    List<Integer> row2 = new ArrayList<>();
    List<Integer> row3 = new ArrayList<>();

    row1.add(1);
    row1.add(2);
    row1.add(3);

    row2.add(4);
    row2.add(5);
    row2.add(6);

    row3.add(9);
    row3.add(8);
    row3.add(9);

    squareMatrix.add(row1);
    squareMatrix.add(row2);
    squareMatrix.add(row3);

    Assert.assertEquals(2, diagonalDifference(squareMatrix));
  }

  @Test
  @DisplayName("Plus minus")
  public void plusMinusTest() {
    List<Integer> arr = new ArrayList<>();

    arr.add(1);
    arr.add(1);
    arr.add(0);
    arr.add(-1);
    arr.add(-1);

    List<Float> expected = Arrays.asList(2f/5, 2f/5, 1f/5);
    List<Float> result = plusMinus(arr);

    Assert.assertEquals(expected.get(0), result.get(0));
    Assert.assertEquals(expected.get(1), result.get(1));
    Assert.assertEquals(expected.get(2), result.get(2));
  }
}
