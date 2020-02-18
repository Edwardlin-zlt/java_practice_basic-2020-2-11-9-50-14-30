package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) throws ParseException {
      Student stuZhangsan = new Student("张三", 1, "2019.02.11");
      Student stuLisi = new Student("李四", 2, "2019.02.10");
      Student stuWangwu = new Student("王五", 1, "2019.02.09");
      Teacher teacher = new Teacher("张龙");
      teacher.addStudent(stuZhangsan);
      teacher.addStudent(stuLisi);
      teacher.addStudent(stuWangwu);
      ArrayList<Student> duplicateStudents = teacher.findDuplicateIds();
      for (Student stu: duplicateStudents) {
          System.out.println(stu);
      }
  }
}
