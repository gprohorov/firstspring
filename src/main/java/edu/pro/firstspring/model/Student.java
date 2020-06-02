package edu.pro.firstspring.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private LocalDate birthday;
    private Chair chair;

    public Student() {
    }

    public Student(String name, LocalDate birthday, Chair chair) {
        this.name = name;
        this.birthday = birthday;
        this.chair = chair;
    }

    public Student(String id, String name, LocalDate birthday, Chair chair) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.chair = chair;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId().equals(student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", chair=" + chair +
                '}';
    }
}
