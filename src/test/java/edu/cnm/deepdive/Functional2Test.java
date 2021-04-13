package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Functional2Test {

  private static final Functional2 functional2 = new Functional2();

  @ParameterizedTest(name = "[{index}]Asserting noNeg({0}) == {1}.")
  @MethodSource({"noNeg"})
  void noNeg(List<Integer> nums, List<Integer> expected) {
    List<Integer> input = new ArrayList<>(nums);
    assertArrayEquals(expected.toArray(), functional2.noNeg(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting no9({0}) == {1}.")
  @MethodSource({"no9"})
  void no9(List<Integer> nums, List<Integer> expected) {
    List<Integer> input = new ArrayList<>(nums);
    assertArrayEquals(expected.toArray(), functional2.no9(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting noTeen({0}) == {1}.")
  @MethodSource({"noTeen"})
  void noTeen(List<Integer> nums, List<Integer> expected) {
    List<Integer> input = new ArrayList<>(nums);
    assertArrayEquals(expected.toArray(), functional2.noTeen(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting noZ({0}) == {1}.")
  @MethodSource({"noZ"})
  void noZ(List<String> strings, List<String> expected) {
    List<String> input = new ArrayList<>(strings);
    assertArrayEquals(expected.toArray(), functional2.noZ(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting noLong({0}) == {1}.")
  @MethodSource({"noLong"})
  void noLong(List<String> strings, List<String> expected) {
    List<String> input = new ArrayList<>(strings);
    assertArrayEquals(expected.toArray(), functional2.noLong(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting no34({0}) == {1}.")
  @MethodSource({"no34"})
  void no34(List<String> strings, List<String> expected) {
    List<String> input = new ArrayList<>(strings);
    assertArrayEquals(expected.toArray(), functional2.no34(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting noYY({0}) == {1}.")
  @MethodSource({"noYY"})
  void noYY(List<String> strings, List<String> expected) {
    List<String> input = new ArrayList<>(strings);
    assertArrayEquals(expected.toArray(), functional2.noYY(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting two2({0}) == {1}.")
  @MethodSource({"two2"})
  void two2(List<Integer> strings, List<Integer> expected) {
    List<Integer> input = new ArrayList<>(strings);
    assertArrayEquals(expected.toArray(), functional2.two2(input).toArray());
  }

  @ParameterizedTest(name = "[{index}]Asserting square56({0}) == {1}.")
  @MethodSource({"square56"})
  void square56(List<Integer> strings, List<Integer> expected) {
    List<Integer> input = new ArrayList<>(strings);
    assertArrayEquals(expected.toArray(), functional2.square56(input).toArray());
  }

  static Stream<Arguments> noNeg() {
    //Regex to find and replace test cases from codingbat
    // ^\s*noNeg\(\[(.*)\]\).*\[(.*)\]\s*\t*\[.*$
    // Arguments.of(Arrays.asList($1), List.of($2)),
    return Stream.of(
        Arguments.of(Arrays.asList(1, -2), List.of(1)),
        Arguments.of(Arrays.asList(-3, -3, 3, 3), List.of(3, 3)),
        Arguments.of(Arrays.asList(-1, -1, -1), List.of()),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList(0, 1, 2), List.of(0, 1, 2)),
        Arguments.of(Arrays.asList(3, -10, 1, -1, 4, -400), List.of(3, 1, 4)),
        Arguments.of(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5), List.of(3, 1, 5))
    );
  }

  static Stream<Arguments> no9() {
    return Stream.of(
        Arguments.of(Arrays.asList(1, 2, 19), List.of(1, 2)),
        Arguments.of(Arrays.asList(9, 19, 29, 3), List.of(3)),
        Arguments.of(Arrays.asList(1, 2, 3), List.of(1, 2, 3)),
        Arguments.of(Arrays.asList(45, 99, 90, 28, 13, 999, 0), List.of(45, 90, 28, 13, 0)),
        Arguments.of(Arrays.asList(), List.of()),
        Arguments.of(Arrays.asList(9), List.of()),
        Arguments.of(Arrays.asList(0, 9, 0), List.of(0, 0))
    );
  }

  static Stream<Arguments> noZ() {
    return Stream.of(
        Arguments.of(List.of("aaa", "bbb", "aza"), List.of("aaa", "bbb")),
        Arguments.of(List.of("hziz", "hzello", "hi"), List.of("hi")),
        Arguments.of(List.of("hello", "howz", "are", "youz"), List.of("hello", "are")),
        Arguments.of(List.of(), List.of()),
        Arguments.of(List.of(""), List.of("")),
        Arguments.of(List.of("x", "y", "z"), List.of("x", "y"))
    );
  }

  static Stream<Arguments> noLong() {
    return Stream.of(
        Arguments.of(List.of("this", "not", "too", "long"), List.of("not", "too")),
        Arguments.of(List.of("a", "bbb", "cccc"), List.of("a", "bbb")),
        Arguments.of(List.of("cccc", "cccc", "cccc"), List.of()),
        Arguments.of(List.of(), List.of()),
        Arguments.of(List.of(""), List.of("")),
        Arguments.of(List.of("empty", "", "empty"), List.of("")),
        Arguments.of(List.of("a"), List.of("a")),
        Arguments.of(List.of("aaaa", "bbb", "***", "333"), List.of("bbb", "***", "333"))
    );
  }

  static Stream<Arguments> no34() {
    return Stream.of(
        Arguments.of(List.of("a", "bb", "ccc"), List.of("a", "bb")),
        Arguments.of(List.of("a", "bb", "ccc", "dddd"), List.of("a", "bb")),
        Arguments.of(List.of("ccc", "dddd", "apple"), List.of("apple")),
        Arguments.of(List.of("this", "not", "too", "long"), List.of()),
        Arguments.of(List.of("a", "bbb", "cccc", "xx"), List.of("a", "xx")),
        Arguments.of(List.of("dddd", "ddd", "xxxxxxx"), List.of("xxxxxxx")),
        Arguments.of(List.of(), List.of()),
        Arguments.of(List.of(""), List.of("")),
        Arguments.of(List.of("empty", "", "empty"), List.of("empty", "", "empty")),
        Arguments.of(List.of("a"), List.of("a")),
        Arguments.of(List.of("aaaa", "bbb", "*****", "333"), List.of("*****"))
    );
  }

  static Stream<Arguments> noYY() {
    return Stream.of(
        Arguments.of(List.of("a", "b", "c"), List.of("ay", "by", "cy")),
        Arguments.of(List.of("a", "b", "cy"), List.of("ay", "by")),
        Arguments.of(List.of("xx", "ya", "zz"), List.of("xxy", "yay", "zzy")),
        Arguments.of(List.of("xx", "yay", "zz"), List.of("xxy", "zzy")),
        Arguments.of(List.of("yyx", "y", "zzz"), List.of("zzzy")),
        Arguments.of(List.of("hello", "there"), List.of("helloy", "therey")),
        Arguments.of(List.of("ya"), List.of("yay")),
        Arguments.of(List.of(), List.of()),
        Arguments.of(List.of(""), List.of("y")),
        Arguments.of(List.of("xx", "yy", "zz"), List.of("xxy", "zzy"))
    );
  }

  static Stream<Arguments> two2() {
    return Stream.of(
        Arguments.of(List.of(1, 2, 3), List.of(4, 6)),
        Arguments.of(List.of(2, 6, 11), List.of(4)),
        Arguments.of(List.of(0), List.of(0)),
        Arguments.of(List.of(), List.of()),
        Arguments.of(List.of(1, 11, 111, 16), List.of()),
        Arguments.of(List.of(2, 3, 5, 7, 11), List.of(4, 6, 10, 14)),
        Arguments.of(List.of(3, 1, 4, 1, 6, 99, 0), List.of(6, 8, 198, 0))
    );
  }

  static Stream<Arguments> square56() {
    return Stream.of(
        Arguments.of(List.of(3, 1, 4), List.of(19, 11)),
        Arguments.of(List.of(1), List.of(11)),
        Arguments.of(List.of(2), List.of(14)),
        Arguments.of(List.of(3), List.of(19)),
        Arguments.of(List.of(4), List.of()),
        Arguments.of(List.of(5), List.of()),
        Arguments.of(List.of(6), List.of()),
        Arguments.of(List.of(7), List.of(59)),
        Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7), List.of(11, 14, 19, 59)),
        Arguments.of(List.of(3, -1, -4, 1, 5, 9), List.of(19, 11, 11, 91))
    );
  }

}