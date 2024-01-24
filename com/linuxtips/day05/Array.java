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

    }
  
}
