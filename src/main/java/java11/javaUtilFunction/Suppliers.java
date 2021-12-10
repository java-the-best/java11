package java11.javaUtilFunction;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

public class Suppliers {

  public static void start() {
//    booleanSupplier();
    booleanSupplier2();
  }

  public static void booleanSupplier() {
    Date date = new GregorianCalendar(2017, 0 , 25).getTime();
    BooleanSupplier booleanSupplier = () -> new Date().before(date);
    boolean b = booleanSupplier.getAsBoolean();
    System.out.println(b);
  }

  public static void booleanSupplier2() {
    DoubleSupplier doubleSupplier = Math::random;
    double d = doubleSupplier.getAsDouble();
    System.out.println(d);
  }
}
