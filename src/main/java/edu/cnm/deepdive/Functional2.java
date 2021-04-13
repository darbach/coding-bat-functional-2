package edu.cnm.deepdive;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {

  /**
   * Given a list of integers, return a list of the integers, omitting any that are less than 0.
   * <p>
   * noNeg([1, -2]) → [1] noNeg([-3, -3, 3, 3]) → [3, 3] noNeg([-1, -1, -1]) → []
   *
   * @param nums values to be operated upon
   * @return a list of values with 0s removed
   */
  public List<Integer> noNeg(List<Integer> nums) {
    nums.removeIf((n) -> {
      return n < 0;
    });
    return nums;
  }

  /**
   * Given a list of non-negative integers, return a list of those numbers except omitting any that
   * end with 9. (Note: % by 10)
   *
   * no9([1, 2, 19]) → [1, 2]
   * no9([9, 19, 29, 3]) → [3]
   * no9([1, 2, 3]) → [1, 2, 3]
   *
   * @param nums values to be operated upon
   * @return all values ending with "9" removed
   */
  public List<Integer> no9(List<Integer> nums) {
    nums.removeIf((n) -> n % 10 == 9);
    return nums;
  }

  /**
   * Given a list of integers, return a list of those numbers, omitting any that are between 13 and
   * 19 inclusive.
   *
   * noTeen([12, 13, 19, 20]) → [12, 20]
   * noTeen([1, 14, 1]) → [1, 1]
   * noTeen([15]) → []
   *
   * @param nums values to be operated upon
   * @return all teen numbers removed
   */
  public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf((n) -> (n >= 13) && (n <= 19));
    return nums;
  }

  /**
   * Given a list of strings, return a list of the strings, omitting any string that contains a "z".
   * (Note: the str.contains(x) method returns a boolean)
   *
   * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
   * noZ(["hziz", "hzello", "hi"]) → ["hi"]
   * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
   *
   * @param strings values to be operated upon
   * @return strings that do not contain any "z"s
   */
  public List<String> noZ(List<String> strings) {
    strings.removeIf((s) -> s.contains("z"));
    return strings;
  }

  /**
   * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
   *
   * noLong(["this", "not", "too", "long"]) → ["not", "too"]
   * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
   * noLong(["cccc", "cccc", "cccc"]) → []
   *
   * @param strings values to be operated upon
   * @return strings that are shorter than 4 characters
   */
  public List<String> noLong(List<String> strings) {
    strings.removeIf((s) -> s.length() >= 4);
    return strings;
  }

  /**
   * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
   *
   * no34(["a", "bb", "ccc"]) → ["a", "bb"]
   * no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
   * no34(["ccc", "dddd", "apple"]) → ["apple"]
   *
   * @param strings values to be operated upon
   * @return strings that are not 3 or 4 characters long
   */
  public List<String> no34(List<String> strings) {
    strings.removeIf((s) -> s.length() == 3 || s.length() == 4);
    return strings;
  }

  /**
   * Given a list of strings, return a list where each string has "y" added at its end, omitting any
   * resulting strings that contain "yy" as a substring anywhere.
   *
   * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
   * noYY(["a", "b", "cy"]) → ["ay", "by"]
   * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
   *
   * @param strings values to be operated upon
   * @return strings with "y" appended but omitted if they contain "yy"
   */
  public List<String> noYY(List<String> strings) {
    return strings.stream()
        .map((s) -> s + "y")
        .filter((s) -> !s.contains("yy"))
        .collect(Collectors.toList());
  }

  /**
   * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting
   * any of the resulting numbers that end in 2.
   *
   * two2([1, 2, 3]) → [4, 6]
   * two2([2, 6, 11]) → [4]
   * two2([0]) → [0]
   *
   * @param nums values to be operated upon
   * @return numbers multiplied by 2 and omitted if they end in 2
   */
  public List<Integer> two2(List<Integer> nums) {
    return nums.stream()
        .map((i) -> i * 2)
        .filter((i) -> i % 10 != 2)
        .collect(Collectors.toList());
  }

  /**
   * Given a list of integers, return a list of those numbers squared and the product added to 10,
   * omitting any of the resulting numbers that end in 5 or 6.
   *
   * square56([3, 1, 4]) → [19, 11]
   * square56([1]) → [11]
   * square56([2]) → [14]
   *
   * @param nums values to be operated upon
   * @return numbers squared, added to 10, and ommitting any that end in 5 or 6
   */
  public List<Integer> square56(List<Integer> nums) {
    return nums.stream()
        .map((i) -> i * i + 10)
        .filter((i) -> (i % 10 != 5) && (i % 10 != 6))
        .collect(Collectors.toList());
  }

}
