package com.pratyin.poc;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PocApplication {

  public static void main(String[] args) {
    SpringApplication.run(PocApplication.class, args);
    int number = 10;
    System.out.println(number % 3 == 0 && number % 5 == 0 ? "Java Programming"
        : number % 3 == 0 ? "Java" : number % 5 == 0 ? "Programming" : "" + number);
System.out.println("POll GIT");System.out.println("POll GIT");
    System.out.println("POll GIT");
    
    // /

    // for (int i = 0; i < 10; i++) {
    // System.out.println(i);
    // i = 0;
    // }

//     List<String> stringList = List.of("Ankit", "Sonam", "Priya", "Neha", "Ankit");
//     System.out.println(stringList.stream()
//         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

//     Set<Character> charSet = new LinkedHashSet<>();
//     "ankit kumarit".chars().mapToObj(c -> (char) c).collect(Collectors.toList()).stream()
//         .filter(value -> !charSet.add(value)).collect(Collectors.toSet())
//         .forEach(System.out::println);

    // repo.findAll().forEach({ emp->
    // map.put(Employee::getId,emp);
    // });
  }

//   public static String getMessage(String name) {
//     return name.length() >= 10 ? "10 " + name
//         : name.length() > 8 ? "8 " + name
//             : name.length() >= 5 ? "5 " + name : name.length() >= 3 ? "3 " + name : name;
//   }
}
