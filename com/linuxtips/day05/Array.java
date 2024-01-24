package com.linuxtips.day05;

import java.util.Arrays;
import java.util.List;

public class Array {

    public static void main(String[] args) {

      Integer[] grades = {90, 60, 67, 89};
      int [] periods = new int[6];

      int gradesLength = grades.length;
      System.out.println("Grades length: " + gradesLength);


      List<Integer> gradesApi = Arrays.asList(grades);
      gradesApi.forEach(System.out::println);

      String[] course = new String[]{
        "Curso", 
        "de",
        "Engenharia",
        "de",
        "Software"
      }; 
      String[] courseName = Arrays.copyOfRange(course, 2, 5);
      List<String> courseNameList = List.of(courseName);
      courseNameList.forEach(System.out::println);

      String[] onlyCourseNameCopy = Arrays.copyOf(courseName, 1);
      List.of(onlyCourseNameCopy).forEach(System.out::println);
      
      System.out.println("-----------------------------------------------");
      // Part 2 Arrays
      arrayOtherMethods();
    }

    public static void arrayOtherMethods() {
      Integer[] total = new Integer[10];
      Arrays.fill(total, 40);

      Arrays.asList(total).forEach(System.out::println);

      System.out.println("------------------------------------");

      String[] mathClass = new String[]{"Sarah", "Jonh Doe", "Ana"};
      String[] englishClass = new String[]{"John Doe", "Ana", "Sarah"};
      String[] frenchClass = Arrays.copyOf(mathClass, mathClass.length);

      System.out.println("As turmas de math/english tem alunos iguais? " + Arrays.equals(mathClass, englishClass));
      System.out.println("As turmas de math/french tem alunos iguais? " + Arrays.equals(mathClass, frenchClass));

      System.out.println("------------------------------------");
      Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Integer[] copy = Arrays.copyOf(list, list.length);

      Arrays.sort(copy);

      Arrays.asList(copy).forEach(System.out::println);
    }
  
}
