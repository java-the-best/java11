package java11.javaUtilFunction;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;

public class Predicates {

  public static void start() {
    doublePredicate();
//    biPredicate();
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
