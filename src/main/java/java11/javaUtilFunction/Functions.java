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
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

public class Functions {

  public static void start() {
//    function();
//    intFunction();
//    longFunction();
//    doubleFunction();
//    intToLongFunction();
//    intToDoubleFunction();
//    longToIntFunction();
//    longToDoubleFunction();
//    doubleToIntFunction();
//    doubleToLongFunction();
//    intUnaryOperator();
    longUnaryOperator();
//    doubleUnaryOperator();
//    biFunction();
//    binaryOperator();
//    intBinaryOperator();
//    longBinaryOperator();
//    doubleBinaryOperator();
  }

  private static void function() {
    Function<Integer, String> function = (d) -> String.valueOf(d + 4 - 2);
    String str = function.apply(4);
    System.out.println(str);
    Function<Integer, String> function2 = (d) -> String.valueOf(d + 4);
    Function<String, Integer> function3 = (d) -> Integer.parseInt(d + 2);
    String str2 = function2.compose(function3).apply("4");
    System.out.println(str2);
    Integer i = function2.andThen(function3).apply(4);
    System.out.println(i);
    Function<String, String> function4 = Function.identity();
    String str3 = function4.apply("Привет");
    System.out.println(str3);
  }

  private static void intFunction() {
    IntFunction<String> intFunction = (i) -> String.valueOf(i + 13);
    String str = intFunction.apply(5);
    System.out.println(str);
  }

  private static void longFunction() {
    LongFunction<String> longFunction = (i) -> String.valueOf(i * 2_000_000_000);
    String str = longFunction.apply(5_000);
    System.out.println(str);
  }

  private static void doubleFunction() {
    DoubleFunction<String> doubleFunction = (d) -> String.valueOf(d / 2);
    String str = doubleFunction.apply(5.4);
    System.out.println(str);
  }

  private static void intToLongFunction() {
    IntToLongFunction intToLongFunction = (i) -> (long) i * 2_000_000_000;
    long l = intToLongFunction.applyAsLong(50000);
    System.out.println(l);
  }

  private static void intToDoubleFunction() {
    IntToDoubleFunction intToDoubleFunction = (i) -> (double) i / 7;
    double d = intToDoubleFunction.applyAsDouble(67);
    System.out.println(d);
  }

  private static void longToIntFunction() {
    LongToIntFunction doubleToIntFunction = (d) -> (int) (d / 10_000_000L);
    int i = doubleToIntFunction.applyAsInt(1_000_000_000_000L);
    System.out.println(i);
  }

  private static void longToDoubleFunction() {
    LongToDoubleFunction doubleToDoubleFunction = (d) -> d / 737632.0;
    double d = doubleToDoubleFunction.applyAsDouble(1_000_000_000_000L);
    System.out.println(d);
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

  private static void intUnaryOperator() {
    IntUnaryOperator intUnaryOperator = (i) -> i + 17;
    int i1 = intUnaryOperator.applyAsInt(39);
    System.out.println(i1);
    IntUnaryOperator intUnaryOperator2 = (i) -> i * 5;
    int i2 = intUnaryOperator.compose(intUnaryOperator2).applyAsInt(39);
    System.out.println(i2);
    int i3 = intUnaryOperator.andThen(intUnaryOperator2).applyAsInt(39);
    System.out.println(i3);
    IntUnaryOperator intUnaryOperator3 = IntUnaryOperator.identity();
    int i4 = intUnaryOperator3.applyAsInt(19);
    System.out.println(i4);
  }

  private static void longUnaryOperator() {
    LongUnaryOperator longUnaryOperator = (l) -> l * 50_000_000L;
    long l1 = longUnaryOperator.applyAsLong(300_000);
    System.out.println(l1);
    LongUnaryOperator longUnaryOperator2 = (l) -> l + 25_000L;
    long l2 = longUnaryOperator.compose(longUnaryOperator2).applyAsLong(300_000);
    System.out.println(l2);
    long l3 = longUnaryOperator.andThen(longUnaryOperator2).applyAsLong(300_000);
    System.out.println(l3);
    LongUnaryOperator longUnaryOperator3 = LongUnaryOperator.identity();
    long l4 = longUnaryOperator3.applyAsLong(300_000);
    System.out.println(l4);
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

  private static void intBinaryOperator() {
    IntBinaryOperator intBinaryOperator = (i1, i2) -> i1 * i2;
    int i = intBinaryOperator.applyAsInt(4, 7);
    System.out.println(i);
  }

  private static void longBinaryOperator() {
    LongBinaryOperator longBinaryOperator = (i1, i2) -> i1 * i2;
    long l = longBinaryOperator.applyAsLong(4, 7);
    System.out.println(l);
  }

  private static void doubleBinaryOperator() {
    DoubleBinaryOperator doubleBinaryOperator = (d1, d2) -> d1 / d2;
    double d = doubleBinaryOperator.applyAsDouble(4.4, 2);
    System.out.println(d);
  }
}
