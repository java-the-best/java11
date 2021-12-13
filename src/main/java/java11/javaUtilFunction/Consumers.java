package java11.javaUtilFunction;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class Consumers {

  public static void start() {
//    consumer();
//    intConsumer();
//    longConsumer();
//    doubleConsumer();
//    biConsumer();
//    objIntConsumer();
    objLongConsumer();
//    objDoubleConsumer();
  }

  public static void consumer() {
    Consumer<Integer> consumer = (i) -> System.out.println(i + 13);
    consumer.accept(6);
    Consumer<Integer> consumer2 = (i) -> System.out.print(i + " + 13 = ");
    consumer2.andThen(consumer).accept(6);
  }

  public static void intConsumer() {
    IntConsumer intConsumer = (d) -> System.out.println(d + 9);
    intConsumer.accept(7);
    IntConsumer intConsumer2 = (d) -> System.out.println(d / 2);
    intConsumer.andThen(intConsumer2).accept(7);
  }

  public static void longConsumer() {
    LongConsumer longConsumer = (l) -> System.out.println(l + 9);
    longConsumer.accept(7);
    LongConsumer longConsumer2 = (d) -> System.out.println(d / 2);
    longConsumer.andThen(longConsumer2).accept(7);
  }

  public static void doubleConsumer() {
    DoubleConsumer doubleConsumer = (d) -> System.out.println(d / 2);
    doubleConsumer.accept(7.5);
    DoubleConsumer doubleConsumer2 = (d) -> System.out.println(d * 3);
    doubleConsumer.andThen(doubleConsumer2).accept(7.5);
  }

  public static void biConsumer() {
    BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(
        String.format("Добро пожаловать, %s, в первый зал. Вам %s лет.", name, age));
    biConsumer.accept("Василий", 16);
    BiConsumer<String, Integer> biConsumer2 = (name, age) -> System.out.println(
        String.format("Добро пожаловать, %s, во второй зал. Вам %s лет.", name, age));
    biConsumer.andThen(biConsumer2).accept("Василий", 16);
  }

  public static void objIntConsumer() {
    ObjIntConsumer<String> objIntConsumer = (str, d) -> System.out.println(str + (d + 5.63));
    objIntConsumer.accept("В сумме ", 4);
  }

  public static void objLongConsumer() {
    ObjLongConsumer<String> objLongConsumer = (str, d) -> System.out.println(str + (d + 5.63));
    objLongConsumer.accept("В сумме ", 900L);
  }

  public static void objDoubleConsumer() {
    ObjDoubleConsumer<String> objDoubleConsumer = (str, d) -> System.out.println(str + (d + 5.2));
    objDoubleConsumer.accept("В сумме ", 4.5);
  }
}
