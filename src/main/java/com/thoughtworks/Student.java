package com.thoughtworks;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private String enrollDateRaw;
    private Date enrollDate;

    public Student(String name, int id, String enrollDateRaw) throws ParseException {
        this.name = name;
        this.id = id;
        this.enrollDateRaw = enrollDateRaw;
        SimpleDateFormat enrollDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        this.enrollDate = enrollDateFormat.parse(enrollDateRaw);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) throws ParseException {
        this.enrollDate = enrollDate;
        SimpleDateFormat enrollDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        this.enrollDate = enrollDateFormat.parse(enrollDateRaw);
    }

    public int calStudyYears() {
        Calendar curCalendar = Calendar.getInstance();
        Calendar enrollCalendar = Calendar.getInstance();
        enrollCalendar.setTime(enrollDate);
        return curCalendar.get(Calendar.YEAR) - enrollCalendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        SimpleDateFormat enrollDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String enrollDateStr = enrollDateFormat.format(enrollDate);
        DecimalFormat decimalFormat = new DecimalFormat("000");
        String idStr = decimalFormat.format(id);
        return "我叫" + name + ", 我的学号是" + idStr + ", "
            + enrollDateStr + "入学, 学龄" + calStudyYears() + "年";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

