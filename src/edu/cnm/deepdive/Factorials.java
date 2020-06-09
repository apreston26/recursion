package edu.cnm.deepdive;

public class Factorials {
  public static long computeRecursive (int n) {
    long result;
    if (n < 0) {
      throw new IllegalArgumentException("yo stop");
    }
    if (n == 0) {
      result = 1;
    } else {
      result = n * computeRecursive(n - 1);
    }
    return result;
  }

}
