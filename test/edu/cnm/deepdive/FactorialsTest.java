package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FactorialsTest {

  static final long[][] testCases = {
      {0, 	1},
      {1, 	1},
      {5, 	120},
      {10, 	3628800},
      {13,	6227020800L},
  };
  @Test
  void computeRecursive() {
    for(long[] testCase : testCases) {
      int n = (int) testCase[0];
      long expected = testCase[1];
      long actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);
    }
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        Factorials.computeRecursive(-1);
      }
    });
  }
}