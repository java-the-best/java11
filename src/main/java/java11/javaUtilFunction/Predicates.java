package java11.javaUtilFunction;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class Predicates {

  public static void start() {
    predicate();
//    intPredicate();
//    longPredicate();
//    doublePredicate();
//    biPredicate();
  }

  public static void predicate() {
    Predicate<String> predicate = (str) -> str.length() > 3;
    boolean b = predicate.test("привет");
    System.out.println(b);
    Predicate<String> predicate2 = (str) -> str.length() < 7;
    boolean b2 = predicate.and(predicate2) .test("привет мир");
    System.out.println(b2);
    boolean b3 = predicate.negate().test("привет мир");
    System.out.println(b3);
    boolean b4 = predicate.or(predicate2) .test("привет мир");
    System.out.println(b4);
    Object object = "привет мир";
    boolean b5 = Predicate.isEqual(object).test("привет мир");
    System.out.println(b5);
    boolean b6 = Predicate.not(predicate).test("hi");
    System.out.println(b6);
  }

  public static void intPredicate() {
    IntPredicate intPredicate = (i) -> i > 6;
    boolean b = intPredicate.test(8);
    System.out.println(b);
    IntPredicate intPredicate2 = (i) -> i < 13;
    boolean b2 = intPredicate.and(intPredicate2).test(17);
    System.out.println(b2);
    boolean b3 = intPredicate.negate().test(8);
    System.out.println(b3);
    boolean b4 = intPredicate.or(intPredicate2).test(17);
    System.out.println(b4);
  }

  public static void longPredicate() {
    LongPredicate longPredicate = (i) -> i > 6_000L;
    boolean b = longPredicate.test(16700L);
    System.out.println(b);
    LongPredicate longPredicate2 = (i) -> i < 80_000L;
    boolean b2 = longPredicate.and(longPredicate2) .test(167_000L);
    System.out.println(b2);
    boolean b3 = longPredicate.negate().test(167_000L);
    System.out.println(b3);
    boolean b4 = longPredicate.or(longPredicate2).test(167_000L);
    System.out.println(b4);
  }

  public static void doublePredicate() {
    DoublePredicate doublePredicate = (d) -> d / 2 != 2;
    boolean b = doublePredicate.test(4);
    System.out.println(b);
    DoublePredicate doublePredicate2 = (d) -> d + 5 != 10;
    boolean b2 = doublePredicate.and(doublePredicate2).test(5);
    System.out.println(b2);
    boolean b3 = doublePredicate.negate().test(5);
    System.out.println(b3);
    boolean b4 = doublePredicate.or(doublePredicate2).test(5);
    System.out.println(b4);
  }

  public static void biPredicate() {
    BiPredicate<String, Integer> biPredicate = (str, i) -> str.equals(String.valueOf(i + 3));
    boolean b = biPredicate.test("10", 7);
    System.out.println(b);
    BiPredicate<String, Integer> biPredicate2 = (str, i) -> Integer.parseInt(str) - 3 == i;
    boolean b2 = biPredicate.and(biPredicate2).test("10", 7);
    System.out.println(b2);
    boolean b3 = biPredicate.negate().test("10", 7);
    System.out.println(b3);
    BiPredicate<String, Integer> biPredicate4 = (str, i) -> str.equals(String.valueOf(i));
    boolean b4 = biPredicate.or(biPredicate4).test("10", 10);
    System.out.println(b4);
  }
}
