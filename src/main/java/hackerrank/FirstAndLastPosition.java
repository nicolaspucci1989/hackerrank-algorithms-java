package hackerrank;

public class FirstAndLastPosition {
  static public int[] firstAndLastPositionLinear(int[] arr, int target) {
    int start;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        start = i;
        while (i+1 < arr.length && arr[i+1] == target) {
          i+=1;
        }
        return new int[]{ start, i};
      }
    }
    return new int[]{ -1, -1};
  }

  static public int[] firstAndLastPositionBinary(int[] arr, int target) {
    if (arr.length == 0 || arr[0] > target || arr[arr.length-1] < target) {
      return new int[]{ -1, -1};
    }

    int start = findStart(arr, target);
    int end = findEnd(arr, target);
    return new int[]{ start, end };
  }

  static private int findEnd(int[] arr, int target) {
    if (arr[arr.length - 1] == target) {
      return arr[arr.length - 1];
    }
    int left = 0;
    int right = arr[arr.length - 1];
    int mid;

    while (left <= right) {
      mid = (left+right)/2;
      if (arr[mid] == target && arr[mid+1] > target) {
        return mid;
      } else if (arr[mid] > target) {
        right = mid - 1; // start must be in the left part
      } else {
        left = mid + 1; // start must be in the right part
      }
    }
    return -1;
  }
  static private int findStart(int[] arr, int target) {
    if (arr[0] == target) {
      return 0;
    }

    int left = 0;
    int right = arr.length - 1;
    int mid;

    while (left <= right) {
      mid = (left+right)/2;
      if (arr[mid] == target && arr[mid-1] < target) {
        return mid; // start is in the middle
      } else if (arr[mid] < target) {
        left = mid + 1; // start must be in the right part
      } else {
        right = mid - 1; //start must be in the left part
      }
    }

    return -1; // target doesn't exist in arr
  }
}
