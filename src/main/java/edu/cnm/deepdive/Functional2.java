package edu.cnm.deepdive;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {

  /**
   * Given a list of integers, return a list of the integers, omitting any that are less than 0.
   *
   * noNeg([1, -2]) → [1]
   * noNeg([-3, -3, 3, 3]) → [3, 3]
   * noNeg([-1, -1, -1]) → []
   *
   * @param nums values to be operated upon
   * @return a list of values with 0s removed
   */
  public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf((n) -> { return n < 0; });
    return nums;
  }

}
