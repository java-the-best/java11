package java11.javaUtilFunction;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Functions {

  public static void start() {
//    doubleFunction();
//    doubleToIntFunction();
//    doubleToLongFunction();
    doubleUnaryOperator();
//    biFunction();
//    binaryOperator();
//    doubleBinaryOperator();
  }

  private static void doubleFunction() {
    DoubleFunction<String> doubleFunction = (d) -> String.valueOf(d / 2);
    String str = doubleFunction.apply(5);
    System.out.println(str);
  }

  private static void doubleToIntFunction() {
    DoubleToIntFunction doubleToIntFunction = (d) -> (int) d * 50;
    int i = doubleToIntFunction.applyAsInt(4.8);
    System.out.println(i);
  }

  private static void doubleToLongFunction() {
    DoubleToLongFunction doubleToLongFunction = (d) -> ((long) d) * 20_000_000_000L;
    long l = doubleToLongFunction.applyAsLong(4.8);
    System.out.println(l);
  }

  private static void doubleUnaryOperator() {
    DoubleUnaryOperator doubleUnaryOperator = (d) -> d * 4 + 3;
    double d = doubleUnaryOperator.applyAsDouble(7);
    System.out.println(d);
    DoubleUnaryOperator doubleUnaryOperator2 = (d2) -> d2 * 4;
    DoubleUnaryOperator doubleUnaryOperator3 = (d3) -> d3 + 3;
    double d2 = doubleUnaryOperator2.compose(doubleUnaryOperator3).applyAsDouble(7);
    System.out.println(d2);
    double d3 = doubleUnaryOperator2.andThen(doubleUnaryOperator3).applyAsDouble(7);
    System.out.println(d3);
    double d4 = DoubleUnaryOperator.identity().applyAsDouble(7);
    System.out.println(d4);
  }

  private static void biFunction() {
    BiFunction<Integer, Double, String> biFunction = (i, d) -> String.valueOf(i + 2 / d);
    String d = biFunction.apply(2, 2.0);
    System.out.println(d);
    Function<String, Long> function = (str) -> Long.parseLong(str.substring(0, 1));
    Long l = biFunction.andThen(function).apply(2, 2.0);
    System.out.println(l);
  }

  private static void binaryOperator() {
    BinaryOperator<Integer> binaryOperator = (i1, i2) -> i1 + i2;
    Integer d = binaryOperator.apply(2, 2);
    System.out.println(d);
    Function<Integer, String> function = (i) -> i + " и строка";
    String str = binaryOperator.andThen(function).apply(2, 2);
    System.out.println(str);
    BinaryOperator<Integer> bi = BinaryOperator.minBy(Comparator.reverseOrder());
    Integer d2 = bi.apply(5, 9);
    System.out.println(d2);
    BinaryOperator<Integer> bi3 = BinaryOperator.maxBy(Comparator.reverseOrder());
    Integer d3 = bi3.apply(5, 9);
    System.out.println(d3);
  }

  private static void doubleBinaryOperator() {
    DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> d1 / d2;
    double d = doubleBinaryOperator.applyAsDouble(4.4, 2);
    System.out.println(d);
  }
}
