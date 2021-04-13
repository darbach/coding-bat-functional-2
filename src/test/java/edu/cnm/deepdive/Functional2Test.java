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

  Functional2 functional2 = new Functional2();

  @ParameterizedTest(name = "[{index}]Asserting noNeg({0}) == {1}.")
  @MethodSource({"noNeg"})
  void noNeg(List<Integer> nums, List<Integer> expected) {
    List<Integer> input = new ArrayList<>(nums);
    assertArrayEquals(expected.toArray(), functional2.noNeg(input).toArray());
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

}