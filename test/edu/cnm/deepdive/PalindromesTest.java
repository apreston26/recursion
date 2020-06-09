package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  @Test
  void testRecursive() {
    assertTrue(Palindromes.testRecursive("radar"));
    assertTrue(Palindromes.testRecursive("abba"));
    assertTrue(Palindromes.testRecursive("X"));
    assertTrue(Palindromes.testRecursive(""));
    assertFalse(Palindromes.testRecursive("sonar"));
    assertFalse(Palindromes.testRecursive("abb"));
  }
}