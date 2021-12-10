package java11.javaUtilFunction;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class Consumers {

  public static void start() {
//    consumer();
//    intConsumer();
    longConsumer();
//    doubleConsumer();
//    biConsumer();
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
}
