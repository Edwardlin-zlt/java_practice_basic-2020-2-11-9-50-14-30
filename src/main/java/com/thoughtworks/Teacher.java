package com.thoughtworks;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> stuList;

    public Teacher(String name) {
        this.name = name;
        stuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public void addStudent(Student stu) {
        stuList.add(stu);
    }

    public ArrayList<Student> findDuplicateIds() {
        ArrayList<Student> duplicateStudents = new ArrayList<>();
        for (int i = 0; i < stuList.size(); i++) {
            for (int j = 0; j < stuList.size(); j++) {
                if (i == j){
                    continue;
                }
                if (stuList.get(i).equals(stuList.get(j))){
                    duplicateStudents.add(stuList.get(i));
                    break;
                }
            }
        }
        return duplicateStudents;
    }
}
