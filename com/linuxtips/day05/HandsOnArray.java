package com.linuxtips.day05;
import java.util.Arrays;
import java.util.List;

public class HandsOnArray {
  public static void main(String[] args) {
    Integer[] ages = { 16, 24, 20, 32, 64, 44, 20 };
    List<Integer> agesList = List.of(ages);
    int totalAges = agesList.size();
    Integer[] last = Arrays.copyOfRange(ages, totalAges / 2, totalAges);
    Integer[] halfAges = Arrays.copyOf(ages, totalAges / 2);
    
    System.out.println("Idade dos alunos 🔢");
    agesList.forEach(System.out::println);

    System.out.println("Idade dos últimos alunos 🙂");
    List.of(last).forEach(System.out::println);

    System.out.println("Idade de metade da turma ✨");
    List.of(halfAges).forEach(System.out::println);



  }
}
