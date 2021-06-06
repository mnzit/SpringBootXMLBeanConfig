package com.mnzit.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class StreamDemo {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Anup");
    names.add("Rnup");
    names.add("Anup");
    names.add("Cnup");
    names.add("Cnup");

    final Stream<String> stringStream = names
      .stream()
      .peek(name -> System.out.println("Before: " + name))
      .map(String::toLowerCase)
      .peek(name -> System.out.println("After: " + name));

    //        System.out.println(stringStream.count());
    //        System.out.println(stringStream.distinct().collect(Collectors.toList()));

    Arrays
      .stream(stringStream.reduce((s, s2) -> s + ":" + s2).get().split(":"))
      .collect(Collectors.toList())
      .forEach(System.out::println);

    final List<String> startWithA = stringStream
      .filter(name -> name.startsWith("a"))
      .collect(Collectors.toList());

    System.out.println(startWithA);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // final Optional<Integer> sum = numbers.stream()
    // .reduce(Integer::sum);

    System.out.println(sum.get());
    //        names = stringStream.collect(Collectors.toList());
  }
}
