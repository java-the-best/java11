package java11.javaUtilFunction;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Suppliers {

  public static void start() {
//    booleanSupplier();
//    intSupplier();
    longSupplier();
//    doubleSupplier();
  }

  public static void booleanSupplier() {
    Date date = new GregorianCalendar(2017, 0, 25).getTime();
    BooleanSupplier booleanSupplier = () -> new Date().before(date);
    boolean b = booleanSupplier.getAsBoolean();
    System.out.println(b);
  }

  public static void intSupplier() {
    IntSupplier intSupplier = () -> (int) (Math.random() * 1000);
    int i = intSupplier.getAsInt();
    System.out.println(i);
  }

  public static void longSupplier() {
    LongSupplier longSupplier = () -> (int) (Math.random() * 100_000L);
    long l = longSupplier.getAsLong();
    System.out.println(l);
  }

  public static void doubleSupplier() {
    DoubleSupplier doubleSupplier = Math::random;
    double d = doubleSupplier.getAsDouble();
    System.out.println(d);
  }
}
